package prodconsumewaitnotify;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Worker {

	List<Integer> list=new ArrayList<Integer>(10);
	Random random=new Random();
	
	Object lock=new Object();
	
	public  void producer() throws InterruptedException
	{
			
		while(true)
		{
			synchronized (lock) {
				System.out.println("Started executing producer");
				while(list.size()==10)
					lock.wait();
				list.add(random.nextInt(100));
				lock.notify();
			}
		}
		
		
		
	}
	
	public  void consumer() throws InterruptedException
	{
		while(true)
		{
			synchronized (lock) {
				
				
				while(list.size()==0)
					lock.wait();
				Integer value=list.remove(random.nextInt(list.size()));
				
				System.out.println("The deleted value is:"+value+"; The size is"+list.size());
				lock.notify();
				
			}
			Thread.sleep(1000);
			//Thread.sleep(random.nextInt(1000));
		}
	}
	
}
