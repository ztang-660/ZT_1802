package com.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.mysql.fabric.xmlrpc.Client;

public class TCPClient {

	public static void main(String[] args) throws Exception, Exception {
		Socket khdtjz=new Socket("10.2.103.31",8899);
		InputStream is=khdtjz.getInputStream();
		byte[]buf=new byte[1024];
		int len=is.read(buf);
		while (len !=-1) {
			System.out.println(new String(buf,0,len));
			len=is.read(buf);
		}
		is.close();
		khdtjz.close();
		

	}

}
