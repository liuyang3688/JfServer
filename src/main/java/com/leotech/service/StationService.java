package com.leotech.service;

import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.StationDao;
import com.leotech.entity.Station;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StationService {
    @Autowired
    public StationDao dao;

    public List<Station> getAll() {
        return dao.getAll();
    }
    public JSONObject saveOne(Station station){
        return dao.saveOne(station);
    }
    public JSONObject deleteSome(List<Station> list){
        return dao.deleteSome(list);
    }
}
