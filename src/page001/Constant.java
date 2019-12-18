package page001;

public class Constant {
	// ctrl+shift+f
	public static void main(String[] args) {
	//字面上的整型常量
		System.out.println("二进制以0b开头"+0b11000110);
		System.out.println("八进制以0开头"+0306);
		System.out.println("十六进制以0x"+0xc6);
		//0123456789abcde
	//字面上的浮点型常量
		System.out.println("单精度浮点数以f结尾"+5.022e+6f);
		System.out.println("双精度浮点数以d结尾"+5.022e+6d);
		System.out.println("双精度浮点数d可以省略"+5.022e+6);
	//Java中的字符使用单引号，采用16位进制encode编码。	
		System.out.println("我的姓名是"+'\u9648'+'\u601d'+'\u5b87');

		System.out.println("Hello,\nSeptember!");
		//Java中的字符串常量只有两个,真true 假false	
		System.out.println("布尔型常量"+true+"或者"+false);
		//Java中的null常量,只能是引用数据类型
		System.out.println("null常量只有一个"+null+",表示空对象");
		//int c=null;
		Constant constant=null;
		//同变量类似的常量要使用final关键字，常量被赋值后不能再次修改,常量一般用大写字母表示.
		final int A=5;//定义一个整型变量A,如果前面加final修饰它就变成一个常量
	}

}
