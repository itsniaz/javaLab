public class SavingAC extends Account 
{
		public SavingAC(String acID,double balance)
	{
		super(acID,balance);
		setAcType("Saving");
	}

	public SavingAC()
	{
		setAcType("Saving");
	}


	@Override
	public void calcLimit()
	{
		setLimit(getBalance()*0.8);
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