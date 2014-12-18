package CountDownLatch;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


class Processor implements Runnable
{
	CountDownLatch countDownLatch;

	public Processor(CountDownLatch countDownLatch) {
		super();
		this.countDownLatch = countDownLatch;
	}

	@Override
	public void run() {
		
		System.out.println("Stated");
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		countDownLatch.countDown();
		
		
		
		System.out.println("Finished");
		
		
	}
	
	

}





public class App {

	public static void main(String[] args) {
		CountDownLatch countDownLatch=new CountDownLatch(3);
		
		ExecutorService executorService=Executors.newFixedThreadPool(3);
		
		for(int i=0;i<3;i++)
		{
			executorService.submit(new Processor(countDownLatch));
		}
		
		try {
			countDownLatch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Completed");
	}
	
}
