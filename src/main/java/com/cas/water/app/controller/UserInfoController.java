package com.cas.water.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cas.water.app.service.impl.UserInfoServiceImpl;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController
{
	@Autowired
	UserInfoServiceImpl userInfoServiceImpl;
	
	@RequestMapping("/login")
	@ResponseBody
	public Object login(String account, String password)
	{
		return userInfoServiceImpl.login(account, password);
	}
}
