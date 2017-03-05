public class OverdraftAccount extends Account
{
    private int overdraftLimit;
    public OverdraftAccount(String acid,String accName,int balance,int overdraftLimit)
    {
        super(acid,accName,balance);
        this.overdraftLimit = overdraftLimit;
    }
    @Override
    public boolean withdraw(int amount)
    {
        if(amount<=getBalance() && amount<=overdraftLimit )
        {
            setBalance(getBalance()-amount);
            return true;
        }
        else
        {
            return false;
        }
    }
}