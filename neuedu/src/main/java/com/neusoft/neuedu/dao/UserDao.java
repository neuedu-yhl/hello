package com.neusoft.neuedu.dao;

import org.apache.ibatis.annotations.Param;

import com.neusoft.neuedu.entity.User;

public interface UserDao {

	
	User queryUser(@Param("username")String username,@Param("psw")String psw);
	
	
}