package com.io;

import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

public class Channels_test {

	public static void main(String[] args) throws Exception{
		RandomAccessFile infile=new RandomAccessFile("d://360Downloads.rar","rw");
		FileChannel inChannel=infile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("d://360Downloads2.rar","rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo =inChannel.transferTo(0,inChannel.size(),outChannel);
		if (transferTo>0) {
			System.out.println("复制成功!");
		}
		infile.close();
		inChannel.close();
		outfile.close();
		
	}

}
