package com.neusoft.rpg2;

import java.util.Random;

public class GameCharacter {
	
	public GameCharacter() {
		
	}
	public GameCharacter(String name,char sex,String race,String occupy) {
		Random random = new Random();
		this.name = name;
		this.sex = sex;
		this.race = race;
		this.occupy = occupy;
		this.strength  = random.nextInt(9999);
		this.agile = random.nextInt(9999);
	}

	//姓名
	String name;
	
	//性别
	char sex;
	
	//种族
	String race;
	
	//职业
	String occupy;
	
	//力量
	int strength;
	
	//敏捷
	int agile;
	
	// 等级
	int level;
	
	// 金币
	int money;

	@Override
	public String toString() {
		return "GameCharacter [name=" + name + ", sex=" + sex + ", race=" + race + ", occupy=" + occupy + ", strength="
				+ strength + ", agile=" + agile + ", level=" + level + ", money=" + money + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}