package com.leotech.dao;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Cabinet;
import com.leotech.entity.Stats;
import com.leotech.util.SpringContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class StatsDao  extends ExHibernateDaoSupport {
    public List<Stats> getAll()
    {
        return (List<Stats>)getHibernateTemplate().find("from " + Stats.class.getName());
    }
    public void saveOrUpdate(Stats stats) {
        try {
            getHibernateTemplate().saveOrUpdate(stats);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
