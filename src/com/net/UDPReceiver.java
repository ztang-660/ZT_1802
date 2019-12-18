package com.net;
import java.net.*;
public class UDPReceiver {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[] buf =new byte[1024];
		DatagramPacket packet =new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据...");
		while(true) {
			server.receive(packet);
			String string=new String (packet.getData(),
											0,packet.getLength());
			System.out.println(packet.getAddress()+":"
					+packet.getPort()+"发送消息:"+string);
		}

	}

}
