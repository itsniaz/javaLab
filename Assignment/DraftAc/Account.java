 public class Account
{
	private String accName;
	private String acid;
	private int balance;
	

	public String getAccName() {
	    return this.accName;
	}

	public String getAcid() {
	    return this.acid;
	}

	public int getBalance() {
	    return this.balance;
	}

	public void setAccName(String accName) {
	    this.accName = accName;
	}

	public void setAcid(String acid) {
	    this.acid = acid;
	}

	public void setBalance(int balance) {
	    this.balance = balance;
	}
	
	
	public Account()
	{
	}
	public Account(String acid,String accName,int balance)
	{
		this.accName = accName;
		this.acid = acid;
		this.balance = balance;
	}
	
	public boolean deposit(int amount)
	{
		balance += amount;
		return true;
	}
	public boolean withdraw(int amount)
	{
		if(amount>balance)
		{
			return false;
		}
		else
		{
			balance -= amount;
			return true;
		}
	}
	public void showInfo()
	{
		System.out.println("Name : "+accName+"\nAccount Number : "+acid+"\nBalance :"+balance+"\n\n");
	}
	public boolean transfer(Account A,int amt)
	{
		if(withdraw(amt))	
		{
			A.deposit(amt);
			return true;
		}
		else
		{
			return false;
		}
	}
}