package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInputStream_test {

	public static void main(String[] args) throws Exception{

	FileInputStream fin =new FileInputStream("d:\\tp.jpg");
	FileOutputStream fout=new FileOutputStream("tp.jpg");
	long kssj=System.currentTimeMillis();
	int b=fin.read();
	byte[]zjhc=new byte[1024];
	while(b!=-1){
		//System.out.print((char)b);
		fout.write(zjhc,0,b);
		b=fin.read(zjhc);
	}

	long jssj=System.currentTimeMillis();
	System.out.println("拷贝121kb图片文件耗时"+(jssj-kssj)+"毫秒");
	fin.close();
	fout.close();
	}

}
