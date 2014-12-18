package reentrantlocks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker {

	private int count=0;
	
	Lock lock= new ReentrantLock();
	//Object lock=new Object();
	
	public void increment(int col)
	{
		for(int i=0;i<100;i++)
		{
			System.out.println("Increment by:"+col);
			count++;
		}

	}
	
	public  void producer() throws InterruptedException
	{
		
			lock.lock();
			increment(1);
			lock.unlock();
		
	}
	
	public  void consumer() throws InterruptedException
	{
			
			lock.lock();
			increment(2);
			lock.unlock();
		
		
	}
	
	public void finish()
	{
		System.out.println("The count is="+count);
	}
	
}
