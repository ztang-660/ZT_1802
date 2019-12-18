package com.api;

import javax.imageio.ImageTypeSpecifier;

public class E53 {
	public static void main(String[] args) {
	String s1="a1我b和4我ca的5b祖5c国1b一1a刻4c也7不d5能ba分.j割pg";
	if(s1.startsWith("a")) {
		System.out.println("字符串s1以a开头");
	}
	if(s1.endsWith("jpg")) {
		System.out.println("字符串s1以jpg结尾");
	}
	if(s1.contains("cba")) {
		System.out.println("字符串s1包含cba这个子串");
	}
	if(s1.isEmpty()) {
		System.out.println("字符串s1不是空的");
		
	System.out.println("字符串s1的每个字符是:");
	}
	char[] zfsz=s1.toCharArray();
		for (int i =0;i< zfsz.length;i++) {
		char c =zfsz[i];
				if(i==zfsz.length-1) {
		System.out.println(c);
				}else
		System.out.print(c+" ");
	}
	
	System.out.println();
	System.out.println("字符串里的数字有:");
	//foreach循环:对于字符数组里的每个字符
	//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者数组
	for(char zf : zfsz) {
		if (zf>='0'&&zf<='9') {
			System.out.print(zf+"");
		}
	}
	
	System.out.println();
	System.out.println("字符串里的汉字有:");
	//foreach循环:对于字符数组里的每个字符
	//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者数组
	for(char zf : zfsz) {
		if (zf>='\u4E00'&&zf<='\u9FA5') {
			System.out.print(zf);
		}
	}
	System.out.println();
	System.out.println("字符串里的字母有:");
	//foreach循环:对于字符数组里的每个字符
	//冒号前面是集合或者数组里的单个元素,冒号后面是集合或者数组
	for(char zf : zfsz) {
		if (zf>='a'&&zf<='z') {
			System.out.print(zf+"");
		}
	}
	}	
}


