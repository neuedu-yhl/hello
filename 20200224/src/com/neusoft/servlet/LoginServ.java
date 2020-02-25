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
 * Servlet implementation class LoginServ
 */
@WebServlet("/LoginServ")
public class LoginServ extends HttpServlet {
	
	private UserDao userDao;
	
    public LoginServ() {
    	userDao = new UserDaoImpl();
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 设置请求编码
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		User user = new User(null, username, password, null);
		boolean checkUserIsExists = userDao.checkUserIsExists(user);
		System.out.println(checkUserIsExists);
		if(checkUserIsExists == true) {
			// 转发
			req.setAttribute("info", "登录成功");
			req.getRequestDispatcher("WEB-INF/web.jsp").forward(req, resp);
			return;
		}
		System.out.println("不存在这个账户");
		// 往一个session放值
		// Session 会话
		req.getSession().setAttribute("info", "不存在此账户");
		// 重定向
		resp.sendRedirect("error.jsp");
	}
}
