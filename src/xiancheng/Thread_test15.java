package xiancheng;

import org.apache.commons.math3.analysis.solvers.NewtonRaphsonSolver;
import org.apache.commons.math3.optim.nonlinear.scalar.ObjectiveFunction;

class DeadLockThread implements Runnable{
	
	static Object chopsticks=new Object();
	static Object knifeAndFork= new Object();
	private boolean flag;
	DeadLockThread(boolean flag) {
		this.flag=flag;
	}
	public void run(){
		if(flag) {
			while(true)
				synchronized (chopsticks) {
					System.out.println(Thread.currentThread().getName()+"---if---chospticks");
				synchronized (knifeAndFork) {
					System.out.println(Thread.currentThread().getName()+"---if---knifeAndFork");
				}
			}
		}
	}else {
	while(true) {
		synchronized(knifeAndFork) {
			
		}
	}
}
public class Thread_test15 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
