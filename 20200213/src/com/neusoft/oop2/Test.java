package com.neusoft.oop2;

public class Test {
	public static void main(String[] args) {
		Student student = new Student("张三",100,20,"学习");
		// 如果一个类不显式地声明继承的父类,那么这个类的父类就是object
		// Object ---》 所有类的祖宗
		// java.lang.
		System.out.println(student);
	}
}