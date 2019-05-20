/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package com.lixiang.ssm.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.Cookie;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.subject.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.lixiang.ssm.entity.User;
import com.lixiang.ssm.service.CompanyService;
import com.lixiang.ssm.util.Util;

/**
 * TODO:类功能介绍
 * 
 * @version 2018年8月30日上午10:30:06
 * @author wutao
 */
@Controller
public class LoginController extends BaseController {

	@Autowired
	private CompanyService compamyService;

	/**
	 * 登陆验证，成功写入Cookie到客户端
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/dologin")
	@ResponseBody
	public String dologin(String username, String password) {
		// 判断输入的用户名和密码是否为空
		if (username == null || password == null) {
			return "账号名或密码不能为空";
		}
		UsernamePasswordToken token = new UsernamePasswordToken(username.trim(), password.trim());
		Subject subject = SecurityUtils.getSubject();
		try {
			// 登陆验证
			subject.login(token);
			// 写入Cookie，时长为2个小时
			Cookie cookie = new Cookie("token", username + ":" + password);
			cookie.setMaxAge(60 * 60 * 2);
			response.addCookie(cookie);
			try {
				response.sendRedirect(request.getContextPath() + "/html/index.html");
			} catch (IOException e) {
				e.printStackTrace();
			}
			return "登录成功";
		} catch (IncorrectCredentialsException e) {
			return "账号密码不正确";
		}
	}

	/**
	 * 匹配登陆页面
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/login")
	public String login() {
		return "/html/login";
	}

	/**
	 * 获取当前用户信息
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getUser")
	@ResponseBody
	public Map<String, Object> getUser() {
		Map<String, Object> json = new HashMap<>();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		json.put("data", user.toString());
		return json;
	}

	/**
	 * 根据公司ID，获取公司及名下员工信息
	 * 
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/getCompany")
	@ResponseBody
	public Map<String, Object> getCompany(String companyId) {
		Map<String, Object> json = new HashMap<>();
		if (companyId == null || companyId.trim().equals("")) {
			json.put("data", "请输入要查询的公司Id");
			return json;
		}
		json.put("data", compamyService.selectByPrimaryKey(companyId));
		return json;
	}

	@RequiresPermissions("18011446524")
	@RequestMapping(value = "/xixi")
	@ResponseBody
	public JSONObject xixi() {
		JSONObject json=Util.readJsonFromUrl("http://47.106.110.201/som/contractManage?page=1&limit=20&username=13711300835&serviceArea=&custName=&contractNature=&woStatus=");
		return json;
	}

	@Test
	public void test() {
		JSONObject json=Util.readJsonFromUrl("http://47.106.110.201/som/contractManage?page=1&limit=20&username=13711300835&serviceArea=&custName=&contractNature=&woStatus=");
		System.out.println(json.get("data"));
	}

	/**
	 * 无权限提示
	 * 
	 * @return
	 */
	@RequestMapping(value = "/noJurisdiction")
	@ResponseBody
	public Map<String, Object> noJurisdiction() {
		Map<String, Object> json = new HashMap<>();
		json.put("data", "对不起，您暂无权限访问");
		return json;
	}
}
