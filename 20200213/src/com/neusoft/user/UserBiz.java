package com.neusoft.user;

public interface UserBiz {

	void register(String userName,String password,String password2,String name,String email);
	
	
	void login(String userName,String passWord);
	
	
}