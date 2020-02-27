package com.neusoft.dao3;

import java.util.List;

import com.neusoft.entity.QueryVo;
import com.neusoft.entity.Student;

public interface StudentDao {

	
	List<Student> getAllStu();
	
	
	// 根据学生查询学生
	List<Student> queryStuByStuName(QueryVo qv);
	
	
	// 根据name和age查询学生
	List<Student> queryStuByNameAndAge(Student student);
	
} 