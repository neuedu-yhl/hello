package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.entity.Admin;
import com.neusoft.service.AdminService;

@Controller
public class AdminCon {

	@Autowired
	private AdminService adminService;
	
	@RequestMapping("/getAdmin.do")
	@ResponseBody
	public List<Admin> getAdmin(){
		return adminService.getAdmins();
	}
}