package com.inner_class;

@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpper(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25 {
	
	public static void main(String[] args) {
		StringUtils su=new StringUtils();
		PrintUpper("Hello",t->su.printUp);

	}

}
