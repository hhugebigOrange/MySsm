package com.lixiang.ssm.mapper;

import com.lixiang.ssm.entity.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}