package com.cas.water.app.service;

import com.cas.water.app.pojo.UserInfo;

public interface UserInfoService
{
	UserInfo login(String account, String password);
}
