package com.leotech.service;

import com.leotech.dao.StatsDao;
import com.leotech.entity.Stats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StatsService {
    @Autowired
    private StatsDao dao;

    public List<Stats> getAll() {
        return dao.getAll();
    }
}
