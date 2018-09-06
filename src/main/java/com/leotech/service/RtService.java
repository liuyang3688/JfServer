package com.leotech.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.leotech.model.Triple;
import redis.clients.jedis.Jedis;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class RtService {
	private static Map<Triple, Double> s_mapRtData;
	//private static Map<Triple, Integer> s_mapRtData_YX;
	static{
		s_mapRtData = new ConcurrentHashMap<Triple, Double>();
		//s_mapRtData_YX = new ConcurrentHashMap<Triple, Integer>();
	}
	public static Map<Triple, Double> getRtMap() {
		return s_mapRtData;
	}
	public static JSONObject getRtData() {
		JSONObject datas = new JSONObject();
		for (Map.Entry<Triple, Double> entry : s_mapRtData.entrySet()) {
			Triple tri = entry.getKey();
			String bjlx = String.valueOf(tri.bjlx);
			String bjid = String.valueOf(tri.bjid);
			if (!datas.containsKey(bjlx)) {
				datas.put(bjlx, new JSONObject());
				((JSONObject)datas.get(bjlx)).put(bjid, new JSONArray());
			} else if (!((JSONObject)datas.get(bjlx)).containsKey(bjid)) {
				((JSONObject) datas.get(bjlx)).put(bjid, new JSONArray());
			}
			JSONObject one = new JSONObject();
			one.put("bjlx", tri.bjlx);
			one.put("bjid", tri.bjid);
			one.put("bjcs", tri.bjcs);
			one.put("val", entry.getValue());
			((JSONArray)((JSONObject)datas.get(bjlx)).get(bjid)).add(one);
		}
		return datas;
	}

	public static JSONObject loadBjcsLabel() {
		// 一是从配置文件
		JSONObject objBjcs = new JSONObject();
		try {
			Properties prop = new Properties();
			InputStream in = RtService.class.getResourceAsStream("/config/bjcs.properties");
			BufferedReader reader = new BufferedReader(new InputStreamReader(in, "UTF-8"));
			prop.load(reader);
			Set<String> setPropName = prop.stringPropertyNames();
			for (String propName : setPropName) {
				String propValue = prop.getProperty(propName, "未知参数名");
				objBjcs.put(propName, propValue);
			}
			in.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return objBjcs;
	}
	public static void setRtData_YC(Triple tri, double val) {
		s_mapRtData.put(tri, val);
	}
	public static void setRtData_YX(Triple tri, int val) {
		tri.bjcs += 1000;
		s_mapRtData.put(tri, (double)val);
	}
	public static void mockData() {
		RtService.setRtData_YC(new Triple(1,1,1), 12.33*Math.random());
		RtService.setRtData_YC(new Triple(1,1,2), 21.3233*Math.random());
		RtService.setRtData_YX(new Triple(1,1,1), 1);
		RtService.setRtData_YX(new Triple(1,1,2), 0);
		RtService.setRtData_YC(new Triple(1,2,1), 888.33*Math.random());
		RtService.setRtData_YC(new Triple(1,2,2), 88.1*Math.random());
		RtService.setRtData_YX(new Triple(1,2,1), 0);
		RtService.setRtData_YX(new Triple(1,2,2), 1);
	}
}
