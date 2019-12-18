package com.jihe;
import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2){
		String s1=(String) obj1;
		String s2=(String) obj2;
		int temp =s1.length() -s2.length();
		return temp;
	}
	
}
public class TreeSet_test3 {
	public static void main(String[] args) {

		TreeSet ts=new TreeSet(new MyComparator());
		ts.add("Jack");
		ts.add("Helena");
		ts.add("Eva");
		System.out.println(ts);
		
		TreeSet ts2=new TreeSet((obj1,obj2)-> {
			String s1=(String) obj1;
			String s2=(String) obj2;
			return s1.length() -s2.length();
		});
		ts2.add("Jack");
		ts2.add("Helena");
		ts2.add("Eva");
		System.out.println(ts2);

	}

}
