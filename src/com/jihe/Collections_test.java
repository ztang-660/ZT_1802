package com.jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class Collections_test {

	public static void main(String[] args) {
		ArrayList<String>list =new ArrayList<>();
		Collections.addAll(list,"C","Z","B","K");
		System.out.println("排序前:"+list);
		Collections.reverse(list);
		System.out.println("反转后:"+list);
		Collections.sort(list);
		System.out.println("按自然顺序排序后:"+list);
		Collections.shuffle(list);
		System.out.println("按随机顺序排序后:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("集合首尾元素交换后:"+list);
		
		ArrayList<String> list1=new ArrayList<>();
		Collections.addAll(list1,-9,2,-5,5);
		System.err.println("集合的元素是"+list1);
		System.err.println("集合的最大值元素是"+Collections.max(list1));
		System.err.println("集合的最小值元素是"+Collections.min(list1));
		Collections.replaceAll(list1, 9, 0);
		System.out.println("替换后的元素集合:////////////"+list1);
		
	}

	

}
