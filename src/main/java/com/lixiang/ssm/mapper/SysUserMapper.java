package com.lixiang.ssm.mapper;

import com.lixiang.ssm.entity.SysUser;

public interface SysUserMapper {

	SysUser getSysUserByName(String userName);
}