package com.inner_class;
@FunctionalInterface
interface Animal{
	void shout();
}
@FunctionalInterface
interface Calculate{
	int sum(int i, int j);
}
public class E21 {

	public static void main(String[] args) {
		String name ="小花";
		
	
		animalShout(()->System.out.println("aow.."));
		showSum(10,30,(x,y)->x+y);
}

	private static void showSum(int x,int y,Calculate c) {
	System.out.println(x+"+"+y+"的和是"+c.sum(i, j));
}
}


