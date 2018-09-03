package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.DeviceDao;
import com.leotech.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {
    @Autowired
    public DeviceDao dao;

    public List<Device> getAll() {
        return dao.getAll();
    }
    public JSONArray getAll_3d() {return dao.getAll_3d();}
    public JSONObject getInfo(String devCode) {
        return dao.getInfo(devCode);
    }
}