package com.neusoft.neuedu.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.neuedu.entity.User;
import com.neusoft.neuedu.service.UserService;

@Controller
public class UserCon {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/query.do")
	@ResponseBody
	public List<User> queryUser(){
		return userService.getAllUsers();
	}
}