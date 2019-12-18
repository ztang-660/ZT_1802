package com.io;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import com.swetake.util.Qrcode;
public class Ewm {

	public static void main(String[] args) throws Exception {
		Qrcode ewm=new Qrcode();
		int width=339;
		int height=339;
		BufferedImage hctx=new BufferedImage(width,height,BufferedImage.TYPE_INT_RGB);
		//创建画笔
		Graphics2D ewhb=hctx.createGraphics();
		//设置背景
		ewhb.setBackground(Color.white);
		
		ewhb.setColor(Color.BLACK);
		ewhb.clearRect(0,0,width,height);
		
		String zf="http://www.sanguosha.com";
		byte[] zjsz=zf.getBytes();
		boolean[][]  ewsz=ewm.calQrcode(zjsz);
		for  (int i = 0;i < ewsz.length; i++) {
			for (int j = 0;j< ewsz.length;j++) {
				if(ewsz[j][i]) {
					ewhb.fillRect(j*3+2,i*3+2,3,2);
				}
			}
		}
		
		
		//成像
		ewhb.dispose();
		hctx.flush();
		ImageIO.write(hctx,"jpg",new File( "ewm.jpg"));
		//释放资源

	} 

}
