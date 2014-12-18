package deadlock;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Worker {

	
	private Account acc1=new Account();
	private Account acc2=new Account();
	
	
	private Lock lock1= new ReentrantLock();
	private Lock lock2= new ReentrantLock();
	

	private void acquireLocks(Lock firstLock,Lock seccondLock) throws InterruptedException
	{
		Boolean gotFirstLock=false;
		Boolean gotSecondLock=false;
		
		while(true)
		{			
			try{
				gotFirstLock=lock1.tryLock();
				gotSecondLock=lock2.tryLock();
			}
			finally{
				
				if(gotFirstLock && gotSecondLock)
					return;
				
				if(gotFirstLock)
					firstLock.unlock();
				if(gotSecondLock)
					seccondLock.unlock();
							
			}
			
			Thread.sleep(1);
		}
		
		
		
	}
	
	
	public  void producer() throws InterruptedException
	{
		
		Random random=new Random();
		
		for(int i=0;i<1000;i++)
		{
			acquireLocks(lock1,lock2);
			
			try{
			Account.transfer(acc1, acc2, random.nextInt(100));
			}
			finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
		
	}
	
	public  void consumer() throws InterruptedException
	{

		Random random=new Random();
		
		for(int i=0;i<1000;i++)
		{
			acquireLocks(lock2,lock1);
			
			try{
			Account.transfer(acc2, acc1, random.nextInt(100));
			}
			finally{
				lock1.unlock();
				lock2.unlock();
			}
		}
		
	}
	
	public void finish()
	{
		System.out.println("First Account balance="+acc1.getBalance());
		System.out.println("Second Account balance="+acc2.getBalance());
		System.out.println("Total balance="+(acc1.getBalance()+acc2.getBalance()));
	}
	
}
