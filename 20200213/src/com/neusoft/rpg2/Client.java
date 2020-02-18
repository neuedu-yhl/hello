package com.neusoft.rpg2;

import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Client {
	
	// 创建存放游戏角色的数组
	GameCharacter[] gc = {};
	
	public static void main(String[] args) {
		new Client().initFrame();
	}
	
	/**
	 * 添加游戏角色
	 */
	public void addGamePlayer() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("请您添加对应的角色信息");
		System.out.println("请输入游戏角色名:");
		String name = scanner.next();
		System.out.println("请输入游戏性别:");
		String sex = scanner.next();
		System.out.println("请输入游戏种族:人类 精灵  兽人 矮人 元素)");
		String race = scanner.next();
		System.out.println("请输入游戏职业:");
		String occupy = scanner.next();
		// 构建游戏角色出来
		GameCharacter gameCharacter = new GameCharacter(name, sex.charAt(0), race, occupy);
		gc = Arrays.copyOf(gc, 1);
		gc[gc.length-1] = gameCharacter;
		if(gc.length!=0) {
			System.out.println("添加成功");
		}
		initFrame();
	}
	
	public void gameRules() {
		System.out.println("不能用外挂~");
		initFrame();
	}
	
	// 查询所有角色
	public void queryAllChar() {
		System.out.println("*****************游戏角色人物信息********************");
		for (int i = 0; i < gc.length; i++) {
			System.out.println(gc[i]);
		}
		System.out.println("*****************游戏角色人物信息********************");
		initFrame();
	}
	public void deleteChar() {
		System.out.println("删除功能待开发...");
		initFrame();
	}
	
	public void endGame() {
		System.out.println("欢迎再来~~~");
		System.exit(0);
	}
	
	public void nowTime() {
		System.out.println("当前时间");
		System.out.println(new Date());
		initFrame();
	}

	// 初始化窗口打印欢迎信息
	public void initFrame() {
		System.out.println("*****************这是一个RPG游戏********************");
		System.out.println("******1.游戏规则******");
		System.out.println("******2.结束游戏******");
		System.out.println("******3.添加游戏角色******");
		System.out.println("******4.查询所有角色******");
		System.out.println("******5.删除游戏角色******");
		System.out.println("******6.查看当前时间******");
		System.out.println("****************************************************");
	    Scanner scanner = new Scanner(System.in);
		System.out.println("请输入您要操作的功能");
		int nextInt = scanner.nextInt();
		switch (nextInt) {
		case 1:
			gameRules();
			break;
		case 2:
			endGame();
			break;
		case 3:
			addGamePlayer();
			break;
		case 4:
			queryAllChar();
			break;
		case 5:
			deleteChar();
			break;
		case 6:
			nowTime();
			break;
		default:
			System.out.println("输入有误,重新输入");
			initFrame();
			break;
		}
	}
}