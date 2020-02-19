package com.neusoft.type;

public class Circle extends Shape{

	@Override
	public void shape() {
		System.out.println("圆形");
	}
	
	// 多态三个条件
	// 继承
	// 向上转型
	// 重写
	public static void main(String[] args) {
		// 赋值多态
		// Shape shape = new Circle();
		// shape.shape();
		Shape s= new Rectangel();
		s.shape();
	}
}