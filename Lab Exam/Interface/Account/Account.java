public abstract class Account implements AccountInterface
{
    private String acID;
    private double balance;
    private double limit;
    private String acType;

    public void setAcType(String acType)
    {
        this.acType = acType;
    }
    
    public String getAcType()
    {
        return this.acType;
    }
    public double getLimit() {
        return this.limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
    
    public Account()
    {
        
    }

    public String getAcID() {
        return this.acID;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAcID(String acID) {
        this.acID = acID;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public Account(String acID,double balance)
    {
    	this.acID = acID;
    	this.balance = balance;
    }

    @Override
    public boolean deposit(double amount)
    {
         balance+=amount;
         return true;
    }

    public abstract boolean withdraw(double amount);
    public abstract void calcLimit();
}