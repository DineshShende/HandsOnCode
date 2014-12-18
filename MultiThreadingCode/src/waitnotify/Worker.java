package waitnotify;

import java.util.Scanner;

public class Worker {

	public  void producer() throws InterruptedException
	{
		synchronized (this) {
			System.out.println("Started executing producer");
			wait();
			System.out.println("Resumed");
			
		}
		
		
		
	}
	
	public  void consumer() throws InterruptedException
	{
		Thread.sleep(1000);
		Scanner scanner=new Scanner(System.in);
		
		
		synchronized (this) {
			
			System.out.println("Waiting return key to be pressed");
			scanner.nextLine();
			System.out.println("Return key pressed");
			notify();
		}
		
	}
	
}
