public class CurrentAC extends Account
{
	public CurrentAC(String acID,double balance)
	{
		super(acID,balance);
		setAcType("Current");

	}

	public CurrentAC()
	{
		setAcType("Current");
	}
	@Override
	public void calcLimit()
	{
		setLimit(getBalance());
	}

	@Override
	public boolean withdraw(double amount)
	{
		calcLimit();

		if(amount>getLimit())
		{	
			return  false;
		}
		else
		{
			setBalance(getBalance()-amount);
			return true;
		}
	}

	
}