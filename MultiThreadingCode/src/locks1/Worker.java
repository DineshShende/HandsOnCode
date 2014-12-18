package locks1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Worker {

	
	Object lock1=new Object();
	Object lock2=new Object();
	
	List<Integer> list1=new ArrayList<Integer>();
	
	List<Integer> list2=new ArrayList<Integer>();
	
	private Random  random=new Random();
	
	private  void stageOne()
	{
		synchronized (lock1) {
		
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list1.add(random.nextInt(100));
			
		}
		
	}
	
	private synchronized void stageTwo()
	{
		synchronized (lock2) {
		

			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			list2.add(random.nextInt(100));
		
		}
			
	}
	
	
	private void process()
	{
		for(int i=0;i<1000;i++)
		{
			stageOne();
			stageTwo();
		}	
	}
	
	public void main()
	{
		System.out.println("In main");
		
		Long startTime=System.currentTimeMillis();
		
		Thread t1=new Thread(new Runnable() {
			
			@Override
			public void run() {

				process();
			}
		});

		Thread t2=new Thread(new Runnable() {
			
			@Override
			public void run() {

				process();
			}
		});

		
		
		t1.start();
		t2.start();
		
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Long finishTime=System.currentTimeMillis();
		
		System.out.println("Execution Time="+(finishTime-startTime));
		
		System.out.println("List1:"+list1.size());
		
		System.out.println("List1:"+list2.size());
		
	}
	
	
	
	
}
