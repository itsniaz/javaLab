public class main 
{
    public static void  main(String[] args) 
    {
        Person p1 = new Person("Niaz Ahmed");
        Account a1 = new CurrentAC("ABCD-123",500000);
        p1.setAccount(a1);
        p1.showACInfo();

    }
}