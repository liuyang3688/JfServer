package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.CabinetDao;
import com.leotech.dao.CableDao;
import com.leotech.dao.DeviceDao;
import com.leotech.dao.EthDao;
import com.leotech.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CableService {
    @Autowired
    private CabinetDao cabinetDao;
    @Autowired
    private DeviceDao deviceDao;
    @Autowired
    private EthDao ethDao;
    @Autowired
    private CableDao cableDao;
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public JSONArray getSome_3d(String prefixCode) { return cableDao.getSome_3d(prefixCode); }
    public JSONArray getAll_3d() { return cableDao.getAll_3d(); }
    public List<Cable> getAll() {
        return cableDao.getAll();
    }
    public JSONObject saveOne(Cable cable) {
        return cableDao.saveOne(cable);
    }
    public JSONObject deleteSome(List<Cable> list) {
        return cableDao.deleteSome(list);
    }
    public JSONObject getInfo(String name) {
        JSONObject cableInfo = new JSONObject();
        try{
            Cable cable = cableDao.findByName(name);
            String fmCabCode = cable.fmDevice.substring(0,3);
            String toCabCode = cable.toDevice.substring(0,3);
            Cabinet fmCabinet = cabinetDao.findByCode(fmCabCode);
            Cabinet toCabinet = cabinetDao.findByCode(toCabCode);
            Device fmDevice = deviceDao.findByCode(cable.fmDevice);
            Device toDevice = deviceDao.findByCode(cable.toDevice);
            Eth fmEth = ethDao.findByCode(cable.fmCode);
            Eth toEth = ethDao.findByCode(cable.toCode);
            int numRow = 0;
            JSONArray array = new JSONArray();
            JSONObject obj = new JSONObject();
            obj.put("name", "起始机柜");
            obj.put("value", fmCabinet.name);
            array.add(obj);
            numRow++;
            obj = new JSONObject();
            obj.put("name", "起始设备");
            obj.put("value", fmDevice.name);
            array.add(obj);
            numRow++;
            obj = new JSONObject();
            obj.put("name", "起始网口");
            obj.put("value", fmEth.name);
            array.add(obj);
            numRow++;
            obj = new JSONObject();
            obj.put("name", "对端机柜");
            obj.put("value", toCabinet.name);
            array.add(obj);
            numRow++;
            obj = new JSONObject();
            obj.put("name", "对端设备");
            obj.put("value", toDevice.name);
            array.add(obj);
            numRow++;
            obj = new JSONObject();
            obj.put("name", "对端网口");
            obj.put("value", toEth.name);
            array.add(obj);
            numRow++;
            cableInfo.put("total", 6);
            cableInfo.put("rows", array);
        } catch (Exception e){
            e.printStackTrace();
        }
        return cableInfo;
    }
}
