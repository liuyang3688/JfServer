package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.leotech.dao.LabelDao;
import com.leotech.entity.Label;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabelService {
	@Autowired
	public LabelDao dao;

	public List<Label> getAll() {
		return dao.getAll();
	}
	public JSONArray getAll_3d() { return dao.getAll_3d(); }
}

//package com.leotech.service;
//
//import java.util.List;
//
//import com.alibaba.fastjson.JSONObject;
//import com.leotech.dao.LabelDao;
//
//public class LabelService {
//	public static List<JSONObject> getAllLabel() {
//		return LabelDao.instance().getAllLabel();
//	}
//	public static Boolean updateIsDirty(int uuid){
//		Boolean isDirty = false;
//		return LabelService.updateIsDirty(uuid, isDirty);
//	}
//	public static Boolean updateIsDirty(int uuid, Boolean isDirty){
//		return LabelDao.instance().updateIsDirty(uuid, isDirty);
//	}
//	public static Boolean updateIsDirty_All(){
//		Boolean isDirty = true;
//		return LabelService.updateIsDirty_All(isDirty);
//	}
//	public static Boolean updateIsDirty_All(Boolean isDirty){
//		return LabelDao.instance().updateIsDirty_All(isDirty);
//	}
//}