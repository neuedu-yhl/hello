package com.neusoft.neuedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.neuedu.dao.UserDao;
import com.neusoft.neuedu.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	
	@Override
	public List<User> getAllUsers() {
		return userDao.queryUsers();
	}

}
