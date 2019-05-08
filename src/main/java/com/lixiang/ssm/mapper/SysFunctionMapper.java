package com.lixiang.ssm.mapper;

import java.util.List;

import com.lixiang.ssm.entity.SysFunction;

public interface SysFunctionMapper {
	/**
	 * 根据用户id查询该用户有哪些权限
	 * TODO:方法描述
	 * @version 2018年8月29日下午3:00:02
	 * @author wutao
	 * @param userId
	 * @return
	 */

	List<SysFunction> getSysFunctionByUserId(int userId);
}