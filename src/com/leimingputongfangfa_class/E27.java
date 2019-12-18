package com.leimingputongfangfa_class;

@FunctionalInterface
interface Printable{
	void print (StringUtils su,String str);

}
 class StringUtils{
	 public void printUpperCase (String str) {
		 System.out.println(str.toUpperCase());
	 }
 }
 
public class E27 {
	private static void printUpper (StringUtils su,String text,
								Printable pt) {
			pt.print(su, text);
	}

	public static void main(String[] args) {
		printUpper(new StringUtils(), "Hello",
							(object,t)->object.printUpperCase(t));
		
		printUpper(new StringUtils(),"Hello",
								StringUtils::printUpperCase);

	}
}

