
public class main 
{
    public static void main(String[] args) 
    {
        Account a = new Account("XYZ","Niaz Ahmed",50000);
        a.showInfo();
        OverdraftAccount oa = new OverdraftAccount("44564", "Imam Hasan",70000, 50000);
        oa.showInfo();
        int amt = 51000;
        if(!oa.withdraw(amt))
        {
            System.out.println("\nWithdrawal Failed");
        }
        else
        {
            System.out.println("\n"+amt+" /- has been withdrawn from AC : "+oa.getAcid());
        }

    }
}