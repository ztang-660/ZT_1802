package com.io;

import java.io.BufferedReader;
import java.io.InputStream;

public class InputStreamReader {

	public static void main(String[] args) throws Exception{
		//定义标准字节输入流
		InputStream jpsr=System.in;
		//将标准字节输入流转成字符流
		InputStreamReader ir=new InputStreamReader(jpsr);
		// TODO 自动生成的方法存根
		=new BufferedReader(ir);
	}

}
