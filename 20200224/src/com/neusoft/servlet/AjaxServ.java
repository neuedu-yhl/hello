package com.neusoft.servlet;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neusoft.entity.User;

/**
 * Servlet implementation class AjaxServ
 */
@WebServlet("/AjaxServ")
public class AjaxServ extends HttpServlet {
	
    public AjaxServ() {
       
    }
    
    @Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
    	User user = new User(1, "张三", "123456", new java.util.Date());
		User user2 = new User(2, "张三2", "123456", new java.util.Date());
		User user3 = new User(3, "张三3", "123456", new java.util.Date());
		ArrayList<User> arrayList = new ArrayList<User>();
		arrayList.add(user);
		arrayList.add(user2);
		arrayList.add(user3);
    	resp.getWriter().print(arrayList);
	}
}