package com.leotech.dao;


import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.DeviceType;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class DeviceTypeDao extends ExHibernateDaoSupport {
    public List<DeviceType> getAll()
    {
        return (List<DeviceType>)getHibernateTemplate().find("from " + DeviceType.class.getName());
    }
}