package xiancheng;

class SaleThread implements Runnable{
	private int tickets=10;
	public void run() {
		while(true) {
			saleTicket();
			}
	}
		private synchronized void saleTicket() {
			if (tickets>0) {
				try {
					Thread.sleep(100);
				}catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName()+"正在发售第"+tickets--+"张票");
			}
		
	}
}
public class Ticket_test {
	public static void main(String[] args) { 
		SaleThread saleThread =new SaleThread();
		new Thread(saleThread,"窗口一").start();
		new Thread(saleThread,"窗口二").start();
		new Thread(saleThread,"窗口三").start();
		new Thread(saleThread,"窗口四").start();

	}

}
