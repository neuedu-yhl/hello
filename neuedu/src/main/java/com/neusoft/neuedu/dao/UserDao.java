package com.neusoft.neuedu.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.neusoft.neuedu.entity.User;

public interface UserDao {

	
	User queryUser(@Param("username")String username,@Param("psw")String psw);
	
	
	// 查询用户
	List<User> queryAllUsers();
	
	
}