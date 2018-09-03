package com.leotech.service;

import com.leotech.dao.MaterialDao;
import com.leotech.entity.Material;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaterialService {
    @Autowired
    public MaterialDao dao;

    public List<Material> getAll() {
        return dao.getAll();
    }
}
