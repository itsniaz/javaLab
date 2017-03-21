public class CurrenAC extends Account
{
	public Account(String acID,double balance)
	{
		super(acID,balance);
		setAcType("Current");

	}

	@Override
	public boolean withdraw(int amount)
	{
		calcLimit();

		if(amount>limit)	
			return  false;
		else
			return balance -= amount;
	}

	@Override
	public void calcLimit()
	{
		limit = balance;
	}
}