package com.charpter4;
class Animal{
	//Field:成员变量	
	String name;
	//Method:成员方法
	void shout() {
		System.out.println("动物发出的叫声");
	}
}
class Dog extends Animal{
	//继承了Animal类的所有成员变量和成员方法
	public void printName() {
	
		System.out.println("name="+name);
	}
	void shout() {
		System.out.println("旺旺旺");
	}
	public void printname() {
		
		System.out.println("name="+name);
	}

}
public class E01 {

	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.name="哈士奇";
		dog.printName();
		dog.shout();

	}

}
