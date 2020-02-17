package com.neusoft.oop;

// 父类 基类 超类
/**
 *  子类继承父类(基类、超类)的属性和方法
	构造器不能继承！
	实例化子类，会递归分配所有父类的空间
	子类构造器一定调用父类构造器
	类一定有构造器（父类、子类）
 * @author Neuedu
 *
 */
public class CarTwoZero extends Car {

	
	// 方法重写 覆写
	// 重载
	public void run() {
		System.out.println("非常极速地运动");
	}
}