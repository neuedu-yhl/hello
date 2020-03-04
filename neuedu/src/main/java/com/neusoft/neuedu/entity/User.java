package com.neusoft.neuedu.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

	private Integer id;
	
	private String userName;
	
	private String passWord;
	
	private Date regdate;
	
}