package com.neusoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.AdminDao;
import com.neusoft.entity.Admin;

@Service
public class AdminServiceImpl implements AdminService {
	
	//  调用dao
	@Autowired
	private AdminDao adminDao;
	
	
	@Override
	public List<Admin> getAdmins() {
		return adminDao.getAllAdmin();
	}

}