package com.neusoft.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.entity.Admin;

@Controller
@RequestMapping("/admin")
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
	@RequestMapping(value="/param.do",produces = "text/html;charset=utf-8")
	@ResponseBody
	public String paramBind(String username,String psw,HttpServletRequest req,HttpServletResponse resp) {
		return username+psw;
	}
	
	
	
	// 访问html
	@RequestMapping(value="/hello.do")
	public String toHelloPage() {
		return "hello";
	}
	
	
	// 显示json格式
	@RequestMapping(value="/getAdmin.do")
	@ResponseBody
	public List<Admin> getAdmins(HttpServletResponse response){
		response.setContentType("text/html;charset=utf-8");
		// 模拟数据
		ArrayList<Admin> arrayList = new ArrayList<Admin>();
		arrayList.add(new Admin(1, "张三", "123456"));
		arrayList.add(new Admin(2, "李四", "123456"));
		arrayList.add(new Admin(3, "王五", "123456"));
		arrayList.add(new Admin(4, "赵六", "123456"));
		return arrayList;
	}
}