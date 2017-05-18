package com.xinwis.pms.util.redis;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import redis.clients.jedis.JedisPool;

/**
 * 
*      
* description：写这类目的：因为在配置文件用jedisPool如果redis没设置密码，配置文件redis.password为空  ，会获取不到数据库连接，所以继承JedisPool处理下 
* creator：yingjie
* createtime：2016年3月28日 下午6:25:42       
*
 */
public class IfoRedisPool extends JedisPool{
	public IfoRedisPool(final GenericObjectPoolConfig poolConfig, final String host, int port,
		      int timeout, final String password, final int database) {
		super(poolConfig, host, port, timeout, timeout, password.equals("")?null:password, database,null);
	}
}
