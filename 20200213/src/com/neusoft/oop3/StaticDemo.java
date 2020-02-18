package com.neusoft.oop3;

public class StaticDemo {

	//成员变量
	static int x;
	
	public void function() {
		System.out.println(x);
	}
	
	// 非static修饰可以访问static修饰
	// static修饰不可访问非static修饰
	public static void main(String[] args) {
		System.out.println(x);
	}
}