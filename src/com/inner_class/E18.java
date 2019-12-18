package com.inner_class;

class Outer{
	static int m=0;
	static class Inner{
		void show() {
			
			System.out.println("外部类静态变量m="+m);
		}
	}
	
	void test1() {
		System.out.println("外部类成员方法");
	}
	
	



void test2() {
	class Inner{
		int n =1;
		
		void show1() {
			System.out.println("外部类成员变量m="+m);
			test1();
		}
		void show2() {
			System.out.println("内部类成员方法");
		}
	}
	Inner inner =new Inner();
	System.out.println("内部类成员变量 n="+inner.n);
	inner.show2();
	}
}
public class E18 {

	public static void main(String[] args) {
		Outer.Inner inner=new Outer.Inner();
		inner.show();

	}

}
