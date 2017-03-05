public class Bank{
	private Transaction []listOfTransaction;
	int totalNumberOfTransaction;
	static int totalTransAmount=0;
	public Bank()
	{
		listOfTransaction=new Transaction[2];
	}
	public void addTransaction(Account sender,Account receiver,int a){
		int i;
		Transaction t=new Transaction(sender,receiver,a);
		if(t.isSuccessful())
		{
			totalTransAmount+=a;
		};

		for(i=0;i<listOfTransaction.length;i++){
			if(listOfTransaction[i]==null){
				listOfTransaction[i]=t;
				break;
			}
		}
		if(i==listOfTransaction.length)
			System.out.println("Transaction list is full");
	}

	public void showAllTransaction(){
		System.out.println("\n\nShowing all listed Transactions : \n");
		for(int i=0;i<listOfTransaction.length;i++){
			if(listOfTransaction[i]!=null){
				System.out.println("Serial : "+(++i));
				i--;
				System.out.println("Sender : "+listOfTransaction[i].getSender().getAccName());
				System.out.println("Receiver : "+listOfTransaction[i].getReceiver().getAccName());
				System.out.println("Transaction Amount : "+listOfTransaction[i].getAmount()+"/-");
				System.out.println("Status : "+listOfTransaction[i].getadditionalInfo());
				System.out.println("\n");
			}
		
		}

	System.out.println("\n*** Total Amount of Succesful Transaction made trough Bank : "+totalTransAmount);
}
}