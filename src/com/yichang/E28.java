package com.yichang;

public class E28 {

	public static void main(String[] args) {
		try {
			int result=divide(4,2);
		System.out.println(result);
		} catch (Exception e) {
			System.out.println("捕获到运行时的异常信息"+e.getMessage());
		}
		
		
	}
	
	private static int divide(int i,int j) {
		try {
			int result = i/j;
			return result;
		} catch (Exception e) {
			System.out.println("捕获到运行时的异常信息"+e.getMessage());
		}finally {
			System.out.println("无论如何都要执行finally代码块");
		}
			return -1;
	}

	
}
