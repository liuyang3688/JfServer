package com.leotech.dao;

import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.System;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SystemDao extends ExHibernateDaoSupport {
    public List<System> getAll()
    {
        return (List<System>)getHibernateTemplate().find("from " + System.class.getName());
    }
}
