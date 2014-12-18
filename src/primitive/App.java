package primitive;

interface Executor
{
	int execute(int a);
}

class Runner
{
	public void run(Executor e)
	{
		System.out.println("Executing code...");
		int res=e.execute(8);
		
		System.out.println("Result:"+res);
		
	}

}



public class App {

	public static void main(String[] args) {
		
		Runner runner=new Runner();
		
		runner.run(new Executor() {
			
			@Override
			public int execute(int a ) {
				
				System.out.println("Hello Here..");
				return 7+a;				
			}
		});
		
		
		System.out.println("=============================================");
		
		runner.run((int a)-> 7+a);

	}

}
