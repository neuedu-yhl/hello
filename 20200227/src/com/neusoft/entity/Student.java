package com.neusoft.entity;

import java.util.Date;

public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", birthDay=" + birthDay + "]";
	}






	public Student(String id, Integer age, String name, Date birthDay) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.birthDay = birthDay;
	}






	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}






	private String id;
	
	private Integer age;
	
	private String name;
	
	private Date birthDay;
	
}