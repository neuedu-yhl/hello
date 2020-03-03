package com.neusoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

	// 一个方法接收一个请求
	// 视图解析器
	@RequestMapping("/admin.do")
	@ResponseBody
	public String admin(HttpServletRequest request,HttpServletResponse resp) {
		String attribute = (String)request.getSession().getAttribute("username");
		return attribute;	
	}
	
	
	@RequestMapping("/setSession.do")
	public String setSession(HttpServletRequest request,HttpServletResponse resp) {
		request.getSession().setAttribute("username", "zhangsan");
		return "hello";	
	}
	
	
	// 参数绑定
	@RequestMapping("/param.do")
	@ResponseBody
	public String paramBind(String username,String psw) {
		return username+psw;
	}
	
	
	
	// 访问html
	@RequestMapping("/hello.do")
	public String toHelloPage() {
		return "hello";
	}
	
	
	
	
	
}