package com.neusoft.studentManager;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Neuedu_yhl
 * @Date 2020/02/20 
 * 学校类
 */
public class School {

	// 数据只有一份
	
	static List<Student> students = new ArrayList<Student>();
	
	static List<Course> courses = new ArrayList<Course>();
	
	
	static {
		students.add(new Student(1, "张三", '男', "山西省", new ArrayList<Course>()));
		students.add(new Student(2, "李四", '女', "陕西省", new ArrayList<Course>()));
		students.add(new Student(3, "王五", '男', "河北省", new ArrayList<Course>()));
		students.add(new Student(4, "赵六", '女', "河南省", new ArrayList<Course>()));
		students.add(new Student(5, "孙七", '男', "山东省", new ArrayList<Course>()));
		courses.add(new Course(50, "软件工程", new ArrayList<Student>()));
		courses.add(new Course(51, "财务", new ArrayList<Student>()));
		courses.add(new Course(52, "土木", new ArrayList<Student>()));
		courses.add(new Course(53, "法学", new ArrayList<Student>()));
		courses.add(new Course(54, "礼仪", new ArrayList<Student>()));
	}
}