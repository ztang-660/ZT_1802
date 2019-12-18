package com.api;

public class Zfc_test {

	public static void main(String[] args) {
		String zfc=new String("HelloWorld");
		for (int i = zfc.length()-1; i>=0;i--) {
			if(zfc.charAt(i)>='a'&&zfc.charAt(i)<=32);
				System.out.println((char)(zfc.charAt(i)-32));
				else if (zfc.charAt(i)>='A'&&zfc.charAt(i)<='Z') {
					System.out.println((char)(zfc.charAt(i)+32));
				} 
					
			String string = args[i];
			
		}
            
	}

}
