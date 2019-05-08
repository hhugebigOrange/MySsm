package com.lixiang.ssm.mapper;

import com.lixiang.ssm.entity.Service;

public interface ServiceMapper {
    int insert(Service record);

    int insertSelective(Service record);
    
    Service selectByWoNumber(String woNumber);
}