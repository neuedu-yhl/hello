package com.neusoft.neuedu.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.User;
import com.neusoft.neuedu.service.UserService;

@RestController
public class UserCon {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/query.do")
	public HigherResponse<User> queryUser(String username,String psw,HttpServletRequest  req){
		return userService.login(username, psw,req);
	}
	
	// 分页查询用户
	@RequestMapping("/queryUserByPage.do")
	public HigherResponse<PageInfo<User>> queryUserByPage(@RequestParam(required = true,defaultValue = "1")Integer pageNum,@RequestParam(required = true,defaultValue = "2")Integer pageSize,HttpServletRequest req){
		return userService.queryUserByPage(pageNum, pageSize, req);
	}
	
	
	// 获取登录用户信息接口
	@RequestMapping("/get_user_info.do")
	public HigherResponse<User> getLoginUserInfo(HttpSession session){
		return userService.getLoginUserInfo(session);
	}
}