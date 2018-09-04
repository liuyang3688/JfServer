package com.leotech.service;

import com.alibaba.fastjson.JSONObject;
import com.leotech.model.Triple;
import redis.clients.jedis.Jedis;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class RedisService {
    private static Jedis jedis;
    private static Boolean isApp;
    static {
        String host = "47.96.127.175";
        int port = 6379;
        int timeout = 5000;
        try {
            Properties prop = new Properties();
            InputStream in = RtService.class.getResourceAsStream("/config/redis.properties");
            prop.load(in);
            host = prop.getProperty("redis.host", "47.96.127.175");
            port = Integer.parseInt(prop.getProperty("redis.port", "6379"));
            timeout = Integer.parseInt(prop.getProperty("redis.timeout", "5000"));
            isApp = Boolean.parseBoolean(prop.getProperty("isApp", "false"));
            in.close();
        } catch (Exception e) {
        }
        jedis = new Jedis(host, port, timeout);
        try {
            connect();
        } catch (Exception e) {
            System.out.println("Jedis: connect to redis server exception.");
        }
    }
    public static void connect() {
        try {
            jedis.auth("admin");
        } catch (Exception e) {
            System.out.println("Redis connect:" + e.getMessage());
        }
    }
    public static void sendDataToRedis() {
        if (!isApp) {
            try {
                if (! jedis.isConnected()) {
                    // 如果未连接，尝试连接一次
                    System.out.println("getRtData: 当前未连接，尝试一次。");
                    connect();
                }
                if (jedis.isConnected()) {
                    Map<Triple, Double> mapSrc = RtService.getRtMap();
                    Map<String, HashMap<String, String>> mapDst = new HashMap<String, HashMap<String, String>>();
                    for (Triple triple : mapSrc.keySet()) {
                        double dVal = mapSrc.get(triple);
                        String keyDst = String.format("%02d-", triple.bjlx) + String.format("%03d", triple.bjid);
                        if (mapDst.containsKey(keyDst)) {
                            HashMap<String, String> mapCs = new HashMap<String, String>();
                            mapDst.put(keyDst, mapCs);
                        }
                        mapDst.get(keyDst).put(String.valueOf(triple.bjcs), String.valueOf(dVal));
                    }
                    for (String key : mapDst.keySet()) {
                        Map<String, String> mapCs = mapDst.get(key);
                        jedis.hmset(key, mapCs);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    public static JSONObject getRtData() {
        JSONObject datas = new JSONObject();

        try {
            if (! jedis.isConnected()) {
                // 如果未连接，尝试连接一次
                System.out.println("getRtData: 当前未连接，尝试一次。");
                connect();
            }
            if (jedis.isConnected()) {
                // 取所有Keys
                Set<String> keySet = jedis.keys("*");
                for (String s : keySet) {
                    if (s.matches("^\\d{2}-\\d{3}")){
                        Map<String, String> hm = jedis.hgetAll(s);
                        datas.put(s, hm);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datas;
    }

    public static JSONObject getRtData(int bjlx) {
        JSONObject datas = new JSONObject();

        try {
            if (! jedis.isConnected()) {
                // 如果未连接，尝试连接一次
                System.out.println("getRtData: 当前未连接，尝试一次。");
                connect();
            }
            if (jedis.isConnected()) {
                String pattern = String.format("%02d", bjlx) + "-*";
                // 取所有Keys
                Set<String> keySet = jedis.keys(pattern);
                for (String s : keySet) {
                    if (s.matches("^\\d{2}-\\d{3}")){
                        Map<String, String> hm = jedis.hgetAll(s);
                        datas.put(s, hm);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datas;
    }

    public static JSONObject getRtData(int bjlx, int bjid) {
        JSONObject datas = new JSONObject();

        try {
            if (! jedis.isConnected()) {
                // 如果未连接，尝试连接一次
                System.out.println("getRtData: 当前未连接，尝试一次。");
                connect();
            }
            if (jedis.isConnected()) {
                String key = String.format("%02d", bjlx) + "-" + String.format("%03d", bjid);
                // 取所有Keys
                Map<String, String> hm = jedis.hgetAll(key);

                datas.put(key, hm);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return datas;
    }

    public static void mockRtData() {
        Map<String, String> hm = new HashMap<String, String>();
        hm.put("0001", "24.11");
        hm.put("0002", "31.2");
        hm.put("0003", "24.11");
        hm.put("0004", "31.2");
        hm.put("0005", "24.11");
        hm.put("0006", "31.2");
        hm.put("0007", "24.11");
        hm.put("0008", "31.2");
        hm.put("0009", "24.11");
        hm.put("0010", "31.2");
        hm.put("0011", "24.11");
        hm.put("0012", "31.2");
        hm.put("0013", "24.11");
        hm.put("0014", "31.2");
        hm.put("1001", "1");
        hm.put("1002", "0");
        jedis.hmset("01-001", hm);

        hm = new HashMap<String, String>();
        hm.put("0001", "124.11");
        hm.put("0002", "131.2");
        hm.put("0003", "124.11");
        hm.put("0004", "131.2");
        hm.put("0005", "124.11");
        hm.put("0006", "131.2");
        hm.put("0007", "124.11");
        hm.put("0008", "131.2");
        hm.put("0009", "124.11");
        hm.put("0010", "131.2");
        hm.put("0011", "124.11");
        hm.put("0012", "131.2");
        hm.put("0013", "124.11");
        hm.put("0014", "131.2");
        hm.put("1001", "1");
        hm.put("1002", "0");
        jedis.hmset("01-002", hm);

        // 类型2
        hm = new HashMap<String, String>();
        hm.put("0001", "224.11");
        hm.put("0002", "231.2");
        hm.put("0003", "224.11");
        hm.put("0004", "231.2");
        hm.put("0005", "224.11");
        hm.put("0006", "231.2");
        hm.put("0007", "224.11");
        hm.put("0008", "231.2");
        hm.put("0009", "224.11");
        hm.put("0010", "31.2");
        hm.put("0011", "24.11");
        hm.put("0012", "31.2");
        hm.put("0013", "24.11");
        hm.put("0014", "31.2");
        hm.put("1001", "1");
        hm.put("1002", "0");
        jedis.hmset("02-001", hm);

        // 类型3
        hm = new HashMap<String, String>();
        hm.put("1", "5.6");
        hm.put("2", "6.7");
        jedis.hmset("03-001", hm);
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
}
