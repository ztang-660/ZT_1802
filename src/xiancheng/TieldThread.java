package xiancheng;

class YieldThread extends Thread{

	public YieldThread(String name) {
		super(name);
		// TODO 自动生成的构造函数存根
	}

public void run() {
	for(int i=0;i<5;i++) {
		System.out.println(Thread.currentThread().getName()+"---"+i);
		if(i==2) {
			System.out.println("");
			Thread.yield();
		}
	}
}
public class TieldThread {
	public static void main(String[] args) {
		
		Thread thread1 =new YieldThread("thread1");
		Thread thread2 =new YieldThread("thread2");
		
		thread1.start();
		thread2.start();
		
	}
	

	}

}
