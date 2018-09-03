package com.leotech.controller;

import java.io.IOException;
import java.util.List;

import com.leotech.entity.Button;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.leotech.service.ButtonService;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("button")
public class ButtonController {
//	@Autowired
//	private ButtonService buttonService;
//
//	@RequestMapping("get_all_btn")
//	@ResponseBody
//	public List<Button> getAllBtn(Model model)
//	{
//		return buttonService.getAllButton();
//	}
}