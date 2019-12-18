package xiancheng;

import java.util.concurrent.*;

public class Thead_test18 {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		CompletableFuture<Integer> completableFuture1 =
				CompletableFuture.supplyAsync(()->{
			int sum=0,i=0;
			while (i++<5) {
				System.out.println(Thread.currentThread().getName()
						+"线程任务正在执行....i=:"+i);
				
			}
		return sum;
		});
	CompletableFuture<Integer>completableFuture2=
			CompletableFuture.supplyAsync(()->{
				int sum=0,j=5;
				while (j++<10) {
					sum +=j;
					System.out.println(Thread.currentThread().getName()
							+"线程任务正在执行....j=:"+j);
				}
				return sum;		
			});
		CompletableFuture<Integer>completableFuture3=
				completableFuture1.thenCombine(completableFuture2,
				(resule1,resule2)->resule1+resule2);
		System.out.println("从1到10相加的结果为:"+completableFuture3.get());
	}

}
