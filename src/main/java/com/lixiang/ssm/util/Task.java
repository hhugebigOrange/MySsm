package com.lixiang.ssm.util;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.lixiang.ssm.mapper.UserMapper;

@Component
public class Task {
	
	@Autowired
	private UserMapper userService;
	
	/*@Scheduled(fixedRate=1000)
	public void autoPrintf(){
		System.out.println(userService.selectByUserId("18011446524"));
	}*/
	
	
}
