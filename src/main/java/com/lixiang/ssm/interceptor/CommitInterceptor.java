package com.lixiang.ssm.interceptor;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.lixiang.ssm.entity.User;
import com.lixiang.ssm.util.Util;

import redis.clients.jedis.Jedis;

/**
 * 
 * 类功能介绍: 拦截请求，防止重复提交
 * @author 伍涛
 * @date 2019年5月20日
 */
public class CommitInterceptor implements HandlerInterceptor {

	// 可以在拦截器中注入service、dao
	// @Autowired
	// private UserService userService;

	/**
	 * preHandle表示在执行目标方法前执行
	 * 
	 * 返回值的意义是：true-放行，继续执行目标方法或者其他拦截器；false-停止执行，无任何响应
	 */

	/**
	 * 查看缓存里该提交是否还在，不在则代表用户前一次请求已经成功，在则表示用户前一次请求还未响应完成
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// 获取请求地址
		String url = request.getRequestURI();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		Jedis jedis = Util.getJedis();
		if (!jedis.exists(url + user.getUserId())) {
			System.out.println(url + user.getUserId());
			jedis.set(url + user.getUserId(), "true");
			jedis.expire(url + user.getUserId(), 300);
			return true;
		}
		// 如果缓存里有该用户的请求，则说明是重复提交
		else {
			response.reset();
			// 设置编码格式
			response.setCharacterEncoding("UTF-8");
			response.setContentType("application/json;charset=UTF-8");
			PrintWriter pw = response.getWriter();
			pw.write("{errCode:1,msg:'请不要重复提交'}");
			pw.flush();
	        pw.close();
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
	
	/**
	 * 执行成功后，清除该用户缓存里的这次请求
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		String url = request.getRequestURI();
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		Jedis jedis = Util.getJedis();
		jedis.del(url + user.getUserId());
	}

}
