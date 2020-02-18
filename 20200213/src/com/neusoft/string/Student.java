package com.neusoft.string;

public class Student{

	public Student() {
		
	}
	
	public Student(String name,int id,int age,String hobby) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.hobby = hobby;
	}
	
	String name;
	
	int id;
	
	int age;
	
	String hobby;
	
	@Override
	public String toString() {
		return "name:"+name+",id"+id+",age"+age+",°®ºÃ"+hobby;
	}
}