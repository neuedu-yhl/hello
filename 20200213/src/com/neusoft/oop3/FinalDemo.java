package com.neusoft.oop3;

import java.lang.reflect.Method;

public final class FinalDemo {

	// final修饰的引用数据类型 地址不可变 但是内容是可变的
	final int[] A;
	
	public FinalDemo() {
		A = new int[] {1,2,3,4,5};
		
	}
	
	public final void method() {
		System.out.println("父类的final方法");
	}
	
	
	
	public static void main(String[] args) {
//		A[1] = {5,6,7};
//		System.out.println(Arrays.toString(A));
	}
}