package com.neusoft.user;

import java.util.Scanner;

public class UserViewImpl implements UserView{

	
	
	
	@Override
	public void login() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎登录");
		System.out.println("请输入用户名:");
		String userName = scanner.next();
		System.out.println("请输入密码:");
		String psw = scanner.next();
		UserBizImpl userBizImpl = new UserBizImpl();
		userBizImpl.login(userName, psw);
	}

	@Override
	public void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("欢迎注册");
		System.out.println("请输入用户名:");
		String userName = scanner.next();
		System.out.println("请输入密码:");
		String psw = scanner.next();
		System.out.println("请再次输入密码:");
		String psw2 = scanner.next();
		System.out.println("请输入真实姓名:");
		String name = scanner.next();
		System.out.println("请输入邮箱:");
		String email = scanner.next();
		UserBizImpl userBizImpl = new UserBizImpl();
		userBizImpl.register(userName, psw, psw2, name, email);
	}
}
