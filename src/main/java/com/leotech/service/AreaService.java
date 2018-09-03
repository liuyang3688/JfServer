package com.leotech.service;

import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.AreaDao;
import com.leotech.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AreaService {
    @Autowired
    public AreaDao dao;

    public List<Area> getAll() {
        return dao.getAll();
    }
    public JSONObject saveOne(Area area) {
        return dao.saveOne(area);
    }
    public JSONObject deleteSome(List<Area> list) {
        return dao.deleteSome(list);
    }
}
