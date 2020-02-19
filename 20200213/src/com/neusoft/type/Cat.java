package com.neusoft.type;

public class Cat extends Animal2{
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	private String name;
	
	private String type;
	
	public Cat() {
		
	}
	
	@Override
	public void eat() {
		System.out.println("我是英短,吃的慢对胃口好");
	}
}