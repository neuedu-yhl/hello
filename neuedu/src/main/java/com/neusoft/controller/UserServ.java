package com.neusoft.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.User;
import com.neusoft.service.UserService;
import com.neusoft.service.UserServiceImpl;

/**
 * Servlet implementation class UserServ
 */
@WebServlet("/UserServ")
public class UserServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	private UserService userService;
	
    public UserServ() {
    	userService = new UserServiceImpl();
    }


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	resp.setContentType("text/html;charSet=utf-8");
    	String username = req.getParameter("username");
    	String password = req.getParameter("password");
    	User user = new User(null, username, password, null);
    	boolean checkUserExists = userService.checkUserExists(user);
    	resp.getWriter().print(checkUserExists);
    }
}
