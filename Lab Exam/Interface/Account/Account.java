public abstract class Account
{
    private String acID;
    private double balance;
    private double limit;
    private String acType;

    public String getAcType() {
        return this.acType;
    }

    public void setAcType(String acType) {
        this.acType = acType;
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
    
    public abstract void calcLimit();

    public abstract boolean withdraw(double amount);

    public boolean deposit(int amount)
    {
    	return balance+=amount;
    }
}