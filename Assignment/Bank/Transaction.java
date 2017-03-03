class Transaction
{
	private Account sender;
	private Account receiver;
	private	int amount;
	private	String additionalInfo;
	private boolean Status;


	public Account getSender() 
	{
	    return sender;
	}

	public Account getReceiver() {
	    return receiver;
	}
	public int getAmount()
	{
		return amount;
	}

	public String getadditionalInfo()
	{
		return additionalInfo;
	}

	public boolean isSuccessful()
	{
		return Status;
	}



	public void setSender(Account sender)
	{
	    this.sender = sender;
	}

	public void setReceiver(Account receiver) 
	{
	    this.receiver = receiver;
	}

	public Transaction()
	{
	}
	
	public Transaction(Account sender,Account receiver,int amount)
	{

		this.sender = sender;
		this.receiver = receiver;
		this.amount = amount;


		if(sender.transfer(receiver,amount))
		{
			additionalInfo = "Successful";
			Status = true;

		}
		else
		{
			additionalInfo = "Unsucessful Due to insufficient balance";
		}
	}
	

}