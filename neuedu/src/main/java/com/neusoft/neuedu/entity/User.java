package com.neusoft.neuedu.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

	private Integer id;
	
	private String userName;
	
	private String passWord;
	
	private String email;
	
	private String phone;
	
	private String question;
	
	private String answer;
	
	private byte role;
	
	private Timestamp create_time;
	
	private Timestamp update_time;
	
	private String ip;
		
}