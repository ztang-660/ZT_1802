package com.ljhs;
	class Person{
		@Override
		public void finalize() {
			System.out.println("对象将被作为回收垃圾....");
		}
	}
public class E37 {

	public static void recycleWaste1() {
		Person p1=new Person()                             ;
		p1=null;
		int i =1;
		while (i<10) {
			System.out.println("方法1循环中....");
			i++;
		}
	}
	
	
	public static void recycleWaste2() {
		Person p2 =new Person();
		p2 = null;
		
		System.gc();
		
		int i =1;
		while (i<10) {
			System.out.println("方法2循环中....");
			i++;
		}
	} 
	public static void main(String[] args) {

		recycleWaste1();
		System.out.println("-----------");
		recycleWaste2();

	}
	public static void main(String[] args) {
		
	}

}
