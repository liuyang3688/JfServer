package com.leotech.dao;


import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Material;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class MaterialDao extends ExHibernateDaoSupport {
    public List<Material> getAll()
    {
        return (List<Material>)getHibernateTemplate().find("from " + Material.class.getName());
    }
}