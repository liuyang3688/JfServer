package com.leotech.service;

import com.leotech.dao.CloneDao;
import com.leotech.entity.Clone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CloneService {
    @Autowired
    public CloneDao dao;

    public List<Clone> getAll() {
        return dao.getAll();
    }
    public List<Clone> getAll_3d() {
        return dao.getAll();
    }
}


//package com.leotech.service;
//
//import java.util.List;
//
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSONArray;
//import com.leotech.dao.*;
//
//public class CloneService {
//    public static List<JSONObject> getAllClone() {
//        return CloneDao.instance().getAllClone();
//    }
//    public static JSONArray getAllDevice() {
//        return DeviceDao.instance().getAllDevice();
//    }
//    public static JSONArray getAllCab() { return CabDao.instance().getAllCab();}
//    public static JSONArray getAllArea() { return new JSONArray();}
//    public static JSONArray getAllSys() { return SysDao.instance().getAllSys();}
//    public static JSONArray getAllPower() { return PowerDao.instance().getAllPower();}
//    public static Boolean updateIsDirty(int uuid){
//        Boolean isDirty = false;
//        return CloneService.updateIsDirty(uuid, isDirty);
//    }
//    public static Boolean updateIsDirty(int uuid, Boolean isDirty){
//        return CloneDao.instance().updateIsDirty(uuid, isDirty);
//    }
//    public static Boolean updateIsDirty_All(){
//        Boolean isDirty = true;
//        return CloneService.updateIsDirty_All(isDirty);
//    }
//    public static Boolean updateIsDirty_All(Boolean isDirty){
//        return CloneDao.instance().updateIsDirty_All(isDirty);
//    }
//}