package page001;

public class Jishuhe {

	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i < 100; i+=2) {
			sum+=i;
			
		}
		System.out.println("100以内奇数的和"+sum);
		
		sum=0;
		int x =2;
		while (x<=100) {
			sum+=x;
			x+=2;
		}
		System.out.println("100以内偶数的和是"+sum);
	}

}
