package page001;

public class Recursive {
	//求和递归方法: 在方法的内部调用方法自己,叫做方法的递归
	public static int getSum(int n) {
		if (n==1) {
			return 1;
		}
		int temp=getSum(n-1);
		return temp+n;
	}
	
	
	
	
	public static void main(String[] args) {
		int sum=getSum(4);
		System.out.println("sum="+sum);

	}

}
