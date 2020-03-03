package com.neusoft.BootDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.neusoft.BootDemo.entity.Person;

@Controller
public class HelloBoot {

	@Autowired
	private Person person;
	
	@ResponseBody
	@RequestMapping("/hello.do")
	public String hello() {	
		System.out.println(person);
		return "this is a springboot app";
	}
}