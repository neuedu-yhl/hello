package com.neusoft.neuedu.service;

import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.entity.User;

public interface UserService {

	HigherResponse<User> login(String username,String psw);
	
}