package com.neusoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {

	// 一个方法接收一个请求
	// 视图解析器
	@RequestMapping("/admin.do")
	public String admin() {
		
		return "WEB-INF/hello.html";
		
	}
	
	
	
	
}