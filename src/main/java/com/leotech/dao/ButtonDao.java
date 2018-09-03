package com.leotech.dao;


import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Button;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ButtonDao extends ExHibernateDaoSupport {
	
	public List<Button> getAll()
	{
		return (List<Button>) getHibernateTemplate().find("from " + Button.class.getName());
	}
}
