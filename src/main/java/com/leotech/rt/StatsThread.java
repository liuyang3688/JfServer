package com.leotech.rt;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.CabinetDao;
import com.leotech.dao.DeviceDao;
import com.leotech.dao.StatsDao;
import com.leotech.entity.Device;
import com.leotech.entity.Stats;
import com.leotech.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

public class StatsThread implements Runnable {
    private DeviceDao deviceDao;
    private CabinetDao cabinetDao;
    private StatsDao statsDao;
    public void run() {
        while(true) {
            try{
            if (deviceDao == null) {
                deviceDao = (DeviceDao)SpringContextUtil.getSpringContext().getBean("deviceDao");
            }
            if (cabinetDao == null) {
                cabinetDao = (CabinetDao)SpringContextUtil.getSpringContext().getBean("cabinetDao");
            }
            if (statsDao == null) {
                statsDao = (StatsDao)SpringContextUtil.getSpringContext().getBean("statsDao");
            }
            if (deviceDao != null && cabinetDao != null && statsDao != null) {
                // 开始统计
                List<Device> listDevice = deviceDao.getAll();
                JSONArray listCabinet = cabinetDao.getAll_Conj();
                Map<String, JSONObject> mapCabInfo = new HashMap<>();
                for (int i=0; i<listCabinet.size(); ++i) {
                    JSONObject obj = (JSONObject) listCabinet.get(i);
                    mapCabInfo.put(obj.getString("code"), obj);
                }
                Map<String, ArrayList<Device>> map = new LinkedHashMap<String, ArrayList<Device>>();
                for (Device device: listDevice) {
                    if (!map.containsKey(device.cabinet)) {
                        ArrayList<Device> innerListDevice = new ArrayList<Device>();
                        map.put(device.cabinet, innerListDevice);
                    }
                    map.get(device.cabinet).add(device);
                }
                for(String key : map.keySet()){
                    JSONObject cabInfo = mapCabInfo.get(key);
                    // 遍历当前机柜
                    List<Device> devices = map.get(key);
                    Stats stats = new Stats();
                    stats.name = key;
                    stats.cabName = cabInfo.getString("name");
                    stats.totalU = 42;
                    stats.totalCap = cabInfo.getDouble("capacity");
                    stats.areaId = cabInfo.getInteger("areaId");
                    stats.areaName = cabInfo.getString("areaName");
                    stats.systemId = cabInfo.getInteger("systemId");
                    stats.systemName = cabInfo.getString("systemName");
                    stats.maxConsU = 0;
                    for (int i=0; i<devices.size(); ++i) {
                        Device device = devices.get(i);
                        int usedU = Integer.parseInt(device.code.substring(5,7));
                        stats.usedU += usedU;
                        stats.usedCap += device.capacity;

                        // 判断最大U
                        String last = "0100";
                        if (i != 0) {
                            last = devices.get(i-1).code.substring(3);
                        }
                        String curr = device.code.substring(3);
                        int lastStartU = Integer.parseInt(last.substring(0,2));
                        int lastUsedU = Integer.parseInt(last.substring(2,4));
                        int currStartU = Integer.parseInt(curr.substring(0,2));
                        if (lastStartU + lastUsedU > currStartU) {
                            System.out.println("lastStartU + lastUsedU >= currStartU error currDev:" + device.code);
                        } else {
                            int spanU = currStartU - (lastStartU + lastUsedU);
                            if(spanU > stats.maxConsU) {
                                stats.maxConsU = spanU;
                            }
                        }
                    }
                    stats.remainU = stats.totalU - stats.usedU;
                    stats.remainCap = stats.totalCap - stats.usedCap;
                    stats.spaceRatio = stats.usedU * 100.0 / stats.totalU;
                    stats.loadRatio = stats.usedCap * 100.0 / stats.totalCap;
                    statsDao.saveOrUpdate(stats);
                }
            }
            Thread.sleep(60*1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
