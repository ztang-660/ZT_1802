package com.io;

import java.io.File;
import java.util.Arrays;

public class File_list {

	public static void main(String[] args) {
		//创建File对象,并指定文件路径
		File file =new File("F:\\Java基础入门\\workspace\\chapter07");
		//判断是否是目录
		if(file.isDirectory()) {
			//获取目录中的所有文件的名称
			String[] fileNames=file.list();
			//对指定路径下的文件或目录进行遍历
			Arrays.stream(fileNames)
				.forEach(f->System.out.println(f));
		}
	}

}
