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
 * Servlet implementation class ActionServ
 * Servlet �����ڷ���˵�Class
 */
@WebServlet("/ActionServ")
public class ActionServ extends HttpServlet {
	 
	
	private UserDao userDao;
	
	
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActionServ() {
        userDao = new UserDaoImpl();
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	String parameter = req.getParameter("username");
    	String parameter2 = req.getParameter("password");
    	System.out.println(parameter);
    	System.out.println(parameter2);
    	// �������ж�
    	if(null == parameter || parameter.length() == 0) {
    		System.out.println("�û���Ϊ��");
    		return;
    	}
    	if(null ==  parameter2 || parameter2.length() == 0) {
    		System.out.println("����Ϊ��");
    		return;
    	}
    	// ����dao�ķ���
    	User user = new User(null, parameter, parameter2, null);
    	int addOneUser = userDao.addOneUser(user);
    	if(0 == addOneUser) {
    		System.out.println("ע��ʧ��...");
    		//ͣ���ڵ�ǰҳ��
    		// �ض���
    		resp.sendRedirect("index.jsp");
    	}else {
    		// ת��������ҳ��
    		req.getRequestDispatcher("login.jsp").forward(req, resp);
    	}
    }
}