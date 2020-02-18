package com.neusoft.string;

/**
 * String
 * @author Neuedu
 */
public class StringDemo {

	/**
	 * String = final char[];
	 * String str = "hello";
	 * str = "helloworld";
	 */
	/**
	 * equals比较内容
	 */
	String str = " hel lo ";
	public void word() {
		// 根据下表取字符
		char charAt = str.charAt(0);
		
		// length() 
		int length = str.length();
		
		// trim();
		String trim = str.trim();
		System.out.println(trim);
		
		String upperCase = str.toUpperCase();
		System.out.println(upperCase);
		
		// indexOf()
		int indexOf = str.indexOf("h");
		System.out.println(indexOf);
		
		// endsWith()
		boolean endsWith = str.endsWith(" ");
		System.out.println(endsWith);
		
		// substring();
		String substring = str.substring(1,3);
		System.out.println(substring);
		
		// toCharArray();
		char[] charArray = str.toCharArray();
		
		// char[]
		char[] c = {'a','b','c'};
		String string = new String(c);
		String valueOf = String.valueOf(c);
		String valueOf2 = String.valueOf(5);
		
	}
	
	public static void main(String[] args) {
		new StringDemo().word();
	}
}