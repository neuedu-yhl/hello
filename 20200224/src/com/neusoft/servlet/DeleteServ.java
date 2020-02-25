package com.neusoft.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.dao.UserDao;
import com.neusoft.dao.UserDaoImpl;

/**
 * Servlet implementation class DeleteServ
 */
@WebServlet("/DeleteServ")
public class DeleteServ extends HttpServlet {
	
	private UserDao userDao;
	
    public DeleteServ() {
    	userDao = new UserDaoImpl();
    }


    
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String id = req.getParameter("id");
    	int userId = Integer.parseInt(id);
    	int deleteUserById = userDao.deleteUserById(userId);
    	resp.sendRedirect("QueryServ");
    }
}
