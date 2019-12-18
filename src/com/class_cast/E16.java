package com.class_cast;
interface Animal{
	void shout();

	void eatMan();
}
class Tiger implements Animal{
	
	@Override
	public void shout() {
		System.out.println("aow......");
	}
	@Override
	public void eatMan() {
		System.out.println("Tiger eating man");
	}
}
class Pig implements Animal{
	@Override
	public void shout() {
		System.out.println("haeng......");	
}
public static class E16 {

	public static void main(String[] args) {
		Animal Tiger =new Tiger();
		Animal an1=new Pig();
//		判断an1这个对象是否是tiger类的实例
		if(an1 instanceof Tiger) {
			Tiger tiger2=(Tiger)an1;
			Tiger.shout();
			tiger2.eatMan();
		}
		else {
		System.out.println("this animal is not a tiger");	
		}
		}

	}
@Override
public void eatMan() {
	
}


}
