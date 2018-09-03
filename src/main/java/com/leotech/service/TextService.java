package com.leotech.service;

import com.leotech.dao.TextDao;
import com.leotech.entity.Text;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TextService {
    @Autowired
    public TextDao dao;

    public List<Text> getAll() {
        return dao.getAll();
    }
}
