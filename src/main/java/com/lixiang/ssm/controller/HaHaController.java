package com.lixiang.ssm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.lixiang.ssm.entity.Device;
import com.lixiang.ssm.mapper.DeviceMapper;


@Controller
public class HaHaController {
	
    @Autowired
	private DeviceMapper deviceMapper;
    @Autowired
    public Device device;
	
	/**
	 * 文章列表
	 * TODO:方法描述
	 * @version 2018年8月30日上午10:31:14
	 * @author wutao
	 * @param model
	 * @return
	 */
	public Device getAllArticle() {
		return null;
	}
	
	@RequestMapping(value="/login1")
	@Transactional(rollbackFor=Exception.class)
	@ResponseBody
	public Device test(){
		device.setId(1959);
		device.setBwReader("2000");
		System.out.println(device);
		deviceMapper.updateByPrimaryKeySelective(device);
		device.setId(6000);
		device.setBwReader("2000");
		if(deviceMapper.updateByPrimaryKeySelective(device)<=0){    
	        throw new RuntimeException();
		}
		/*device.setMachCode("GZZ0154123123");
		device.setBwReader("2000");
		deviceMapper.updateByPrimaryKey(device);*/
		return deviceMapper.selectByPrimaryKey(1);
	}
	
	@RequestMapping(value="/123")
	public ModelAndView index(ModelAndView modelAndView){
		modelAndView.setViewName("/html/index");
		return modelAndView;
	}
}
