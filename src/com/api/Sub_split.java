package com.api;

public class Sub_split {

	public static void main(String[] args) {
		String s="2019-10-12";
		System.out.println("今天是"+s.substring(8)+"号");
		System.out.println("本月是"+s.substring(5,7)+"月");
		System.out.println("今年是"+s.substring(0,4)+"年");
		//split方法将字符串通过制定的分隔符进行分割,得到一个字符串数组
		String[] zfcsz=s.split("-");
		System.out.println("今天是"+zfcsz[0]+"年"+zfcsz[1]+"月"+zfcsz[2]+"日");
	}

}
