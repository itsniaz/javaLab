public class OverdraftAC extends Account 
{

	private double limitO;

	public OverdraftAC(String acID,double balance,double limitO)
	{
		super(acID,balance);
		setAcType("OVerdraft");
		this.limitO = limitO;

	}

	public OverdraftAC()
	{
		
	}

	@Override
	public void calcLimit()
	{
		setLimit(balance+limitO);
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
			setBalance(getBalance()=amount)
			return true;
		}
	}
}