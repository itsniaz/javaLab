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
		balance -= amount;
	}
	public void showInfo()
	{
		System.out.println("Name : "+accName+"\nID : "+acid+"\nBalance "+balance);
	}
	public static void main(String[] args)
	{
		Account acc = new Account("TEST","TEST",25000);
		acc.deposit(5000);
		acc.showInfo();
	}
}