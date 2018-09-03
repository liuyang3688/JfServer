package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.leotech.dao.MeshDao;
import com.leotech.entity.Mesh;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MeshService {
	@Autowired
	public MeshDao dao;

	public List<Mesh> getAll() {
		return dao.getAll();
	}
	public JSONArray getAll_3d() { return dao.getAll_3d(); }
}

//package com.leotech.service;
//
//import java.util.List;
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.leotech.dao.MeshDao;
//
//public class MeshService {
//	public static JSONArray getAllTpl() {
//		return MeshDao.instance().getAllTpl();
//	}
//	public static List<JSONObject> getAllMesh() {
//		return MeshDao.instance().getAllMesh();
//	}
//	public static Boolean updateIsDirty(int uuid){
//		Boolean isDirty = false;
//		return MeshService.updateIsDirty(uuid, isDirty);
//	}
//	public static Boolean updateIsDirty(int uuid, Boolean isDirty){
//		return MeshDao.instance().updateIsDirty(uuid, isDirty);
//	}
//	public static Boolean updateIsDirty_All(){
//		Boolean isDirty = true;
//		return MeshService.updateIsDirty_All(isDirty);
//	}
//	public static Boolean updateIsDirty_All(Boolean isDirty){
//		return MeshDao.instance().updateIsDirty_All(isDirty);
//	}
//}
