public class Account
{
	private String accName;
	private String acid;
	private int balance;
	
	
	
	public Account()
	{
		accName = "";
		acid = "";
		balance = 0;
	}
	public Account(String accName,String acid,int balance)
	{
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	
	public void deposit(int amount)
	{
		balance += amount;
		
	}
	public void withdraw(int amount)
	{
		if(amount>balance)
		{
			System.out.println("Insufficient Balance");
		
		}
		else
		{
			balance -= amount;
		}
	}
	public void showInfo()
	{
		System.out.println("Name : "+accName+"\nID : "+acid+"\nBalance "+balance);
	}
	public void transfer(Account A,int amt)
	{
		A.deposit(amt);
		withdraw(amt);
	}
	public static void main(String[] args)
	{
		Account acc = new Account("AIUB","STD123",0);
		Account acc2 = new Account("Niaz","STD456",500000);
		System.out.println("-------Before Transefer--------");
		acc.showInfo();
		acc2.showInfo();
		
		System.out.println("-------After Transefer--------")
		acc2.transfer(acc,50000);
		acc.showInfo();
		acc2.showInfo();
		
	}
}