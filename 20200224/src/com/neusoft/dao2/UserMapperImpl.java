package com.neusoft.dao2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.neusoft.entity.User;
import com.neusoft.util.SqlSessionFactoryUtils;

public class UserMapperImpl implements UserMapper{

	private SqlSessionFactory ssf = SqlSessionFactoryUtils.getSqlSessionFac();
	
	@Override
	public List<User> getAllUser() {
		SqlSession openSession = ssf.openSession();
		List<User> selectList = openSession.selectList("selectUser");
		openSession.close();
		return selectList;
	}
}