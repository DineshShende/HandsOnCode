package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class App {
	
	public static int totalValues(List<Integer> numbers,Predicate<Integer> selector)
	{
//		int total=0;
//		
//		for(int val:numbers)
//		{
//			if(selector.test(val))
//			total+=val;
//		}
//		
//		return total;
		
		return numbers.stream()
				.filter(selector)
				.reduce(0, (c,e)->c+e);
		
	}
	
	
	public static void main(String[] args) {
		
		
		
		List<Integer> values=Arrays.asList(1,2,3,5,4,6,7,8,9);

		
//		for(int i=0;i<values.size();i++)
//		{
//			System.out.println(values.get(i));
//		}
		
		
//		for(Integer e:values)
//		{
//			System.out.println(e);
//		}
		

//		values.forEach(new Consumer<Integer>() {
//
//			@Override
//			public void accept(Integer t) {
//				
//				System.out.println(t);
//			}
//		});
//		
		
//		values.forEach((Integer t)->System.out.println(t));
		
//		values.forEach((t)->System.out.println(t));

//		values.forEach( t->System.out.println(t));
	
//		values.forEach(System.out::println);
		
//		int total=0;
//		for(int e:values)
//		{
//			total+=e*2;
//		}
//		System.out.println(total);
		
		
		//values.
		
//		System.out.println(
//				values.stream().map(e->e*2)
//				.reduce(0, (c,e)->c+e)
//				);
//		
		
		
	//	System.out.println(totalValues(values,e->true));
		
	//	System.out.println(totalValues(values,e->e%2==0));
		
	//	System.out.println(totalValues(values,e->e%2!=0));

		//double of first even number
//		int result=0;
//		
//		for(int e:values)
//		{
//			if((e>3) && (e%2==0))
//			{
//				result= e*2;
//				break;
//			}	
//		}
//		System.out.println(result);
		
		
		System.out.println(values.stream()
				 .filter(e->e>3)
				 .filter(e->e%2==0)
				 .map(e->e*2)
				 .findFirst()
				 .orElse(0));
		
		System.out.println(values.stream()
								 .filter(App::isGT3)
								 .filter(App::isEven)
								 .map(App::doubleIt)
								 .findFirst()
								 .orElse(0));
		
	}
	
	public static Boolean isGT3(int number)
	{
		System.out.println("in GT3 number:"+number);
		return number>3;
	}
	
	public static Boolean isEven(int number)
	{
		System.out.println("in isEven number:"+number);
		return number%2==0;
	}
	public static int  doubleIt(int number)
	{
		System.out.println("in doubleIt number:"+number);
		return number*2;
	}

}
