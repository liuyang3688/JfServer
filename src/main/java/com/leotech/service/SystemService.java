package com.leotech.service;

import com.leotech.dao.SystemDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.leotech.entity.System;
import java.util.List;

@Service
public class SystemService {
    @Autowired
    private SystemDao dao;

    public List<System> getAll() {
        return dao.getAll();
    }
    public List<System> getAll_3d() {
        return dao.getAll();
    }
}

