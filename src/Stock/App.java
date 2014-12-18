package Stock;

import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
	
	public static void getInfo(List<String> company)
	{
		for(String companyName:company)
		{
			System.out.println(companyName);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	public static void main(String[] args) {
	
		List<String> nameOfComapnies=new ArrayList<String>();
		
		nameOfComapnies.add("TCS");
		nameOfComapnies.add("Infosys");
		nameOfComapnies.add("Cog");
		nameOfComapnies.add("sjgd");
		nameOfComapnies.add("jaksh");
		nameOfComapnies.add("wokd");
		nameOfComapnies.add("osyd");
		nameOfComapnies.add("TCS");
		nameOfComapnies.add("Infosys");
		nameOfComapnies.add("Cog");
		nameOfComapnies.add("sjgd");
		nameOfComapnies.add("jaksh");
		nameOfComapnies.add("wokd");
		nameOfComapnies.add("osyd");
		nameOfComapnies.add("TCS");
		nameOfComapnies.add("Infosys");
		nameOfComapnies.add("Cog");
		nameOfComapnies.add("sjgd");
		nameOfComapnies.add("jaksh");
		nameOfComapnies.add("wokd");
		nameOfComapnies.add("osyd");
		nameOfComapnies.add("TCS");
		nameOfComapnies.add("Infosys");
		nameOfComapnies.add("Cog");
		nameOfComapnies.add("sjgd");
		nameOfComapnies.add("jaksh");
		nameOfComapnies.add("wokd");
		nameOfComapnies.add("osyd");
		nameOfComapnies.add("TCS");
		nameOfComapnies.add("Infosys");
		nameOfComapnies.add("Cog");
		nameOfComapnies.add("sjgd");
		nameOfComapnies.add("jaksh");
		nameOfComapnies.add("wokd");
		nameOfComapnies.add("osyd");
		
		Long startTime=System.currentTimeMillis();
		
		ExecutorService executorService=Executors.newCachedThreadPool();
		
		executorService.submit(()->getInfo(nameOfComapnies));
		
		//getInfo(nameOfComapnies);
		
		Long finishTime=System.currentTimeMillis();
		
		System.out.println("Execution Timing:"+(finishTime-startTime));
		
		startTime=System.currentTimeMillis();
		
		//getInfo(nameOfComapnies);
		
		finishTime=System.currentTimeMillis();
		
		System.out.println("Execution Timing:"+(finishTime-startTime));
		
	}	
	

}
