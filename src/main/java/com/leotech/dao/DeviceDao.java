package com.leotech.dao;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.dao.base.ExHibernateDaoSupport;
import com.leotech.entity.Device;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class DeviceDao extends ExHibernateDaoSupport {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public List<Device> getAll()
	{
		return (List<Device>)getHibernateTemplate().find("from " + Device.class.getName() + " order by code asc");
	}
	public JSONArray getAll_3d()
	{
		final JSONArray devices = new JSONArray();
		try {
			String sqlFilter = " where device.typeId=device_type.id";
			String strSql = "select device.id,device.code,device.name,device.memo,device_type.tpl,device.capacity  from device, device_type";
			strSql += sqlFilter;
			jdbcTemplate.query(strSql, new RowCallbackHandler(){
				public void processRow(ResultSet result) throws SQLException {
					JSONObject device = new JSONObject();
					device.put("id", result.getInt("device.id"));
					device.put("code", result.getString("code"));
					device.put("devName", result.getString("name"));
					device.put("memo", result.getString("memo"));
					device.put("copyfrom", result.getString("tpl"));
					device.put("capacity", result.getDouble("capacity"));
					devices.add(device);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return devices;
	}
	public Device findByCode(String code) {
		Device device = new Device();
		try {
			DetachedCriteria criteria = DetachedCriteria.forClass(Device.class);
			criteria.add(Restrictions.eq("code", code));
			List<Device> list = (List<Device>)getHibernateTemplate().findByCriteria(criteria);
			if(list.size() != 0){
				device = list.get(0);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

		return device;
	}
	public JSONObject getInfo(String code) {
		final JSONObject obj = new JSONObject();
		try {
			String sqlFilter = " where d.cabinet=c.code and d.code='" + code + "'";
			String strSql = "select d.name, d.modelNo, d.cpu, d.memory, d.disk, d.barcode, c.name from device d, cabinet c";
			strSql += sqlFilter;
			jdbcTemplate.query(strSql, new RowCallbackHandler(){
				public void processRow(ResultSet result) throws SQLException {
					JSONArray arr = new JSONArray();
					/*设备名称*/
					JSONObject objItem = new JSONObject();
					objItem.put("name", "设备名称");
					objItem.put("value", result.getString("d.name"));
					objItem.put("group", "基本信息");
					arr.add(objItem);
					/*设备型号*/
					objItem = new JSONObject();
					objItem.put("name", "设备型号");
					objItem.put("value", result.getString("d.modelNo"));
					objItem.put("group", "基本信息");
					arr.add(objItem);
					/*所属机柜*/
					objItem = new JSONObject();
					objItem.put("name", "所属机柜");
					objItem.put("value", result.getString("c.name"));
					objItem.put("group", "基本信息");
					arr.add(objItem);
					/*CPU信息*/
					objItem = new JSONObject();
					objItem.put("name", "CPU信息");
					objItem.put("value", result.getString("d.cpu"));
					objItem.put("group", "可选信息");
					arr.add(objItem);
					/*内存信息*/
					objItem = new JSONObject();
					objItem.put("name", "内存信息");
					objItem.put("value", result.getString("d.memory"));
					objItem.put("group", "可选信息");
					arr.add(objItem);
					/*硬盘信息*/
					objItem = new JSONObject();
					objItem.put("name", "硬盘信息");
					objItem.put("value", result.getString("d.disk"));
					objItem.put("group", "可选信息");
					arr.add(objItem);
					/*二维码*/
					objItem = new JSONObject();
					objItem.put("name", "二维码");
					objItem.put("value", result.getString("d.barcode"));
					objItem.put("group", "可选信息");
					arr.add(objItem);
					obj.put("total", 7);
					obj.put("rows", arr);
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return obj;
	}

}

//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowCallbackHandler;
//import org.springframework.jdbc.core.RowMapper;
//
//import com.alibaba.fastjson.JSONObject;
//import com.alibaba.fastjson.JSONArray;
//import com.leotech.util.SpringContextUtil;
//
//public class DeviceDao {
//	private static DeviceDao _dao = null;
//	public JdbcTemplate jdbcTemplate;
//	private DeviceDao()
//	{
//		if (null == jdbcTemplate) {
//			jdbcTemplate = (JdbcTemplate) SpringContextUtil.getSpringContext().getBean("jdbcTemplate");
//		}
//	}
//	public static synchronized DeviceDao instance(){
//		if(null == _dao){
//			_dao = new DeviceDao();
//		}
//		return _dao;
//	}
//	public JSONArray getAllDevice()
//	{
//		final JSONArray devices = new JSONArray();
//		try {
//			String sqlFilter = " where device.typeId=device_type.uuid";
//			String strSql = "select id,device.code,device.name,device.memo,device_type.tpl,device.capacity  from device, device_type";
//			strSql += sqlFilter;
//			jdbcTemplate.query(strSql, new RowCallbackHandler(){
//				public void processRow(ResultSet result) throws SQLException {
//					JSONObject device = new JSONObject();
//					device.put("uuid", result.getInt("id"));
//					device.put("code", result.getString("code"));
//					device.put("devName", result.getString("name"));
//					device.put("memo", result.getString("memo"));
//					device.put("copyfrom", result.getString("tpl"));
//					device.put("capacity", result.getDouble("capacity"));
//					devices.add(device);
//				}
//			});
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return devices;
//	}
//	public JSONObject getDeviceInfo(String code) {
//		final JSONObject obj = new JSONObject();
//		try {
//			String sqlFilter = " where d.cabinet=c.code and d.code='" + code + "'";
//			String strSql = "select d.name, d.modelNo, d.cpu, d.memory, d.disk, d.barcode, c.name from device d, cabinet c";
//			strSql += sqlFilter;
//			jdbcTemplate.query(strSql, new RowCallbackHandler(){
//				public void processRow(ResultSet result) throws SQLException {
//					JSONArray arr = new JSONArray();
//					/*设备名称*/
//					JSONObject objItem = new JSONObject();
//					objItem.put("name", "设备名称");
//					objItem.put("value", result.getString("d.name"));
//					objItem.put("group", "基本信息");
//					arr.add(objItem);
//					/*设备型号*/
//					objItem = new JSONObject();
//					objItem.put("name", "设备型号");
//					objItem.put("value", result.getString("d.modelNo"));
//					objItem.put("group", "基本信息");
//					arr.add(objItem);
//					/*所属机柜*/
//					objItem = new JSONObject();
//					objItem.put("name", "所属机柜");
//					objItem.put("value", result.getString("c.name"));
//					objItem.put("group", "基本信息");
//					arr.add(objItem);
//					/*CPU信息*/
//					objItem = new JSONObject();
//					objItem.put("name", "CPU信息");
//					objItem.put("value", result.getString("d.cpu"));
//					objItem.put("group", "可选信息");
//					arr.add(objItem);
//					/*内存信息*/
//					objItem = new JSONObject();
//					objItem.put("name", "内存信息");
//					objItem.put("value", result.getString("d.memory"));
//					objItem.put("group", "可选信息");
//					arr.add(objItem);
//					/*硬盘信息*/
//					objItem = new JSONObject();
//					objItem.put("name", "硬盘信息");
//					objItem.put("value", result.getString("d.disk"));
//					objItem.put("group", "可选信息");
//					arr.add(objItem);
//					/*二维码*/
//					objItem = new JSONObject();
//					objItem.put("name", "二维码");
//					objItem.put("value", result.getString("d.barcode"));
//					objItem.put("group", "可选信息");
//					arr.add(objItem);
//					obj.put("total", 7);
//					obj.put("rows", arr);
//				}
//			});
//
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		return obj;
//	}
//}

