package com.jihe;
import java.util.*;
public class Diedai {

	public static void main(String[] args) {
		ArrayList<String> arrayList=new ArrayList<String>();
		arrayList.add("stud1");
		arrayList.add("stud2");
		arrayList.add("stud3");
		arrayList.add("stud4");
		//arrayList.add(5);
		System.out.println();
		System.out.println();
		//使用迭代读取集合中的每个元素
		Iterator<String> diedai=arrayList.iterator();
		while (diedai.hasNext()) {
			//next方法读取下一个元素
			String dgys=diedai.next();
			System.out.println(dgys);
			
		}
		System.out.println("使用foreach循环输出每一个元素:");
		for (String mgys:arrayList) {
			System.out.println(mgys);
			
		}
		System.out.println("使用JDK8的foreach循环输出每个元素:");
		arrayList.forEach(obj->System.out.println(obj));

		ArrayList list =new ArrayList ();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		System.out.println(list);
		
		Iterator it=list.iterator();
		
		it.forEachRemaining(obj ->System.out.println("迭代集合元素:"+obj));
	}

}
