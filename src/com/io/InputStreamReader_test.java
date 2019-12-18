package com.io;
import java.io.BufferedReader;
import java.io.InputStream;

public class InputStreamReader_test {

	public static void main(String[] args) throws Exception{
		//定义标准字节输入流
		//InputStream jpsr=System.in;
		//将标准字节输入流转成字符流
		//InputStreamReader ir=new InputStreamReader(jpsr);
		// 将字符流包装成缓冲字符流
		BufferedReader br =new BufferedReader(new java.io.InputStreamReader(System.in));
		System.out.println("自我介绍:");
		String line=br.readLine();
		System.out.println("请输入年龄:");
		String line1=br.readLine();
		System.out.println("您的年龄是:"+line1);
	}

}
