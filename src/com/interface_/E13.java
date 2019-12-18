package com.interface_;

//接口关键字:interface
interface Animal{
	//接口的成员变量声明时,可以省略	public static final 三个关键字
	int ID=1;
    //接口的普通成员方法声明时可以省略public	abstract 两个关键字
	void shout();
	//接口内不能有普通方法	
	static int getID() {
		return Animal.ID;
	}

}

interface LandAnimal extends Animal{
	void run();
}


//实现接口功能用implements关键字表示
class Dog implements LandAnimal{
	
	@Override
	public void run()   {
		System.out.println("the dog is running");
	}

	@Override
	public void shout() {
		
	}


}
class Cat implements Animal{
	
	@Override
	public void shout() {
		System.out.println("miao miao");
	}
}
public class E13 {

	public static void main(String[] args) {
		System.out.println(Animal.ID);
		Dog dog=new Dog();
		dog.shout();
		dog.run();
		Cat cat=new Cat();
		cat.shout();


	}

}
