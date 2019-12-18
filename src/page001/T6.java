package page001;

public class T6 {
	public static void main(String[] args) {
		//在静态方法里,只能调用本类的静态方法,不能调用本类的非静态方法
		Overload o1=new Overload();
		int sum1=o1.add(3, 2);
		//类名,静态方法名
		int sum2=Overload.add(3, 2,1);
		double sum3=Overload.add(0.5, 0.4);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}

}
