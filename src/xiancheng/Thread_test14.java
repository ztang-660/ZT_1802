package xiancheng;
	import java.util.concurrent.locks.*;
	class LockThread implements Runnable{
		public int tickets =10;
		
		private final Lock lock =new ReentrantLock(); 
		public void run() {
			while (true) {
				lock.lock();
				if(tickets>0) {
					try {
						Thread.sleep(100);
						System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
					}catch (InterruptedException e) {
						e.printStackTrace();
					}finally {
						lock.unlock();
					}
				}
			}
		}
		public static class Thread_test14 {
		public static void main(String[] args) {
			LockThread lockThread=new LockThread();
			new Thread(lockThread,"窗口一").start();
			new Thread(lockThread,"窗口二").start();
			new Thread(lockThread,"窗口三").start();
			new Thread(lockThread,"窗口四").start();
		}
	}
	}
