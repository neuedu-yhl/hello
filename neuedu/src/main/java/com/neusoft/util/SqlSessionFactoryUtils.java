package com.neusoft.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtils {

	public static void main(String[] args) {
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		System.out.println(sqlSessionFac);
	}
	
	public static SqlSessionFactory getSqlSessionFac() {
		
		SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
		InputStream resourceAsStream = null;
		try {
			
			resourceAsStream = Resources.getResourceAsStream("SqlMapConfig.xml");
		} catch (IOException e) {
			e.printStackTrace();
		}
		// sqlSessionFactoryBuilder+SqlMapConfig.xml ����SqlSessionFactory
		SqlSessionFactory build = sqlSessionFactoryBuilder.build(resourceAsStream);
		return build;
	}
}