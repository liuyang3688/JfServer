package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.leotech.dao.CabinetDao;
import com.leotech.entity.Cabinet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CabinetService {
    @Autowired
    public CabinetDao dao;

    public List<Cabinet> getAll() {
        return dao.getAll();
    }
    public JSONArray getAll_3d() { return dao.getAll_3d(); }
}
