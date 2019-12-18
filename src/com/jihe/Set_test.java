package com.jihe;
import java.util.HashSet;
import java.util.ArrayList;
public class Set_test {

	public static void main(String[] args) {
		HashSet set =new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		System.out.println("来自数组列表的输出");
		set.forEach(obj ->System.out.println(obj));
		
		HashSet set1 =new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		System.out.println("来自哈希值的输出");
		set.forEach(obj ->System.out.println(obj));
		
		set1.remaveAll()
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		System.out.println("来自数组列表的输出");
		set.forEach(obj ->System.out.println(obj));

	}

}
