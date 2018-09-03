package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.leotech.dao.PowerDao;
import com.leotech.entity.Power;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PowerService {
    @Autowired
    public PowerDao dao;

    public List<Power> getAll() {
        return dao.getAll();
    }
    public JSONArray getAll_3d() { return dao.getAll_3d(); }
}
