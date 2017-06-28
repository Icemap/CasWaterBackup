package com.cas.water.app.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cas.water.app.dao.UserInfoMapper;
import com.cas.water.app.pojo.UserInfo;
import com.cas.water.app.service.UserInfoService;

@Service
public class UserInfoServiceImpl implements UserInfoService
{
	@Autowired
	UserInfoMapper userInfoMapper;
	
	public UserInfo login(String account, String password)
	{
		return userInfoMapper.selectByAccountAndPassword(account, password);
	}

}
