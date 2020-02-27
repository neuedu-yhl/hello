package com.neusoft.entity;

import java.util.Date;

public class Student {
	
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", name=" + name + ", birthday=" + birthday + "]";
	}



	public Student(String id, Integer age, String name, Date birthday) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.birthday = birthday;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}



	private String id;
	
	private Integer age;
	
	private String name;
	
	private Date birthday;
	
}