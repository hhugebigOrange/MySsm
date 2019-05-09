package com.lixiang.ssm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lixiang.ssm.entity.Company;
import com.lixiang.ssm.mapper.CompanyMapper;

@Component
public class CompanyService {
	
	@Autowired
	private CompanyMapper companyMapper;
	
	/**
	 * 根据公司ID查询公司信息及名下员工信息
	 * @param companyId 公司ID
	 * @return
	 */
	public Company selectByPrimaryKey(String companyId){
		return companyMapper.selectByPrimaryKey(companyId);
	}
    
}