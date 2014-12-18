package deadlock;

public class Account {
	
	private Integer balance=1000;

	public Integer getBalance() {
		return balance;
	}
	
	public void deposite(Integer amt)
	{
		balance+=amt;
	}
	
	public void withdraw(Integer amt)
	{
		balance-=amt;
	}
	
	public static void transfer(Account acc1,Account acc2,Integer amt)
	{
		acc1.withdraw(amt);
		acc2.deposite(amt);
	}
	
}
