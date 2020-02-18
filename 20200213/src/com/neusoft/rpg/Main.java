package com.neusoft.rpg;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Menu m = new Menu();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println("欢迎进入游戏！");
			System.out.println("请输入您的选择（1-3）");
			int num = scanner.nextInt();
			switch (num) {
			case 1:
				m.menu();
				break;
			case 2:
				System.out.println("游戏规则:xxxxxxxxxxxx");
				break;
			default:
				System.exit(0);
			}
		}
	}
}
