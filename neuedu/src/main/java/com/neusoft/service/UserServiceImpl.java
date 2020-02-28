package com.neusoft.service;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.neusoft.dao.UserDao;
import com.neusoft.entity.User;
import com.neusoft.util.SqlSessionFactoryUtils;

public class UserServiceImpl implements UserService{

	@Override
	public boolean checkUserExists(User user) {
		SqlSessionFactory sqlSessionFac = SqlSessionFactoryUtils.getSqlSessionFac();
		SqlSession openSession = sqlSessionFac.openSession();
		UserDao mapper = openSession.getMapper(UserDao.class);
		User checkUserIsExists = mapper.checkUserIsExists(user);
		if(null != checkUserIsExists) {
			return true;
		}
		return false;
	}
}