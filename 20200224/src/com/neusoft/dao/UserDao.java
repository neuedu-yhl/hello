package com.neusoft.dao;

import java.util.List;

import com.neusoft.entity.User;

public interface UserDao {

	// 添加数据
	int addOneUser(User user);
	
	// 判断用户是否存在
	boolean checkUserIsExists(User user);
	
	// 查询所有用户
	List<User> queryAllUser();
	
}