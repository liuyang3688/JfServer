package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.EthDao;
import com.leotech.entity.Eth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EthService {
    @Autowired
    public EthDao dao;

    public List<Eth> getAll() {
        return dao.getAll();
    }
    public JSONArray getAll_3d() {return dao.getAll_3d();}
    public JSONObject getInfo(String fmEthCode, String toEthCode) {
        return dao.getInfo(fmEthCode, toEthCode);
    }
}

//package com.leotech.service;
//
//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;
//import com.leotech.dao.EthDao;
//
//public class EthService {
//    public static JSONArray getAllEth() {
//        return EthDao.instance().getAllEth();
//    }
//    public static JSONObject getCableInfo(String fmEthCode, String toEthCode) {
//        return EthDao.instance().getCableInfo(fmEthCode, toEthCode);
//    }
//}
