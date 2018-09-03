package com.leotech.controller;

import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.leotech.entity.*;
import com.leotech.entity.System;
import com.leotech.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("model")
public class ModelController {
    @Autowired
    private AreaService areaService;
    @Autowired
    private ButtonService buttonService;
    @Autowired
    private CableService cableService;
    @Autowired
    private CabinetService cabinetService;
    @Autowired
    private CloneService cloneService;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private DeviceTypeService deviceTypeService;
    @Autowired
    private EthService ethService;
    @Autowired
    private EventService eventService;
    @Autowired
    private LabelService labelService;
    @Autowired
    private MaterialService materialService;
    @Autowired
    private MeshService meshService;
    @Autowired
    private PowerService powerService;
    @Autowired
    private StationService stationService;
    @Autowired
    private StatsService statsService;
    @Autowired
    private SystemService systemService;
    @Autowired
    private TemplateService templateService;
    @Autowired
    private TextService textService;
    // Area
    @RequestMapping("get_all_area")
    public List<Area> getAllArea(Model model){
		return areaService.getAll();
    }
    @RequestMapping("save_one_area")
    public JSONObject saveOneArea(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        Area area = new Area();
        area.name = request.getParameter("name");
        area.staId = Integer.parseInt(request.getParameter("staId"));
        area.memo = request.getParameter("memo");
        return areaService.saveOne(area);
    }
    @RequestMapping("delete_some_area")
    public JSONObject deleteSomeArea(HttpServletRequest request) {
        Gson gson = new Gson();
        String rows = request.getParameter("rows");
        List<Area> list = gson.fromJson(rows, new TypeToken<List<Area>>(){}.getType());
        return areaService.deleteSome(list);
    }
    // Button
    @RequestMapping("get_all_button")
    public List<Button> getAllButton(Model model){
        return buttonService.getAll();
    }
    // Cable
    @RequestMapping("get_all_cable")
    public List<Cable> getAllCable(Model model){
        return cableService.getAll();
    }
    // Cabinet
    @RequestMapping("get_all_cabinet")
    public List<Cabinet> getAllCabinet(Model model){
        return cabinetService.getAll();
    }
    // Clone
    @RequestMapping("get_all_clone")
    public List<Clone> getAllClone(Model model){
        return cloneService.getAll();
    }
    // Device
    @RequestMapping("get_all_device")
    public List<Device> getAllDevice(Model model){
        return deviceService.getAll();
    }
    // DeviceType
    @RequestMapping("get_all_device_type")
    public List<DeviceType> getAllDeviceType(Model model){
        return deviceTypeService.getAll();
    }
    // Eth
    @RequestMapping("get_all_eth")
    public List<Eth> getAllEth(Model model){
        return ethService.getAll();
    }
    // Event
    @RequestMapping("get_all_event")
    public List<Event> getAllEvent(Model model){
        return eventService.getAll();
    }
    // Label
    @RequestMapping("get_all_label")
    public List<Label> getAllLabel(Model model){
        return labelService.getAll();
    }
    // Material
    @RequestMapping("get_all_material")
    public List<Material> getAllMaterial(Model model){
        return materialService.getAll();
    }
    // Mesh
    @RequestMapping("get_all_mesh")
    public List<Mesh> getAllMesh(Model model){
        return meshService.getAll();
    }
    // Power
    @RequestMapping("get_all_power")
    @ResponseBody
    public List<Power> getAllPower(Model model){
        return powerService.getAll();
    }
    // Station
    @RequestMapping("get_all_station")
    public List<Station> getAllStation(Model model){
        return stationService.getAll();
    }
    @RequestMapping("save_one_station")
    public JSONObject saveOneStation(HttpServletRequest request) {
        JSONObject obj = new JSONObject();
        Station station = new Station();
        station.code = request.getParameter("code");
        station.name = request.getParameter("name");
        station.memo = request.getParameter("memo");
        java.lang.System.out.println(station.code+station.name);
        return stationService.saveOne(station);
    }
    @RequestMapping("delete_some_station")
    public JSONObject deleteSomeStation(HttpServletRequest request) {
        Gson gson = new Gson();
        String rows = request.getParameter("rows");
        List<Station> list = gson.fromJson(rows, new TypeToken<List<Station>>(){}.getType());
        return stationService.deleteSome(list);
    }
    // Stats-space
    @RequestMapping("get_all_stats_space")
    public List<Stats> getAllStatsSpace(Model model){
        return statsService.getAll();
    }
    // Stats-load
    @RequestMapping("get_all_stats_load")
    public List<Stats> getAllStatsLoad(Model model){
        return statsService.getAll();
    }
    // System
    @RequestMapping("get_all_system")
    public List<System> getAllSystem(Model model){
        return systemService.getAll();
    }
    // Template
    @RequestMapping("get_all_template")
    public List<Template> getAllTemplate(Model model){
        return templateService.getAll();
    }
    // Text
    @RequestMapping("get_all_text")
    public List<Text> getAllText(Model model){
        return textService.getAll();
    }
}
