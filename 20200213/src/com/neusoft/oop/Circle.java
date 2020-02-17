package com.neusoft.oop;

/**
 * 创建圆的类
 * @author Neuedu
 *
 */
public class Circle {
	
	public static void main(String[] args) {
		// 构建圆心
		Point point2 = new Point(1,1);
		Circle circle = new Circle(point2, 1);
		boolean contain = circle.isContain(2, 2);
		System.out.println(contain);
	}
	public Circle() {
		
	}
	public Circle(Point p,int r) {
		this.point = p;
		this.r = r;
	}
	// 计算圆的面积
	public double area() {
		return Math.PI*r*r;
	}
	
	// 计算当前图形是否包含指定的点?
	// 返回true的话就是包含(圆上和圆内)
	public boolean isContain(int x,int y) {
		return this.point.distance(x, y) <= r;
	}
	
    
	Point point;
	
	int r;
	
}