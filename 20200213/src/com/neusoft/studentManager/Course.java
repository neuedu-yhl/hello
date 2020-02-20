package com.neusoft.studentManager;

import java.util.List;

/**
 * 
 * @author Neuedu_yhl zhangsan ÀîËÄ
 * @Date 2020/02/20 11:14:00
 * @apiNote ¿Î³Ì
 * 
 */
public class Course {
	
	public Course() {
		
	}
	

	public Course(Integer cId, String courseName, List<Student> students) {
		super();
		this.cId = cId;
		this.courseName = courseName;
		this.students = students;
	}


	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", students=" + students + "]";
	}

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}

	private Integer cId;
	
	private String courseName;
	
	private List<Student> students;
	
}