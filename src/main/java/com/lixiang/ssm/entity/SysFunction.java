package com.lixiang.ssm.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SysFunction {
    private Integer functionId;

    private Integer parentId;

    private String functionName;

    private String functionUrl;

    private Integer functionType;

    private String permission;

    private Date createTime;

    private Integer sort;

}