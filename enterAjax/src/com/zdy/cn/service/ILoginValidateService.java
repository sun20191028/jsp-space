package com.zdy.cn.service;

import com.zdy.cn.model.UserInfo;

public interface ILoginValidateService {
	public boolean validateServiceLogin(UserInfo user)  throws Exception;
}
