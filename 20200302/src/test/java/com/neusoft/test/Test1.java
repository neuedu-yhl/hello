package com.neusoft.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.neusoft.entity.Admin;
import com.neusoft.service.AdminService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test1 {

	@Autowired
	private AdminService adminService;
	
	@Test
	public void test() {
		List<Admin> admins = adminService.getAdmins();
		System.out.println(admins);
	}
}