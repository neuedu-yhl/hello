package com.neusoft.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.neusoft.entity.Student;
import com.neusoft.service.StudentService;
import com.neusoft.service.StudentServiceImpl;
import com.sun.xml.internal.ws.developer.SerializationFeature;

/**
 * Servlet implementation class StudentServ
 */
@WebServlet("/StudentServ")
public class StudentServ extends HttpServlet {
	
	// 持有service
	private StudentService ss;
	
    public StudentServ() {
    	ss = new StudentServiceImpl();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	response.setContentType("text/html;charSet=utf-8");
    	List<Student> allStu = ss.getAllStu();
		// 将集合的格式转换成json的格式
		String jsonString = JSON.toJSONString(allStu,SerializerFeature.WriteDateUseDateFormat);
		response.getWriter().print(jsonString);
    }
}