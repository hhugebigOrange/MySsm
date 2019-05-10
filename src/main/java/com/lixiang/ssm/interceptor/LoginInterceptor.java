package com.lixiang.ssm.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 * 自定义登陆拦截器
 * 
 * @version 2018年8月22日下午5:57:17
 * @author zhuwenbin
 */
public class LoginInterceptor implements HandlerInterceptor {

	// 可以在拦截器中注入service、dao
	// @Autowired
	// private UserService userService;

	/**
	 * preHandle表示在执行目标方法前执行
	 * 
	 * 返回值的意义是：true-放行，继续执行目标方法或者其他拦截器；false-停止执行，无任何响应
	 */

	/**
	 * 登陆拦截，若有相应的Cookie则直接登录，反之则直接跳转登录页面
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 获取浏览器访问访问服务器时传递过来的cookie数组
		Cookie[] cookies = request.getCookies();
		// 如果cookies不为空，则说明用户之前1天内访问过本网站，可免登陆
		if (cookies != null) {
			System.out.println("进入cookies循环");
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getValue());
				if (cookie.getName().equals("token")) {
					String[] a = cookie.getValue().split(":");
					UsernamePasswordToken token = new UsernamePasswordToken(a[0], a[1]);
					Subject subject = SecurityUtils.getSubject();
					subject.login(token);
					cookie.setMaxAge(600);
					response.addCookie(cookie);
					return true;
				}
			}
			System.out.println("没有Cookie");
			//若没有相应Cookie，则跳转登陆页面
			request.getRequestDispatcher("/html/login.html").forward(request,response);
			return false;
		}
		//如果没有Cookies，则说明用户未登陆，或登陆超时，需要重新登录
		else{
			System.out.println("没有Cookie");
			request.getRequestDispatcher("/html/login.html").forward(request,response);
			return false;
		}
	}

	/**
	 * postHandle表示在执行目标方法后但未响应时执行
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
	}

	/**
	 * afterCompletion表示在执行目标方法并响应后执行
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		
	}

}
