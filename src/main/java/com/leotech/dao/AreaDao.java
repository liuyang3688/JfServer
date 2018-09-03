package com.leotech.dao;

import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Area;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class AreaDao extends ExHibernateDaoSupport {
	public List<Area> getAll()
	{
		return (List<Area>)getHibernateTemplate().find("from " + Area.class.getName());
	}
	public JSONObject saveOne(Area area) {
		JSONObject obj = new JSONObject();
		try {
			getHibernateTemplate().save(area);
		} catch (Exception e){
			obj.put("errorMsg", e.getMessage());
			return obj;
		}
		return obj;
	}
	public JSONObject deleteSome(List<Area> list) {
		JSONObject obj = new JSONObject();
		try {
			getHibernateTemplate().deleteAll(list);
		} catch (Exception e){
			obj.put("errorMsg", e.getMessage());
			return obj;
		}
		return obj;
	}
}

