/*
 * Copyright (C) 2017 ShenZhen LiXiang Software Co.,Ltd All Rights Reserved.
 * 未经本公司正式书面同意，其他任何个人、团体不得使用、复制、修改或发布本软件.
 * 版权所有深圳市理想软件有限公司
 */
package com.lixiang.ssm.myexception;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationException;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.support.spring.FastJsonJsonView;

/**
 * TODO:自定义异常类，根据不同异常，返回不同提示
 * 
 * @version 2018年8月30日上午10:30:06
 * @author 伍涛
 */
@Component
public class MyException implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2,
			Exception arg3) {
		ModelAndView modelAndView=new ModelAndView();
		FastJsonJsonView view = new FastJsonJsonView();  
        Map<String, Object> attributes = new HashMap<String, Object>();
        //根据不同异常，返回不同数据
        //用户不存在异常
        if(arg3 instanceof UnknownAccountException){
        	attributes.put("errmsg", "对不起，该用户不存在");
			view.setAttributesMap(attributes);
			modelAndView.setView(view);
			return modelAndView;
        }
        //无权限异常
		if(arg3 instanceof AuthorizationException){
			attributes.put("errmsg", "暂无权限");
			view.setAttributesMap(attributes);
			modelAndView.setView(view);
			return modelAndView;
		}
		return null;
	}


}
