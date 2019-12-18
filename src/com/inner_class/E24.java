package com.inner_class;
@FunctionalInterface
interface Calcable{
	int calc(int num);
}
//
class Math{
	public static int abs(int num) {
		if (num>=0) {
			return num;
		} else {
			return -num;
		}
	}
}
public class E24 {
private static void printAbs(int num,Calculate calculate) {
	System.out.println(calculate.calc(num));	
}
	public static void main(String[] args) {
		printAbs(-10,n ->Math.abs(n));
		printAbs(-10, Math::abs);
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
