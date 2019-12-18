package com.net;

import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		//创建服务器套接字
		ServerSocket fwqtjz=new ServerSocket(8899);
		
		while (true) {
		//监听8899端口	
		Socket khdtjz=fwqtjz.accept();
		String xinxi="";
		OutputStream os=khdtjz.getOutputStream();
		os.write(xinxi.getBytes());
		
			}
		}
		

}
