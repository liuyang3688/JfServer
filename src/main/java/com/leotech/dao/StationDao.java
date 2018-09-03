package com.leotech.dao;


import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Station;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class StationDao extends ExHibernateDaoSupport {
    public List<Station> getAll()
    {
        return (List<Station>)getHibernateTemplate().find("from " + Station.class.getName());
    }

    public JSONObject saveOne(Station station) {
        JSONObject object = new JSONObject();
        try{
            getHibernateTemplate().save(station);
        } catch (Exception e) {
            object.put("errorMsg", e.getMessage());
            return object;
        }
        return object;
    }
    public JSONObject deleteSome(List<Station> list) {
        JSONObject object = new JSONObject();
        try{
            getHibernateTemplate().deleteAll(list);
        } catch (Exception e) {
            object.put("errorMsg", e.getMessage());
            return object;
        }
        return object;
    }
}