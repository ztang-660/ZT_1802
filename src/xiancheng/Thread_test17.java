package xiancheng;
import java.util.concurrent.*;
class MyThread4 implements Callable<Object>{
	public Object call() throws Exception{
		int i=0;
		while (i++<5) {
			System.out.println(Thread.currentThread().getName()
					+"的call()方法在运行");	
		}
		return i;
	}
}
public class Thread_test17 {

	public static void main(String[] args) throws InterruptedException,
													ExecutionException{
		
		MyThread4 myThread4=new MyThread4();
		ExecutorService executor =Executors.newCachedThreadPool();
		
		Future<Object>result1 =executor.submit(myThread4);
		Future<Object>result2 =executor.submit(myThread4);
		
		executor.shutdown();
		
		System.out.println("thread-1 返回结果:"+result1.get());
		System.out.println("thread-2 返回结果:"+result2.get());

	}

}
