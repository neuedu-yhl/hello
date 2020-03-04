package com.neusoft.neuedu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.User;
import com.neusoft.neuedu.service.UserService;

@RestController
public class UserCon {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/query.do")
	public HigherResponse<User> queryUser(String username,String psw){
		return userService.login(username, psw);
	}
}