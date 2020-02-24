package com.neusoft.dao;

import com.neusoft.entity.User;

public interface UserDao {

	// 添加数据
	int addOneUser(User user);
	
	// 判断用户是否存在
	boolean checkUserIsExists(User user);
	
}