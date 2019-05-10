package com.lixiang.ssm.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.ModelAttribute;

public class BaseController {
	protected HttpServletRequest request;
    protected HttpServletResponse response;
    protected HttpSession session;
    protected Cookie[] cookies;
    protected String contextPath;
    protected static final String SESSION_USER = "user";

	@ModelAttribute
	public void setReqAndRes(HttpServletRequest request, HttpServletResponse response) {
		this.request = request;
		this.response = response;
		this.session = request.getSession();
		this.cookies = request.getCookies();
		this.contextPath = request.getContextPath();
	}
}
