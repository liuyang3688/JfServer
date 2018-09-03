package com.leotech.util;

import java.util.Map;


public class SystemUtil {
	public static String appName;

	public static String getAppName() {
	    if (appName == null) {
            String classesPath = Thread.currentThread().getContextClassLoader()
                    .getResource("/").getPath();
            String appName = "";
            if (null != classesPath && !"".equals(classesPath)) {
                int pos = classesPath.indexOf("WEB-INF");
                if (pos > 0) {
                    classesPath = classesPath.substring(0, pos);
                    String[] str = classesPath.replace("\\", "/").split("/");
                    if (str.length > 0) {
                        appName = str[str.length - 1];
                    }
                }
            }
        }

		return appName;
	}

	public static void setAppName(String name) {
        appName = name;
	}
}
