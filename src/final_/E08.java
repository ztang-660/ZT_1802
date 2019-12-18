package final_;
class Animal{
	//如果一个成员变量被final修饰，则该变量在本类中不能再次被赋值
	final String name="动物";
	public void shout() {}
	public String toString() {
		return "这是一只动物";
	}
}
class Fox extends Animal{
	String name="狐狸";
	@Override
	public void shout() {}
	//重写Animal类的toString()方法
	@Override
	public String toString() {
		return "这是一只狐狸";
	}
}
public class E08 {

	public  static void main(String[] arg) {
		Animal dw=new Animal();
		Fox dw1=new Fox();
		System.out.println(dw);
		System.out.println(dw1);
	}

}


