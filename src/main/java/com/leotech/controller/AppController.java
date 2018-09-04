package com.leotech.controller;

import com.alibaba.fastjson.JSONObject;
import com.leotech.entity.*;
import com.leotech.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("app")
public class AppController {
    @Autowired
    private AreaService areaService;
    @Autowired
    private SystemService systemService;
    @Autowired
    private CabinetService cabinetService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private EthService ethService;
    @Autowired
    private CableService cableService;
    @Autowired
    private PowerService powerService;
    @Autowired
    private StatsService statsService;
    @RequestMapping("get_rt_data")
    public void getRtData(HttpServletRequest request, HttpServletResponse response)
    {
        JSONObject datas = new JSONObject();

        String strBjlx = request.getParameter("bjlx");
        String strBjid = request.getParameter("bjid");

        // type 获取类型，type=0:取所有类型 type=1:取某一类型 type=2:取某一类型的某一ID
        int type = 0, bjlx=0, bjid=0;
        if (strBjlx == null || strBjlx.isEmpty()) {
            // 未指定不见类型，则取所有类型
            type = 0;
        } else if(strBjid == null || strBjid.isEmpty()) {
            // 指定类型，未指定ID
            bjlx = Integer.parseInt(strBjlx);
            type = 1;
        } else {
            // 指定类型，指定ID
            bjlx = Integer.parseInt(strBjlx);
            bjid = Integer.parseInt(strBjid);
            type = 2;
        }

        switch (type) {
            case (int)0:
                datas = RedisService.getRtData();
                break;
            case (int)1:
                datas = RedisService.getRtData(bjlx);
                break;
            case (int)2:
                datas = RedisService.getRtData(bjlx, bjid);
                break;
            default:
                java.lang.System.out.println("rt/get_rt_data: type out of range.");
                break;
        }

        try {
            response.getWriter().print(datas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("mock_rt_data")
    public void mockRtData(HttpServletRequest request, HttpServletResponse response) {
        RedisService.mockRtData();
        try {
            response.getWriter().print("");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("load_bjcs_label")
    public void loadBjcsLabel(HttpServletRequest request, HttpServletResponse response) {
        JSONObject obj = RedisService.loadBjcsLabel();
        try {
            response.getWriter().print(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @RequestMapping("load_area")
    public List<Area> loadArea()
    {
        return areaService.getAll();
    }
    @RequestMapping("load_system")
    public List<com.leotech.entity.System> loadSystem()
    {
        return systemService.getAll();
    }

    @RequestMapping("load_cabinet")
    public List<Cabinet> loadCabinet()
    {
        return cabinetService.getAll();
    }

    @RequestMapping("load_device")
    public List<Device> loadDevice()
    {
        return deviceService.getAll();
    }

    @RequestMapping("load_eth")
    public List<Eth> loadEth()
    {
        return ethService.getAll();
    }

    @RequestMapping("load_cable")
    public List<Cable> loadCable()
    {
        return cableService.getAll();
    }

    @RequestMapping("load_power")
    public List<Power> loadPower()
    {
        return powerService.getAll();
    }

    @RequestMapping("load_stats_space")
    public List<Stats> loadStatsSpace()
    {
        return statsService.getAll();
    }
    @RequestMapping("load_stats_load")
    public List<Stats> loadStatsLoad()
    {
        return statsService.getAll();
    }
}
