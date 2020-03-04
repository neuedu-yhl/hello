package com.neusoft.neuedu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.dao.UserDao;
import com.neusoft.neuedu.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public HigherResponse<User> login(String username, String psw) {
		User user = userDao.queryUser(username, psw);
		if(user == null) {
			return HigherResponse.getFailedRespon("用户名或密码错误");
		}
		return HigherResponse.getSuccessRespon(user);
	}
}