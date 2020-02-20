package com.neusoft.studentManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
	

	public static void main(String[] args) {
		new Client().launchFrame();
		
	}
	
	public void queryStudent() {
		System.out.println("欢迎来到查询学生页面");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要查询的学生姓名");
		String name = scanner.next();
		boolean flag = false;
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			if(student.getStuName().equals(name)) {
				flag = true;
				System.out.println("查询到的学生信息为:"+student);
			}
		}
		if(flag == false) {
			System.out.println("没有查询到学生信息...");
		}
		studentInfoManager();
	}
	
	public void deleteStudent() {
		System.out.println("欢迎来到修改学生页面");
		System.out.println("所有学生信息:"+School.students);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入要删除学生的学号");
		int sId = scanner.nextInt();
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			if(student.getsId() == sId) {
				School.students.remove(i);
			}
		}
		System.out.println("删除成功~");
		System.out.println("所有学生信息:"+School.students);
		studentInfoManager();
	}
	
	
	public void updateStudent() {
		System.out.println("欢迎来到修改学生页面");
		System.out.println("所有学生信息:"+School.students);
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入修改学生的学号");
		int sId = scanner.nextInt();
		for(int i=0;i<School.students.size();i++) {
			Student student = School.students.get(i);
			// 找到了要修改的学生
			if(student.getsId() == sId) {
				System.out.println("请输入修改后的姓名");
				String sName = scanner.next();
				System.out.println("请输入修改后的性别");
				String sSex = scanner.next();
				System.out.println("请输入修改后的地址");
				String sAddRess = scanner.next();
				student.setStuName(sName);
				student.setSex(sSex.charAt(0));
				student.setStuAddress(sAddRess);
			}
		}
		System.out.println("修改成功...");
		System.out.println("学生信息:"+School.students);
		studentInfoManager();
	}
	
	public void addStudent() {
		System.out.println("欢迎来到增加学生页面");
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入学生的学号");
		int sId = scanner.nextInt();
		System.out.println("请输入学生的姓名");
		String sName = scanner.next();
		System.out.println("请输入学生的性别");
		String sSex = scanner.next();
		System.out.println("请输入学生的地址");
		String sAddRess = scanner.next();
		System.out.print("请添加选课信息编号(编号之间用-分隔):");
		Student student = new Student(sId, sName, sSex.charAt(0), sAddRess, new ArrayList<Course>());
		List<Course> courses = School.courses;
		for(Course c:courses) {
			System.out.print("课程编号:"+c.getcId()+",课程名:"+c.getCourseName());
		}
		System.out.println();
		String cNum = scanner.next();
		// 50-51-52    学生添加选课信息            50-51-52  拿到对应的课程信息然后添加当前的学生
		String[] split = cNum.split("-");
		for(int i=0;i<courses.size();i++) {
			for(int j=0;j<split.length;j++) {
				if(courses.get(i).getcId() == Integer.parseInt(split[j])) {
					// 把选择的课程信息添加学生的courses变量中
					student.getCourses().add(courses.get(i));
				}
			}
		}
		// 将学生信息添加到学校的学生集合中
		School.students.add(student);
		System.err.println("添加成功");
		studentInfoManager();
	}
	
	public void studentInfoManager() {
		System.out.println("欢迎来到学生信息管理界面");
		System.out.println("1.增加学生");
		System.out.println("2.修改学生");
		System.out.println("3.删除学生");
		System.out.println("4.查询学生");
		System.out.println("5.返回上一级");
		System.out.println("请输入要操作的功能:(1-6)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			addStudent();
			break;
		case 2:
			updateStudent();
			break;
		case 3:
			deleteStudent();
			break;
		case 4:
			queryStudent();
			break;
		case 5:
			launchFrame();
			break;
		default:
			System.err.println("输入有误.请重新输入");
			studentInfoManager();
			break;
		}
	}

	public void launchFrame() {
		System.out.println("欢迎来到xxx学生管理系统");
		System.out.println("1.学生信息管理");
		System.out.println("2.课程信息管理");
		System.out.println("3.查询学生选课情况");
		System.out.println("4.查询课程被选情况");
		System.out.println("5.学生添加选课");
		System.out.println("6.学生删除选课");
		System.out.println("请输入您要操作的功能:数字(1-6)");
		Scanner scanner = new Scanner(System.in);
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			studentInfoManager();
			break;
		default:
			System.out.println("非法输入,请重新输入");
			launchFrame();
			break;
		}
	}
}