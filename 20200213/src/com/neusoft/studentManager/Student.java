package com.neusoft.studentManager;

import java.util.List;

/**
 * 
 * @author Neuedu_YHL
 * @Date 2020/02/20 11:07
 * @apiNote Ñ§ÉúÀà
 */
public class Student {

	public Student() {
		
	}
		
	

	public Student(Integer sId, String stuName, Character sex, String stuAddress, List<Course> courses) {
		this.sId = sId;
		this.stuName = stuName;
		this.sex = sex;
		this.stuAddress = stuAddress;
		this.courses = courses;
	}



	@Override
	public String toString() {
		return "Student [sId=" + sId + ", stuName=" + stuName + ", sex=" + sex + ", stuAddress=" + stuAddress
				+ ", courses=" + courses + "]";
	}



	public Integer getsId() {
		return sId;
	}

	public void setsId(Integer sId) {
		this.sId = sId;
	}

	public String getStuName() {
		return stuName;
	}

	public void setStuName(String stuName) {
		this.stuName = stuName;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public String getStuAddress() {
		return stuAddress;
	}

	public void setStuAddress(String stuAddress) {
		this.stuAddress = stuAddress;
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}



	private Integer sId;
	
	private String stuName;
	
	private Character sex;
	
	private String stuAddress;
	
	private List<Course> courses;
		
}