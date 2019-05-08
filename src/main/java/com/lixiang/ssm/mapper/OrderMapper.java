package com.lixiang.ssm.mapper;

import com.lixiang.ssm.entity.Order;

public interface OrderMapper {
    int deleteByPrimaryKey(String woNumber);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(String woNumber);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);
}