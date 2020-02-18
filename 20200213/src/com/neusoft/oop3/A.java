package com.neusoft.oop3;

public class A {

	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public A() {
		System.out.println("3");
	}
	public static void main(String[] args) {
		new A();
	}
}
class B extends A{
	static{
		System.out.println("4");
	}
	public B() {
		System.out.println("5");
	}
	{
		System.out.println("6");
	}
}