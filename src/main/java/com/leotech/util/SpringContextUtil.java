package com.leotech.util;

import com.leotech.config.AppConfig;
import com.leotech.config.WebConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public final class SpringContextUtil
{     
	private static ApplicationContext context;  
	public static ApplicationContext getSpringContext(){
		if(context == null){
			//context = new ClassPathXmlApplicationContext("spring-config/spring-app.xml");
			context = new AnnotationConfigApplicationContext(AppConfig.class);
		}
		return context;
	}
	
} 
