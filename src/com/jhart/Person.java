package com.jhart;

public class Person {
	public String sfzh;
	public String name;
	public String getSfzh() {
		return sfzh;
	}
	public void setSfzh(String sfzh) {
		this.sfzh = sfzh;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person() {}
	public Person(String sfzh, String name) {
		super();
		this.sfzh = sfzh;
		this.name = name;
	}
	public Person(String string, int i) {
		// TODO 自动生成的构造函数存根
	}
	
	
}
