package com.api;

import java.io.IOException;

import javax.swing.text.rtf.RTFEditorKit;

public class Runtime_test {

	public static void main(String[] args) throws IOException,InterruptedException{
		Runtime runtime=Runtime.getRuntime();
		System.out.println("本机处理器的个数是"+runtime.availableProcessors()+"个");
		System.out.println("空闲内存大小是"+runtime.freeMemory()/1024/1024+"MBytes");
		System.out.println("最大内存大小是"+runtime.maxMemory()/1024/1024+"MBytes");
		
		Process jincheng=runtime.exec("mspaint");
		Thread.sleep(3000);
		jincheng.destroy();

	}

}
