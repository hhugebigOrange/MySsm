package com.lixiang.ssm.entity;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysUser {
    private Integer userId;

    @NotEmpty(message="用户名不能为空")
    @Pattern(regexp="^[a-zA-Z0-9]{5,20}",message="请输入5-20位由英文字母大小写、数字组成的用户名")
    private String userName;

    @NotEmpty(message="密码不能为空")
    @Pattern(regexp="^[a-zA-Z0-9]{32}",message="请输入6-20位由英文字母大小写、数字、_组成的密码")
    private String password;

    private String realName;

    private Integer status;

    private Date lastLoginTime;

    private String lastLoginIp;

    private Date createTime;

    private String email;

    private String tel;

}