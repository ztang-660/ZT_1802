package com.net.chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class ChatReceiver implements Runnable {

	private DatagramSocket ds;
	public ChatReceiver(DatagramSocket ds) {
		this.ds=ds;
	}

	@Override
	public void run() {
		byte[] buf =new byte[1024];
			DatagramPacket packet =new DatagramPacket(buf, buf.length);
		while(true) {
		try {	
				ds.receive(packet);
				String string=new String (packet.getData(),
												0,packet.getLength());
				System.out.println(packet.getAddress()+":"
						+packet.getPort()+"发送消息:"+string);
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		}
		
	}

}
