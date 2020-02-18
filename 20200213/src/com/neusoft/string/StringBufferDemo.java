package com.neusoft.string;

import java.util.ArrayList;

public class StringBufferDemo {

	
	public static void main(String[] args) {
		// String = final char[] 
		// StringBuffer ---> char[]
		StringBuffer stringBuffer = new StringBuffer();
		
		stringBuffer.append("hello").append("word").append("nihao");
		System.out.println(stringBuffer);
		
//		StringBuffer delete = stringBuffer.delete(1, 5);
//		System.out.println(delete);
		
//		StringBuffer insert = stringBuffer.insert(0, "today");
//		System.out.println(insert);
		
//		StringBuffer replace = stringBuffer.replace(1, 5, "friday");
//		System.out.println(replace);
		
		StringBuffer reverse = stringBuffer.reverse();
		System.out.println(reverse);
	
		
		// stringBuilder用法和stringBuffer 99%
		// synchronized
		
		StringBuilder stringBuilder = new StringBuilder();
		
		// 集合
		// List
		// 泛型
		ArrayList<Student> arrayList = new ArrayList<Student>();
		Student student = new Student("郭德纲", 500, 50, "讲段子");
		arrayList.add(new Student("李四", 500, 50, "喝酒"));
		arrayList.add(student);
		arrayList.add(new Student("于谦", 500, 50, "烫头"));
		arrayList.add(new Student("孟鹤堂", 500, 50, "被队友怼"));
		arrayList.add(new Student("烧饼", 500, 50, "吃烧饼"));
		System.out.println(arrayList);
		
//		arrayList.remove(student);
		
		System.out.println(arrayList);
		
		arrayList.set(0, new Student("周润发", 500, 50, "喝酒"));
		
		System.out.println(arrayList);
		
		
	}
}