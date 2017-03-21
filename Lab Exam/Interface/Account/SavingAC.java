public class SavingAC extends Account 
{
		public SavingAC(String acID,double balance)
	{
		super(acID,balance);
		setAcType("Saving");
	}


	@Override
	public void calcLimit()
	{
		setLimit(balance*0.8);
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
			balance -= amount;
			return true;
		}
	}
}