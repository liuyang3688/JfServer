package com.leotech.service;

import com.leotech.dao.DeviceTypeDao;
import com.leotech.entity.DeviceType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceTypeService {
    @Autowired
    public DeviceTypeDao dao;

    public List<DeviceType> getAll() {
        return dao.getAll();
    }
}