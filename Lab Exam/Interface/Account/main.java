public class main 
{
    public static void  main(String[] args) 
    {
        Person p1 = new Person("Niaz Ahmed");
        Account a1 = new CurrentAC("ABCD-123",500000);
        Account a2 = new SavingAC();

        System.out.println("\n\n");

        p1.setAccount(a1);
        p1.showACInfo();

        System.out.println("\n\nAfter Changing the Account Type \n\n");

        p1.changeAC(a2);
        p1.showACInfo();



    }
}