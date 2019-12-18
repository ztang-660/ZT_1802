package xiancheng;
class Mythreadl extends Thread{
	public Mythreadl (String name) {
		super(name);
	}
	public void run() {
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()+"的run()方法在运行");
		}
	}
}
public class lei {

	public static void main(String[] args) {
	Mythreadl thread1=new Mythreadl("thread1");
	thread1.start();
	Mythreadl thread2=new Mythreadl("thread2");
	thread2.start();
	}

}
