package com.leotech.dao;

import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Text;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TextDao extends ExHibernateDaoSupport {
    public List<Text> getAll()
    {
        return (List<Text>)getHibernateTemplate().find("from " + Text.class.getName());
    }
}