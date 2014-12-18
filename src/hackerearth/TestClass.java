
package hackerearth;

import java.util.Scanner;
/* IMPORTANT: class must not be public. */

/*
 * uncomment this if you want to read input.
import java.io.BufferedReader;
import java.io.InputStreamReader;
*/

class TestClass {
	
	public static int isDivisibleByPrime(int num)
	{
		if(num%2==0)
			return 2;
			
		if(num%3==0)
			return 3;
			
			if(num%5==0)
				return 5;
			
				if(num%7==0)
					return 7;
					
					if(num%11==0)
						return 11;
						
						if(num%13==0)
							return 13;
														
							if(num%17==0)
								return 17;
								

								if(num%19==0)
									return 19;
									
									
									if(num%23==0)
										return 23;
									
									
									return 0;
	}
	
	public static long gcd(long p, long q) {
	    if (q == 0) return p;
	    else return gcd(q, p % q);
	}

	public static void ratio(long a, long  b) {
	   if(a!=0)
	   {	   
		final long gcd = gcd(a,b);
//	   System.out.println("gcd="+gcd);
//	   
//	   System.out.println("b="+b);
//	   System.out.println("ans="+b/gcd);
	   
	   System.out.println(a/gcd + ":" + b/gcd);
	   }
	   else
		   System.out.println(a + ":" + b);
	}
	
    public static void main(String args[] ) throws Exception {

    	Scanner in=new Scanner(System.in);
    	
    	final int HH_MAX=24;
    	final int MM_MAX=60;
    	final int SS_MAX=60;
    	
    	int t=in.nextInt();
    	
    	while((t--)!=0)
    	{
    		int HH=in.nextInt();
    		int MM=in.nextInt();
    		int SS=in.nextInt();
    		long rescount=0;
    		long allcount=0;
    		
    		boolean hh_first=true;
    		boolean mm_first=true;
    		boolean ss_first=true;
    		
    		int HH_init=0;
    		int MM_init=0;
    		int SS_init=0;
    		
    		for(int hh_count=HH;hh_count<HH_MAX;hh_count++)
    		{
    			if(isDivisibleByPrime(hh_count)!=0)
    			{
    				int h_prime=isDivisibleByPrime(hh_count);
    				
    				for(int mm_count=MM;mm_count<=MM_MAX;mm_count++)
    				{
    					if(mm_count%h_prime==0)
    					{
    						
    						for(int ss_count=SS;ss_count<SS_MAX;ss_count++)
    						{
    							if(ss_count%h_prime==0)
    								rescount++;
    							
    							
    						}
    									
    					}
    				}
    			 
    					
    			}
    			
    			   			
    		}
    		allcount=(60-SS)+((60-(MM+1))*60)+((24-(HH+1))*60*60);
    		
    		if(allcount<0)
    			allcount=0;
    		
    		//System.out.println(rescount);
    		//System.out.println(allcount-rescount);
    		
    		ratio(rescount, allcount-rescount);
    	}
    	

    	
    }
}
