package com.leotech.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Cabinet;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.criterion.CriteriaQuery;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.hibernate.engine.spi.TypedValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class CabinetDao extends ExHibernateDaoSupport {
    @Autowired
    private JdbcTemplate jdbcTemplate;
    public List<Cabinet> getAll()
    {
        return (List<Cabinet>)getHibernateTemplate().find("from " + Cabinet.class.getName());
    }
    public Cabinet findByCode(String code) {
        Cabinet cabinet = new Cabinet();
        try {
            DetachedCriteria criteria = DetachedCriteria.forClass(Cabinet.class);
            criteria.add(Restrictions.eq("code", code));
            List<Cabinet> list = (List<Cabinet>)getHibernateTemplate().findByCriteria(criteria);
            if (list.size() != 0){
                cabinet = list.get(0);
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return cabinet;
    }
    public JSONArray getAll_3d()
    {
        final JSONArray cabs = new JSONArray();
        try {
            String sqlFilter = " where cabinet.areaId=area.id and cabinet.systemId=system.id";
            String strSql = "select cabinet.code,cabinet.areaId,cabinet.systemId,area.name,system.name from cabinet, area, system";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                    JSONObject cab = new JSONObject();
                    cab.put("code", result.getString("code"));
                    cab.put("areaId", result.getInt("areaId"));
                    cab.put("systemId", result.getInt("systemId"));
                    cab.put("areaName", result.getString("area.name"));
                    cab.put("systemName", result.getString("system.name"));
                    cabs.add(cab);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cabs;
    }
    public JSONArray getAll_Conj()
    {
        final JSONArray cabs = new JSONArray();
        try {
            String sqlFilter = " where cabinet.areaId=area.id and cabinet.systemId=system.id";
            String strSql = "select cabinet.code,cabinet.name, cabinet.capacity, cabinet.areaId,cabinet.systemId,area.name,system.name from cabinet, area, system";
            strSql += sqlFilter;
            jdbcTemplate.query(strSql, new RowCallbackHandler(){
                public void processRow(ResultSet result) throws SQLException {
                    JSONObject cab = new JSONObject();
                    cab.put("code", result.getString("code"));
                    cab.put("name", result.getString("name"));
                    cab.put("capacity", result.getDouble("capacity"));
                    cab.put("areaId", result.getInt("areaId"));
                    cab.put("systemId", result.getInt("systemId"));
                    cab.put("areaName", result.getString("area.name"));
                    cab.put("systemName", result.getString("system.name"));
                    cabs.add(cab);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
        return cabs;
    }
}