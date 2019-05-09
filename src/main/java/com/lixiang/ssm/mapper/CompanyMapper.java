package com.lixiang.ssm.mapper;

import com.lixiang.ssm.entity.Company;

public interface CompanyMapper {
	
    int deleteByPrimaryKey(String companyId);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(String companyId);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
}