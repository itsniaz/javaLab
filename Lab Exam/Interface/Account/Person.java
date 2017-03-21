public  class Person 
{
 	private String name;
 	private Account account;
 	private Account tempAC;
	

 	public String getName() {
 	    return this.name;
 	}

 	public Account getAccount() {
 	    return this.account;
 	}

 	public void setName(String name) 
 	{
 	    this.name = name;
 	}

 	public void setAccount(Account account) 
 	{
 	    this.account = account;
 	}

	public Person(String name)
 	{
 		this.name = name;
 	}

 	public boolean changeAC(Account account)
 	{
 		tempAC = this.account;
 		this.account = account;
 	 	this.account.setBalance(tempAC.getBalance());
 	 	this.account.setAcID(tempAC.getAcID());
 	 	return true;

 	}

 	public void showACInfo()

 	{
 		System.out.println("Account ID "+account.getAcID());
 		System.out.println("Account Balance : "+account.getBalance());
 		System.out.println("Account Holder : "+getName());
 		//System.out.println("Account Type : "+getAcType());
 		
 	}

}