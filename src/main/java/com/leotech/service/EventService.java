package com.leotech.service;

import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.EventDao;
import com.leotech.entity.Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventService {
	@Autowired
	public EventDao dao;

	public List<Event> getAll() {
		return dao.getAll();
	}
	public JSONObject getAll_3d() { return dao.getAll_3d();}
}

//package com.leotech.service;
//
//
//import com.alibaba.fastjson.JSONObject;
//import com.leotech.dao.EventDao;
//
//public class EventService {
//	public static JSONObject getAllEvent() {
//		return EventDao.instance().getAllEvent();
//	}
//}