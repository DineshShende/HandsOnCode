package interruptedthreads;

import java.util.Random;

public class App {

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {
			
				Random random=new Random();
				
				for(int i=0;i<1E8;i++)
				{
					/*
					if(Thread.currentThread().isInterrupted())
					{
						System.out.println("Interrupted");
						break;
					}
					*/
					
					try {
						Thread.sleep(1);
					} catch (InterruptedException e) {
						
						System.out.println("Interrupted..");
						break;
					}
					
					Math.sin(random.nextDouble());
				}
					
				
			}
		});
		
		
		System.out.println("Starting...");
		t1.start();
		
		t1.interrupt();
		
		t1.join();
		
		System.out.println("Finished...");

	}

}
