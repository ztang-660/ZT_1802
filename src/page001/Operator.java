package page001;

public class Operator {

	public static void main(String[] args) {
		//算术运算符
		int i=1;
		int j=2;
		System.out.println("后加,表达式i++="+(++i));
		System.out.println("先加,表达式++j="+(j++));
		System.out.println("不管先加还是后加之后的变量的值都加了1，i="+i);
		System.out.println("不管先加还是后加之后的变量的值都加了1，j="+j);
		//赋值运算符
		int a=3;
		a+=2;//等价于a=a+3
		System.out.println(a);
		
		String s1="hello";
		String s2="hello";
		E04 e1=new E04();
		E04 e2=new E04();
		System.out.println(s1==s2);
		System.out.println(e1==e2);
		
		int month =9;
		switch (month) {
		case 12:
		case 1:
		case 2:
			System.out.println("现在是冬季");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("现在是春季");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("现在是夏季");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("现在是秋季");
			break;

		default:
			break;
		}

	}

}
