package xiancheng;
class EmergenvyThread implements Runnable {
	public void run() {
		for (int i=1;i<6;i++) {
			System.out.println(Thread.currentThread().getName()
					+"输入:"+i);
			
		}
	}
}
public class Thread_test8 {
public static void main(String[] args) throws InterruptedException {
		// 创建线程
	Thread thread1=new Thread(new EmergenvyThread(),"thread1");
	thread1.start();
	for(int i =1;i<6;i++) {
		System.out.println(Thread.currentThread().getName()
				+"输入"+i);
		if(i ==2) {
			thread1.join();
			}
	 	}
	}
}
