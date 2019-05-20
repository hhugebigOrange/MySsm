package com.lixiang.ssm.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSONObject;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Component
public class Util {

	static JedisPool jedisPool;
	static ApplicationContext applicationContext;
	static {
		applicationContext = new ClassPathXmlApplicationContext("classpath:redis.xml");
		// 获取redis连接池
		jedisPool = (JedisPool) applicationContext.getBean("jedisPool");
	}

	public static Jedis getJedis() {
		return jedisPool.getResource();
	}

	/**
	 * 复制一个文件到指定区域，如果是文件夹则复制整个文件夹,若文件不存在则抛出文件不存在异常
	 * 
	 * @param file
	 *            要复制文件或文件夹
	 * @param fileSoure
	 *            要复制的路径
	 * @return
	 */
	public static void copyFile(File file, String fileSoure) {
		// 判断文件是否存在
		if (file.exists()) {
			// 如果是文件夹，则遍历该文件夹下所有文件
			if (file.isDirectory()) {
				// 在目标路径创建相应文件夹
				File destFile = new File(fileSoure + "/" + file.getName());
				if (!destFile.exists()) {
					destFile.mkdirs();
				}
				// 遍历所有文件
				File[] files = file.listFiles();
				// 递归
				for (File file2 : files) {
					copyFile(file2, fileSoure + "/" + file.getName());
				}
			}
			// 如果是文件，则直接复制
			else {
				// 判断目标路径是否存在
				File destFile = new File(fileSoure);
				if (!destFile.exists()) {
					try {
						throw new FileNotFoundException("目标路径" + destFile.getAbsolutePath() + "不存在");
					} catch (FileNotFoundException e) {
						e.printStackTrace();
					}
				} else {
					destFile = new File(fileSoure + "/" + file.getName());
					try {
						FileUtils.copyFile(file, destFile);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		} else {
			try {
				throw new FileNotFoundException("文件路径" + file.getAbsolutePath() + "不存在");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 调用API接口，返回JSON格式数据
	 * @param 请求url
	 * @param 请求参数，放在MAP里面
	 * @return
	 */
	public static JSONObject readJsonFromUrl(String url,Map<String,Object> args) {
		StringBuilder json = new StringBuilder();
		StringBuilder httpUrl=new StringBuilder(url);
		URL oracle=null;
		try {
			if(args==null){
				oracle= new URL(url);
			}else{
				int i=0;
				for (Map.Entry<String, Object> entry : args.entrySet()) {
					   if(i==0){
						   httpUrl.append("?"+entry.getKey()+"="+entry.getValue().toString());
						   i=1;
					   }else{
						   httpUrl.append("&"+entry.getKey()+"="+entry.getValue().toString());
					   }
				   }
				oracle= new URL(httpUrl.toString());
			}
			System.out.println(oracle.toString());
			URLConnection yc = oracle.openConnection();
			BufferedReader in = new BufferedReader(new InputStreamReader(yc.getInputStream(),"utf-8"));// 防止乱码
			String inputLine = null;
			while ((inputLine = in.readLine()) != null) {
				json.append(inputLine);
			}
			in.close();
		} catch (MalformedURLException e) {
			
		} catch (IOException e) {
			
		}
		return JSONObject.parseObject(json.toString());
	}

	/*
	 * @Autowired public DeviceMapper device;
	 * 
	 * public static Util util;
	 * 
	 * @PostConstruct public void init() { util = this; }
	 * 
	 * public static Device getDevice(Integer id){ return
	 * util.device.selectByPrimaryKey(1); }
	 */

}
