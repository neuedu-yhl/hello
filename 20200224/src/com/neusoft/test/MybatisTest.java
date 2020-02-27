package com.neusoft.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.neusoft.dao.UserMapper;
import com.neusoft.dao3.StudentDao;
import com.neusoft.entity.QueryVo;
import com.neusoft.entity.Student;
import com.neusoft.entity.User;
import com.neusoft.util.SqlSessionFactoryUtils;

public class MybatisTest {


	
public static void main(String[] args) {

	SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
	SqlSession openSession = sqlSessionFac.openSession();
	StudentDao mapper = openSession.getMapper(StudentDao.class);
	Student student = new Student();
	student.setName("уе");
//	student.setAge(22);
	List<Student> queryStuByNameAndAge = mapper.queryStuByNameAndAge(student);
	System.out.println(queryStuByNameAndAge);

	}
}