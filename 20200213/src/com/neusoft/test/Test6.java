package com.neusoft.test;

public class Test6 {

	public static int f(int x) {
		return x%3;
	}
	
	public static int f2(int x) {
		return x++;
	}
	
	public static void main(String[] args) {
		System.out.println(f(1));
		System.out.println(f2(3));
	}
}