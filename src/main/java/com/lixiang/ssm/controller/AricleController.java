/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package com.lixiang.ssm.controller;

import java.util.HashMap;
import java.util.Map;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lixiang.ssm.entity.Device;
import com.lixiang.ssm.entity.User;
import com.lixiang.ssm.util.Util;

import redis.clients.jedis.Jedis;

/**
 * TODO:类功能介绍
 * 
 * @version 2018年8月30日上午10:30:06
 * @author wutao
 */
@Controller
public class AricleController {

	/**
	 * 文章列表 TODO:登陆页面
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login")
	@ResponseBody
	public String login(@RequestParam("username") String username, @RequestParam("password") String password) {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.login(token);
		} catch (IncorrectCredentialsException e) {
			return "账号密码不正确";
		}
		return "登陆成功";
	}

	/**
	 * 获取当前用户信息 TODO:登陆页面
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getUser")
	@ResponseBody
	public String getUser() {
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		return user.toString();
	}

	@RequiresPermissions("18011446524")
	@RequestMapping(value = "/xixi")
	@ResponseBody
	public String xixi() {
		return "臭傻逼";
	}

	@RequestMapping(value = "/getService")
	public @ResponseBody Map<String, Object> getService(@RequestBody JSONObject obj) {
		Map<String, Object> json = new HashMap<>();
    	Device device=JSONObject.toJavaObject(obj, Device.class);
    	json.put("data", device);
		return json;
	}

	@Test
	public void test() {
		Jedis jedis=Util.getJedis();
		jedis.set("nima", "chishi");
		jedis.expire("nima", 60);
		System.out.println(jedis.get("nima"));
	}
}
