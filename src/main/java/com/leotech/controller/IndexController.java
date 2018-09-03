package com.leotech.controller;

import java.io.IOException;
import java.util.List;

//import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.support.odps.udf.CodecCheck;

import com.leotech.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.leotech.entity.Area;
import com.leotech.entity.System;

@Controller
public class IndexController {
    @Autowired
    public AreaService areaService;
	@Autowired
	public SystemService systemService;
	@RequestMapping("test")
	public void test(HttpServletRequest request, HttpServletResponse response)
	{
		try {
			response.getWriter().print("Hello");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	@RequestMapping("index")
	public String index(Model model)
	{
		model.addAttribute("title", "首页");
		return "index";
	}
	@RequestMapping("3d")
	public String show3d(Model model)
	{
		return "3d";
	}

    @RequestMapping("model")
    public String model(Model model){
		return "model";
    }
	@RequestMapping("app")
	public String system(Model model){
		return "app";
	}
}
