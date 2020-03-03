package com.neusoft.BootDemo.entity;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

	
	// 创建person
	@Bean
	public Person getPerson() {
		return new Person(18, "张三", '男');
	}
}