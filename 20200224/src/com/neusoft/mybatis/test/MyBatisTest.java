package com.neusoft.mybatis.test;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisTest {

	
	public static SqlSessionFactory getSqlSessionFac() throws IOException {
		
		return null;
	}
	
	public static void main(String[] args) throws IOException {
		// 构建sqlSessionFactoryBuilder
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream resourceAsStream = Resources.getResourceAsStream("config/SqlMapConfig.xml");
		// sqlSessionFactoryBuilder+SqlMapConfig.xml 生成SqlSessionFactory
		SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
		SqlSession openSession = build.openSession();
		
		// 添加sql语句
//		User user = new User(null, "周润发", "123456", null);
//		int insert = openSession.insert("addOneUser", user);
//		openSession.commit();
//		System.out.println(insert);
		
		
		// 修改
//		User user = new User(6, "周星驰", "123456", null);
//		int update = openSession.update("UpdateOneUser", user);
//		openSession.commit();
//		System.out.println(update);
		
		
		// 删除
		int delete = openSession.delete("deleteUser", 6);
		openSession.commit();
		System.out.println(delete);
	}
}