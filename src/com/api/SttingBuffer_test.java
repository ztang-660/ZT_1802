package com.api;

public class SttingBuffer_test {

	public static void main(String[] args) {
		String s="我和我的祖国一刻也不能分割";
		StringBuffer zfchc=new StringBuffer(s);
		System.out.println(zfchc);
		//添加
		zfchc.append("!");
		System.out.println(zfchc);
		zfchc.insert(6, ',');
		System.out.println(zfchc);
		//删除
		zfchc.delete(2, 4);
		System.out.println(zfchc);
		//添加
		zfchc.insert(2, "我的");
	
		//修改
		zfchc.replace(4, 6, "香港");
		System.out.println(zfchc);
		//反转
		zfchc.reverse();
		System.out.println(zfchc);
	}

}
