package com.neusoft.type;

public abstract class Animal2 {
	public Animal2() {
		System.out.println("抽象父类");
	}
	// 抽象方法
	// 只有声明没有实现
	public abstract void eat();
	
	public void test() {
		System.out.println("test");
	}
}