package com.api;

public class E52 {
	public static void main(String[] args) {
		String string="abcabcbacdba";
		System.out.println("字符串的长度为:"+string.length());
		System.out.println("字符串中的第一个字符:"+string.charAt(0));
		System.out.println("字符c第一次出现的位置"+string.indexOf('c'));
		System.out.println("字符c最后一次出现的位置"+string.lastIndexOf('c'));
		System.out.println("子字符第一次出现的位置"+string.indexOf("ab"));
		System.out.println("子字符最后一次出现的位置"+string.lastIndexOf("ab"));

	}

}
