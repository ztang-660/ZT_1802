package com.net;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InterfaceAddress;
public class Net_public {

	public static void main(String[] args) throws IOException {
		InetAddress localAddress=InetAddress.getLocalHost();
		
		InetAddress remoteAddress =
								InetAddress.getByName("www.bilibili.com");
		System.out.println("本机的IP地址:"
							+localAddress.getHostAddress());
		System.out.println("bilibili的IP地址:"
							+remoteAddress.getHostAddress());
		System.out.println("3秒内是否可以访问:"
							+remoteAddress.isReachable(3000));
		System.out.println("bilibili的主机名为:"
							+remoteAddress.getHostName());
		

	}

}
