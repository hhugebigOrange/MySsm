package com.lixiang.ssm.shiro;

import java.util.HashSet;
import java.util.Set;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.lixiang.ssm.entity.User;
import com.lixiang.ssm.mapper.UserMapper;

public class MyShiro extends AuthorizingRealm {

	@Autowired
	private UserMapper userService;

	/**
	 * 提供用户信息返回权限信息
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		User user = (User) principals.getPrimaryPrincipal();
		SimpleAuthorizationInfo authorizationInfo = new SimpleAuthorizationInfo();
		// 角色名集合
		Set<String> roleNames = new HashSet<String>();
		roleNames.add(user.getCustName());
		// 将角色名称提供给info
		authorizationInfo.setRoles(roleNames);
		roleNames.add(user.getUserId());
		// 将权限名给Info
		authorizationInfo.setStringPermissions(roleNames);
		return authorizationInfo;
	}

	/**
	 * 提供账户信息返回认证信息
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token =(UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		User user = userService.selectByUserId(username);
		if (user == null) {
			// 用户名不存在抛出异常
			throw new UnknownAccountException();
		}
		SimpleAuthenticationInfo authenticationInfo = new SimpleAuthenticationInfo(user,
				user.getPassword(), getName());
		return authenticationInfo;
	}

}
