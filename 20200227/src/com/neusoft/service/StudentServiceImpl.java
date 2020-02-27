package com.neusoft.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.neusoft.dao.StudentDao;
import com.neusoft.entity.Student;
import com.neusoft.util.SqlSessionFactoryUtils;

public class StudentServiceImpl implements StudentService {

	@Override
	public List<Student> getAllStu() {
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		SqlSession openSession = sqlSessionFac.openSession();
		StudentDao mapper = openSession.getMapper(StudentDao.class);
		List<Student> queryAllStu = mapper.queryAllStu();
		return queryAllStu;
	}

}