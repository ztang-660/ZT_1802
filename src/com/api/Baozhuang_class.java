package com.api;

public class Baozhuang_class {

	public static void main(String[] args) {
		int a=20;
//自动装箱:将int这个基本数据类型的变量装到Integer这个引用数据类型的对象中	
		Integer b=a;
//自动装箱:将Integer这个引用数据类型的对象拆开变成int这个基本数据类型的变量		
		int c=b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//将字符串转成整形的三种方法
		String chengji="88";
		String chengji1="chengji+10";

		System.out.println("NO.1:包装类的方法valueOf方法---"+(Integer.valueOf(chengji)+10));
		System.out.println("NO.2:包装类的方法parseXXX方法---"+(Integer.parseInt(chengji)+10));
		System.out.println("NO.3:包装类的构造方法---"+(new Integer(chengji)+10));
		//整形转成字符型的三种方法	
		Integer zs=88;
		System.out.println("NO.1:包装类的valueOf方法--->"+String.valueOf(chengji));
		System.out.println("NO.2:String类的toString方法--->"+zs.toString());
		System.out.println("NO.3:空串连接整数法--->"+zs+"");

	}

}
