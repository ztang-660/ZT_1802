package com.jihe;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.FileNotFoundException;
import java.util.Properties;
public class Properties_test {
	public static void main(String[] args) throws Exception{

		Properties pps =new Properties();
		
		pps.load(new FileInputStream("d:\\test.properties"));
		
		
		pps.forEach((k,v)->System.out.println(k +"="+v));
		
		FileOutputStream outputStream =new FileOutputStream("t.properties");
		
		pps.setProperty("charset","UTF-8");
		
		pps.store(outputStream,"新增charset编码");

	}

}
