package com.neusoft.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.UserDaoImpl;
import com.neusoft.entity.User;

/**
 * Servlet implementation class RegServelt
 */
@WebServlet("/RegServelt")
public class RegServelt extends HttpServlet {
	
	private UserDao userDao;
	
    public RegServelt() {
    	userDao = new UserDaoImpl();
    }
    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		String flag = req.getParameter("flag");
		System.out.println("flag"+flag);
		if("1".equals(flag)) {
			String parameter = req.getParameter("username");
	    	boolean checkUserNameIsExists = userDao.checkUserNameIsExists(parameter);
	    	if(checkUserNameIsExists ==  true) {
	    		resp.getWriter().print("用户名已存在");
	    		return;
	    	}else{
	    		resp.getWriter().print("用户名可以注册");
	    		return;
	    	}
		}
		if("2".equals(flag)) {
			// 注册操作
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			User user = new User(null, username, password, null);
			int addOneUser = userDao.addOneUser(user);
			resp.getWriter().print(addOneUser);
			return;
		}
    }
}