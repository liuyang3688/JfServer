package com.leotech.rt;

import com.leotech.model.Triple;
import com.leotech.service.RedisService;
import com.leotech.service.RtService;
import com.leotech.util.Constant;

public class RtThread implements Runnable {
	public void run() {
		while(!Thread.interrupted()) {
			// 空调
			try{
				RedisService.sendDataToRedis();
				Thread.sleep(1000);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
