package com.api;

import java.util.*;

public class System_test {
	//获取当前系统属性
	public static void main(String[] args) {
		Properties properties =System.getProperties();
		System.out.println(properties);
		//获取所有系统属性的key(属性名),返回 Set对象
		Set<String>propertyNames =properties.stringPropertyNames ();
		for (String key : propertyNames) {
		//获取当前键key(属性值)所对应的值(属性值)	
			String value =System.getProperty(key);
			System.out.println(key +"---"+value);
		}

	}

}
