package com.jihe;

import java.util.ArrayList;
import java.util.LinkedList;

public class List_test {

	public static void main(String[] args) {
		//<>是泛型,里面的类型是集合里元素的类型
		//有两个类,前面一个是集合类,后面尖括号里的是集合里的元素类型
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		System.out.println("数组列表arrayList的长度是"+arrayList.size());
		System.out.println("数组列表arrayList的第二个元素是"+arrayList.get(1));

		LinkedList<String> LinkedList=new LinkedList<String>();
		LinkedList.add("stud1");
		LinkedList.add("stud2");
		LinkedList.offer("offer");
		LinkedList.push("push");
		System.out.println("链表的长度是"+LinkedList.size());
		System.out.println("链表的最后一个元素是"+LinkedList.getLast());
		System.out.println("链表的第一个元素是"+LinkedList.getFirst());
		System.out.println(LinkedList);
	
		String dygys=LinkedList.peek();
		System.out.println("链表的第一个元素是"+dygys);
	
		LinkedList.removeFirst();
		LinkedList.pollLast();
		System.out.println(LinkedList);
	}
}
