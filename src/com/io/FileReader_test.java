package com.io;

import java.awt.Frame;
import java.io.*;

public class FileReader_test {

	public static void main(String[] args) throws Exception{

		FileReader fileReader=new FileReader("d:\\test.txt");
		FileWriter fileWriter=new FileWriter("test1.txt");
		fileWriter.write("再别康桥\r\n");
		fileWriter.write("\t------徐志摩\r\n");
		fileWriter.write("轻轻地我走了\r\n");
		fileWriter.write("正如我轻轻地来\r\n");
		fileWriter.write("我轻轻地招手\r\n");
		fileWriter.write("作别西天的\r\n");
		
		char []buff=new char[2048];
		int len =fileReader.read(buff);
		while (len !=-1) {
			System.out.print((char)len);
			len=fileReader.read();
		}
		fileReader.close();
		fileWriter.close();
	}

}
