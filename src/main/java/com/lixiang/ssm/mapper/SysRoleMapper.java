package com.lixiang.ssm.mapper;

import java.util.List;

import com.lixiang.ssm.entity.SysRole;

public interface SysRoleMapper {

	/**
	 * 更具用户ID查询该用户拥有的角色信息
	 * TODO:方法描述
	 * @version 2018年8月29日下午2:43:01
	 * @author wutao
	 * @param userId
	 * @return
	 */
	List<SysRole> getSysRoleByUserId(int userId);
	
}