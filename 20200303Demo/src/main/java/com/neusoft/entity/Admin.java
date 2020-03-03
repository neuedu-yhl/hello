package com.neusoft.entity;

import lombok.Data;

@Data
public class Admin {

	public Admin() {
		
	}

	public Admin(Integer id, String userName, String passWord) {
		super();
		this.id = id;
		this.userName = userName;
		this.passWord = passWord;
	}

	private Integer id;
	
	private String userName;
	
	private String passWord;
	
}