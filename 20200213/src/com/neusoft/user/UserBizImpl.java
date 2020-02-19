package com.neusoft.user;

import java.util.ArrayList;
import java.util.List;

public class UserBizImpl implements UserBiz {

	List<User> users = new ArrayList<User>();
	
	{
		User user = new User("admin","admin","administrator","admin@123.com");
		User user2 = new User("tom","cat","tomcat","tomcat@cat.com");
		users.add(user);
		users.add(user2);
	}
	
	
	@Override
	public void register(String userName, String password, String password2, String name, String email) {
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUserName().equals(userName)) {
				System.out.println("用户名已存在~");
				return;
			}
		}
		if(!password.equals(password2)) {
			System.out.println("两次密码不一致");
			return;
		}
		User user = new User(userName, password2, name, email);
		users.add(user);
		System.out.println("注册成功,查看所有用户"+users);
	}

	@Override
	public void login(String userName, String passWord) {
		for(int i=0;i<users.size();i++) {
			User user = users.get(i);
			if(!user.getUserName().equals(userName)) {
				System.out.println("用户名不存在~");
				return;
			}
			if(!user.getPassWord().equals(passWord)) {
				System.out.println("用户名和密码不匹配");
				return;
			}
			System.out.println("登录成功");
			break;
		}
	}
}
