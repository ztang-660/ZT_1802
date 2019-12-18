package com.jhart;

import java.util.Set;

public class Students_test {

	public static void main(String[] args) {
		//对象的创建 类名 对象名称 = new 类名()  也就是new +构造方法
		Student s1=new Student();
		s1.setName("miku");
		s1.setScore(600);
		Student s2=new Student("koala",500);
		System.out.println(s1.getName()+"考了"+s1.getScore()+"分");
		System.out.println(s2.getName()+"考了"+s2.getScore()+"分");
		
		Course c1=new Course();
		c1.setCourse_name("Java程序设计");
		c1.setCourse_book("java基础入门");
		System.out.println(c1.getCourse_name()+"这门课使用的教材是《"+c1.getCourse_book()+"》");
	}
}
