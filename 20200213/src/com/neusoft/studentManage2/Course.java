package com.neusoft.studentManage2;

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
	

	@Override
	public String toString() {
		return "Course [cId=" + cId + ", courseName=" + courseName + ", sId=" + sId + "]";
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


	public List<Integer> getsId() {
		return sId;
	}


	public void setsId(List<Integer> sId) {
		this.sId = sId;
	}


	public Course(Integer cId, String courseName, List<Integer> sId) {
		super();
		this.cId = cId;
		this.courseName = courseName;
		this.sId = sId;
	}


	private Integer cId;
	
	private String courseName;
	
	private List<Integer> sId;
	
}