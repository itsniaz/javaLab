public class Mobile{
	private String mobileOwnerName;
	private String mobileNumber ;
	private	double mobileBalance;
	private	String mobileOSName;
	private	boolean lock;
	private int callRate = 1;
	
	public Mobile()
	{
		mobileOwnerName = "No Name";
		mobileNumber = "No Number";
	}
	public Mobile(String mobileOwnerName,String mobileNumber, double mobileBalance,	String mobileOSName,boolean lock)
	{
		this.mobileOwnerName = mobileOwnerName;
		this.mobileNumber = mobileNumber;
		this.mobileBalance = mobileBalance;
		this.mobileOSName = mobileOSName;
		this.lock = lock;
	}
	
	public void setMobileOwner(String mobileOwnerName)
	{
		this.mobileOwnerName = mobileOwnerName;
	}
	public void setMobileNumber(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public void setBalance(double mobileBalance)
	{
		this.mobileBalance = mobileBalance;
	}
	public void setOSName(String mobileOSName)
	{
		this.mobileOSName = mobileOSName;
	}
	public void setLockStatus(boolean lock)
	{
		this.lock = lock;
	}
	//getters
	public String gettMobileOwner()
	{
		return mobileOwnerName;
	}
	public String getMobileNumber()
	{
		return mobileNumber;
	}
	public double getBalance()
	{
		return mobileBalance;
	}
	public String getOSName()
	{
		return mobileOSName;
	}
	public boolean isLocked()
	{
		return lock;
	}
	public void showInfo()
	{
		System.out.println("Mobile Owner  :"+mobileOwnerName);
		System.out.println("Mobile Number :"+mobileNumber);
		System.out.println("Account Balance : "+mobileBalance);
		System.out.println("OS Name : "+mobileOSName);
		System.out.println("Account Status : "+(lock==false?"Active":"Inactive"));
	}
	
	public void recharge(double amt)
	{
		mobileBalance+=amt;
		if(isLocked())
			lock = false;
	}
	public void callSomeone(int duration)
	{
		if(!isLocked())
		{
			mobileBalance -= (double)(duration*callRate);
		}
		else
		{
			System.out.println("Account Inactive Please Recharge ");
		}
	}
	public static void main(String args[])
	{
		Mobile m1 = new Mobile("Niaz Ahmed","01754545499",100.00,"Android",false);
		m1.showInfo();
		m1.callSomeone(25);
		System.out.println("\n\nAfter Making Call");
		m1.showInfo();
		System.out.println("\n\nAfter Recharge BDT : 30");
		m1.recharge(30);
		m1.showInfo();
		
	}
}