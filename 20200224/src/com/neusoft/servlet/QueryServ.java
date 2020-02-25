package com.neusoft.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.UserDaoImpl;
import com.neusoft.entity.User;

/**
 * Servlet implementation class QueryServ
 * localhost:8080/20200224/QueryServ
 * localhost:8080/
 */
@WebServlet("/QueryServ")
public class QueryServ extends HttpServlet {
	
	private UserDao userDao;
	
    public QueryServ() {
    	userDao = new UserDaoImpl();
    }

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<User> queryAllUser = userDao.queryAllUser();
		req.setAttribute("list", queryAllUser);
		req.getRequestDispatcher("WEB-INF/web.jsp").forward(req, resp);
	}
}
