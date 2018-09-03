package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.leotech.dao.TemplateDao;
import com.leotech.entity.Template;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TemplateService {
    @Autowired
    public TemplateDao dao;

    public List<Template> getAll() {
        return dao.getAll();
    }
    public JSONArray getAll_3d() {
        return dao.getAll_3d();
    }
}