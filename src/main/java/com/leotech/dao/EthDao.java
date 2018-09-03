package com.leotech.dao;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Eth;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class EthDao extends ExHibernateDaoSupport {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    private static Map<String, EthInfo > devEthCount = null;
    public List<Eth> getAll()
    {
        return (List<Eth>)getHibernateTemplate().find("from " + Eth.class.getName());
    }
    public Eth findByCode(String code){
        Eth eth = new Eth();
        try {
            DetachedCriteria criteria = DetachedCriteria.forClass(Eth.class);
            criteria.add(Restrictions.eq("code", code));
            List<Eth> list = (List<Eth>)getHibernateTemplate().findByCriteria(criteria);
            if (list.size() != 0) {
                eth = list.get(0);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return eth;
    }
    public JSONArray getAll_3d()
    {
        fetchDevEthCount();
        final JSONArray eths = new JSONArray();
        try {
            for (EthInfo info : devEthCount.values()){
                JSONObject eth = new JSONObject();
                eth.put("code", info.code);
                eth.put("peerCode", info.peerId);
                eth.put("fmEthRowCount", info.ethRowCount);
                eth.put("fmEthColCount", info.ethColCount);
                if (info.peerId == null || !devEthCount.containsKey(info.peerId)){
                    continue;
                }
                eth.put("toEthRowCount", devEthCount.get(info.peerId).ethRowCount);
                eth.put("toEthColCount", devEthCount.get(info.peerId).ethColCount);
                eths.add(eth);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return eths;
    }
    public JSONObject getInfo(String fmEthCode, String toEthCode) {
        final JSONObject obj = new JSONObject();
        try {
            String sqlFilter = " where eth.device = device.code and eth.code='" + fmEthCode+"'";
            String strSql = "select eth.name, device.name  from eth,device";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                obj.put("fmDeviceName", result.getString("device.name"));
                obj.put("fmEthName", result.getString("eth.name"));
                }
            });

            sqlFilter = " where eth.device = device.code and eth.code='" + toEthCode +"'";
            strSql = "select eth.name, device.name  from eth,device";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                    obj.put("toDeviceName", result.getString("device.name"));
                    obj.put("toEthName", result.getString("eth.name"));
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return obj;
    }
    private void fetchDevEthCount(){
        try {
            if (devEthCount == null) {
                devEthCount = new HashMap<String, EthInfo>();
            } else {
                devEthCount.clear();
            }
            devEthCount.clear();
            String sqlFilter = " where eth.device = device.code and device.typeid = device_type.id and eth.isShow=1 order by eth.code";
            String strSql = "select eth.code, eth.peerId, device_type.ethRowCount, device_type.ethColCount from eth, device, device_type";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                    EthInfo info = new EthInfo();
                    info.code = result.getString("code");
                    info.peerId = result.getString("peerId");
                    info.ethRowCount = result.getInt("ethRowCount");
                    info.ethColCount = result.getInt("ethColCount");
                    devEthCount.put(info.code, info);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    class EthInfo {
        public String   code;
        public String   peerId;
        public int      ethRowCount;
        public int      ethColCount;
        public EthInfo(){
            this.ethRowCount = 1;
            this.ethColCount = 10;
        }
    }
}

//package com.leotech.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowCallbackHandler;
//import org.springframework.jdbc.core.RowMapper;
//
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSONArray;
//import com.leotech.util.SpringContextUtil;
//
//public class EthDao {
//    private static EthDao _dao = null;
//    public JdbcTemplate jdbcTemplate;
//    private static Map<String, EthInfo > devEthCount = null;
//    private EthDao()
//    {
//        if (null == jdbcTemplate) {
//            jdbcTemplate = (JdbcTemplate) SpringContextUtil.getSpringContext().getBean("jdbcTemplate");
//        }
//
//    }
//    public static synchronized EthDao instance(){
//        if(null == _dao){
//            _dao = new EthDao();
//        }
//        return _dao;
//    }
//    public void fetchDevEthCount(){
//        try {
//            if (devEthCount == null) {
//                devEthCount = new HashMap<String, EthInfo>();
//            } else {
//                devEthCount.clear();
//            }
//            devEthCount.clear();
//            String sqlFilter = " where eth.device = device.code and device.typeid = device_type.uuid and eth.isShow=1 order by eth.code";
//            String strSql = "select eth.code, eth.peerId, device_type.ethRowCount, device_type.ethColCount from eth, device, device_type";
//            strSql += sqlFilter;
//            jdbcTemplate.query(strSql, new RowCallbackHandler(){
//                public void processRow(ResultSet result) throws SQLException {
//                    EthInfo info = new EthInfo();
//                    info.code = result.getString("code");
//                    info.peerId = result.getString("peerId");
//                    info.ethRowCount = result.getInt("ethRowCount");
//                    info.ethColCount = result.getInt("ethColCount");
//                    devEthCount.put(info.code, info);
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//    public JSONArray getAllEth()
//    {
//        fetchDevEthCount();
//        final JSONArray eths = new JSONArray();
//        try {
//            for (EthInfo info : devEthCount.values()){
//                JSONObject eth = new JSONObject();
//                eth.put("code", info.code);
//                eth.put("peerCode", info.peerId);
//                eth.put("fmEthRowCount", info.ethRowCount);
//                eth.put("fmEthColCount", info.ethColCount);
//                if (info.peerId == null || !devEthCount.containsKey(info.peerId)){
//                    continue;
//                }
//                eth.put("toEthRowCount", devEthCount.get(info.peerId).ethRowCount);
//                eth.put("toEthColCount", devEthCount.get(info.peerId).ethColCount);
//                eths.add(eth);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return eths;
//    }
//    public JSONObject getCableInfo(String fmEthCode, String toEthCode) {
//        final JSONObject obj = new JSONObject();
//        try {
//            String sqlFilter = " where eth.device = device.code and eth.code='" + fmEthCode+"'";
//            String strSql = "select eth.name, device.name  from eth,device";
//            strSql += sqlFilter;
//            jdbcTemplate.query(strSql, new RowCallbackHandler(){
//                public void processRow(ResultSet result) throws SQLException {
//                obj.put("fmDeviceName", result.getString("device.name"));
//                obj.put("fmEthName", result.getString("eth.name"));
//                }
//            });
//
//            sqlFilter = " where eth.device = device.code and eth.code='" + toEthCode +"'";
//            strSql = "select eth.name, device.name  from eth,device";
//            strSql += sqlFilter;
//            jdbcTemplate.query(strSql, new RowCallbackHandler(){
//                public void processRow(ResultSet result) throws SQLException {
//                    obj.put("toDeviceName", result.getString("device.name"));
//                    obj.put("toEthName", result.getString("eth.name"));
//                }
//            });
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return obj;
//    }
//    class EthInfo {
//        public String   code;
//        public String   peerId;
//        public int      ethRowCount;
//        public int      ethColCount;
//        public EthInfo(){
//            this.ethRowCount = 1;
//            this.ethColCount = 10;
//        }
//    }
//}
//
