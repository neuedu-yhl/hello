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
		// �����������
		req.setCharacterEncoding("utf-8");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		User user = new User(null, username, password, null);
		boolean checkUserIsExists = userDao.checkUserIsExists(user);
		System.out.println(checkUserIsExists);
		if(checkUserIsExists == true) {
			// ת��
			req.setAttribute("info", "��¼�ɹ�");
			req.getRequestDispatcher("WEB-INF/web.jsp").forward(req, resp);
			return;
		}
		System.out.println("����������˻�");
		// ��һ��session��ֵ
		// Session �Ự
		req.getSession().setAttribute("info", "�����ڴ��˻�");
		// �ض���
		resp.sendRedirect("error.jsp");
	}
}