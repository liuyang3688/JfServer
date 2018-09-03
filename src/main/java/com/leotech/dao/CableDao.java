package com.leotech.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Area;
import com.leotech.entity.Cable;
import com.leotech.entity.Device;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class CableDao extends ExHibernateDaoSupport {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static Map<String, EthInfo > mapEthInfo = null;
    public JSONArray getSome_3d(String prefixCode) {
        JSONArray array = new JSONArray();
        fetchDevEthCount();
        try {
            List<Cable> list = getAll();
            for (Cable cable: list) {
                if (cable.fmCode.indexOf(prefixCode) == 0 || cable.toCode.indexOf(prefixCode) == 0) {
                    JSONObject obj = new JSONObject();
                    obj.put("id", cable.id);
                    obj.put("name", cable.name);
                    obj.put("fmCode", cable.fmCode);
                    if (mapEthInfo.containsKey(cable.fmCode)) {
                        EthInfo eth = mapEthInfo.get(cable.fmCode);
                        obj.put("fmEthRowCount", eth.ethRowCount);
                        obj.put("fmEthColCount", eth.ethColCount);
                    } else {
                        obj.put("fmEthRowCount", 1);
                        obj.put("fmEthColCount", 10);
                    }
                    obj.put("toCode", cable.toCode);
                    if (mapEthInfo.containsKey(cable.toCode)) {
                        EthInfo eth = mapEthInfo.get(cable.toCode);
                        obj.put("toEthRowCount", eth.ethRowCount);
                        obj.put("toEthColCount", eth.ethColCount);
                    } else {
                        obj.put("toEthRowCount", 1);
                        obj.put("toEthColCount", 10);
                    }
                    array.add(obj);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }
    public JSONArray getAll_3d() {
        // 首先根据code取查eth 然后读取device 去查device中的网口数行列
        JSONArray array = new JSONArray();
        fetchDevEthCount();
        try {
            List<Cable> list = getAll();
            for (Cable cable: list) {
                JSONObject obj = new JSONObject();
                obj.put("id", cable.id);
                obj.put("name", cable.name);
                obj.put("fmCode", cable.fmCode);
                if (mapEthInfo.containsKey(cable.fmCode)) {
                    EthInfo eth = mapEthInfo.get(cable.fmCode);
                    obj.put("fmEthRowCount", eth.ethRowCount);
                    obj.put("fmEthColCount", eth.ethColCount);
                } else {
                    obj.put("fmEthRowCount", 1);
                    obj.put("fmEthColCount", 10);
                }
                obj.put("toCode", cable.toCode);
                if (mapEthInfo.containsKey(cable.toCode)) {
                    EthInfo eth = mapEthInfo.get(cable.toCode);
                    obj.put("toEthRowCount", eth.ethRowCount);
                    obj.put("toEthColCount", eth.ethColCount);
                } else {
                    obj.put("toEthRowCount", 1);
                    obj.put("toEthColCount", 10);
                }
                array.add(obj);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return array;
    }
    private void fetchDevEthCount(){
        try {
            if (mapEthInfo == null) {
                mapEthInfo = new HashMap<String, EthInfo>();
            } else {
                mapEthInfo.clear();
            }
            String sqlFilter = " where eth.device = device.code and device.typeid = device_type.id and eth.isShow=1 order by eth.code";
            String strSql = "select eth.code, device_type.ethRowCount, device_type.ethColCount from eth, device, device_type";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                    EthInfo info = new EthInfo();
                    info.code = result.getString("code");
                    info.ethRowCount = result.getInt("ethRowCount");
                    info.ethColCount = result.getInt("ethColCount");
                    mapEthInfo.put(info.code, info);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public List<Cable> getAll()
    {
        return (List<Cable>)getHibernateTemplate().find("from " + Cable.class.getName());
    }
    public JSONObject saveOne(Cable cable) {
        JSONObject obj = new JSONObject();
        try {
            getHibernateTemplate().save(cable);
        } catch (Exception e){
            obj.put("errorMsg", e.getMessage());
            return obj;
        }
        return obj;
    }
    public JSONObject deleteSome(List<Cable> list) {
        JSONObject obj = new JSONObject();
        try {
            getHibernateTemplate().deleteAll(list);
        } catch (Exception e){
            obj.put("errorMsg", e.getMessage());
            return obj;
        }
        return obj;
    }
    public Cable findByName(String name) {
        Cable cable = new Cable();
        try{
            cable.name = name;
            List<Cable> list = getHibernateTemplate().findByExample(cable);
            if (list.size() != 0) {
                cable = list.get(0);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return cable;
    }
//    public JSONObject getInfo(String name) {
//        JSONObject obj = new JSONObject();
//        try{
//            Cable cable = this.findByName(name);
//            Device fmDevice = deviceDao.findByCode(cable.fmDevice);
//            Device toDevice = deviceDao.findByCode(cable.toDevice);
//
//            cable.fmDevice;
//        } catch (Exception e){
//            e.printStackTrace();
//        }
//        return obj;
//    }
    class EthInfo {
        public String code;
        public int ethRowCount;
        public int ethColCount;
    }
}

