package com.neusoft.neuedu.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neusoft.neuedu.common.HigherResponse;
import com.neusoft.neuedu.dao.UserDao;
import com.neusoft.neuedu.entity.User;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public HigherResponse<User> login(String username, String psw,HttpServletRequest req) {
		User user = userDao.queryUser(username, psw);
		if(user == null) {
			return HigherResponse.getFailedRespon("用户名或密码错误");
		}
		req.getSession().setAttribute("user", user);
		return HigherResponse.getSuccessRespon(user);
	}

	@Override
	public HigherResponse<PageInfo<User>> queryUserByPage(Integer pageNum, Integer pageSize,HttpServletRequest req) {
		User attribute = (User)req.getSession().getAttribute("user");
		if(null == attribute) {
			return HigherResponse.getFailedRespon("未登陆,请登录后执行");
		}
		// 开启分页插件
		PageHelper.startPage(pageNum, pageSize);
		// 查询用户
		List<User> queryAllUsers = userDao.queryAllUsers();
		PageInfo<User> pageInfo = new PageInfo<User>(queryAllUsers);
		return HigherResponse.getSuccessRespon(pageInfo);
	}
}