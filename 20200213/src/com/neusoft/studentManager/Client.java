package com.neusoft.studentManager;

import java.util.List;
import java.util.Scanner;

public class Client {
	

	
	
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
		List<Course> courses = School.courses;
		for(Course c:courses) {
			System.out.print("课程编号:"+c.getcId()+",课程名:"+c.getCourseName());
		}
		System.out.println();
		String cNum = scanner.next();
		// 50-51-52    学生添加选课信息
		String[] split = cNum.split("-");
		
		
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
			break;
		default:
			System.out.println("非法输入,请重新输入");
			launchFrame();
			break;
		}
	}
}