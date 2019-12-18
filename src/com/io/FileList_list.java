package com.io;

import java.io.File;
import java.util.Arrays;

public class FileList_list {

	public static void main(String[] args) {
		File ml=new File("E:\\WorkSpace\\ZT_1802\\src\\com\\io");
		if (ml.isDirectory()) {
			String[] zml=ml.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(zml).forEach(f->System.out.println(f));
		}
	}

}
