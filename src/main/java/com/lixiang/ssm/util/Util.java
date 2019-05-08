package com.lixiang.ssm.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class Util {
	
	static JedisPool jedisPool;
	static ApplicationContext applicationContext;
	static{
		applicationContext = new ClassPathXmlApplicationContext(
				"classpath:redis.xml");
		// 获取redis连接池
		jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
	}
	
	public static Jedis getJedis(){
		return jedisPool.getResource();
	}
	
	/*@Autowired
	public DeviceMapper device;
	
	public static Util util;
	
	@PostConstruct
	public void init() {
		util = this;
    }
	
	public static Device getDevice(Integer id){
		return util.device.selectByPrimaryKey(1);
	}*/

}
