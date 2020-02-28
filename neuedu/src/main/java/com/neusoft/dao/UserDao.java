package com.neusoft.dao;

import com.neusoft.entity.User;

public interface UserDao {

	User checkUserIsExists(User user);
	
}