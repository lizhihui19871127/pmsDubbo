package com.xinwis.pms.util.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisKeyManage {
	
	@Autowired
	private RedisOperateUtil redisOperateUtil;
	
	 //测试redis缓存
	private final String testRedis = "pmsDubbo-testRedis";

	//测试redis缓存有效时间
	public static final int testRedisExpireSeconds = 60;

	/**
	 * 设置testRedis缓存
	 * @param value
	 */
	public void setTestRedis(String value){
		redisOperateUtil.setValueAndLifeCycle(testRedis,testRedisExpireSeconds,value);
	}

	/**
	 * 获取testRedis缓存值
	 * @return
	 */
	public String getTestRedis(){
		String value = redisOperateUtil.get(testRedis);
		return value;
	}
}
