package com.api;

public class Jssj {

	public static void main(String[] args) {
		long kssj=System.currentTimeMillis();
		int sum=0;
		for (long i = 0; i < 10000000000L; i++) {
			sum+=i;	
		}
		long jssj=System.currentTimeMillis();
		System.out.println("从0加到1亿耗时"+(jssj-kssj)+"毫秒");

	}

}
