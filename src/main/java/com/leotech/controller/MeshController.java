package com.leotech.controller;

import java.io.IOException;
import java.util.List;

import com.leotech.entity.*;
import com.leotech.entity.System;
import com.leotech.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("3d")
public class MeshController {
	@Autowired
	private AreaService areaService;
	@Autowired
	private ButtonService buttonService;
	@Autowired
	private CabinetService cabinetService;
	@Autowired
	private CableService cableService;
	@Autowired
	private CloneService cloneService;
	@Autowired
	private DeviceService deviceService;
	@Autowired
	private EthService ethService;
	@Autowired
	private EventService eventService;
	@Autowired
	private LabelService labelService;
	@Autowired
	private MeshService meshService;
	@Autowired
	private PowerService powerService;
    @Autowired
    private TemplateService templateService;
    @Autowired
	private StatsService statsService;
    @Autowired
	private SystemService systemService;
	@RequestMapping("get_all_area")
	public List<Area> getAllArea(Model model){
		return areaService.getAll();
	}
    @RequestMapping("get_all_cable")
	public JSONArray getAllCable() {
		return cableService.getAll_3d();
	}
	@RequestMapping("get_cable_info")
	public JSONObject getCableInfo(@RequestParam String name) {
		return cableService.getInfo(name);
	}
	@RequestMapping("get_some_cable")
	public JSONArray getSomeCable(@RequestParam String prefixCode) {
		return cableService.getSome_3d(prefixCode);
	}
	@RequestMapping("get_all_tpl")
	public JSONArray getAllTpl(HttpServletRequest request, HttpServletResponse response) { return templateService.getAll_3d();}
	@RequestMapping("get_all_event")
	public JSONObject getAllEvent(Model model)
	{
		return eventService.getAll_3d();
	}
	@RequestMapping("get_all_button")
	public List<Button> getAllButton(Model model)
	{
		return buttonService.getAll_3d();
	}
	@RequestMapping("get_all_mesh")
	public JSONArray getAllMesh(Model model)
	{
		return meshService.getAll_3d();
	}
	@RequestMapping("get_all_clone")
	public List<Clone> getAllClone(Model model)
	{
		return cloneService.getAll_3d();
	}
	@RequestMapping("get_all_eth")
	public JSONArray getAllEth(Model model)
	{
		return ethService.getAll_3d();
	}
	@RequestMapping("get_all_device")
	public JSONArray getAllDevice(Model model)
	{
		return deviceService.getAll_3d();
	}
	@RequestMapping("get_all_cabinet")
	public JSONArray getAllCabinet(Model model)
	{
		return cabinetService.getAll_3d();
	}
	@RequestMapping("get_all_system")
	public List<System> getAllSystem(Model model)
	{
		return systemService.getAll_3d();
	}
	@RequestMapping("get_all_power")
	public JSONArray getAllPower(Model model)
	{
		return powerService.getAll_3d();
	}
	@RequestMapping("get_all_label")
	public JSONArray getAllLabel(Model model)
	{
		return labelService.getAll_3d();
	}
	@RequestMapping("get_eth_info")
	public JSONObject getEthInfo(@RequestParam String fmEthCode, @RequestParam String toEthCode) {
		return ethService.getInfo(fmEthCode, toEthCode);
	}
	@RequestMapping("get_device_info")
	public JSONObject getDeviceInfo(@RequestParam String devCode)
	{
		return deviceService.getInfo(devCode);
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
}
