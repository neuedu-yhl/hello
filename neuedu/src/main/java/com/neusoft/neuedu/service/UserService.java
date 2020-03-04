package com.neusoft.neuedu.service;

import javax.servlet.http.HttpServletRequest;

import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.User;

public interface UserService {

	HigherResponse<User> login(String username,String psw,HttpServletRequest req);
	
	
	HigherResponse<PageInfo<User>> queryUserByPage(Integer pageNum,Integer pageSize,HttpServletRequest req);
	
}