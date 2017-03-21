public class main 
{
    public static void  main(String[] args) 
    {
        Person p1 = new Person();
        Account a1 = new CurrentAC();
        p1.setAccount(a1);

        System.out.println(p1.getAccount().getAcType());
    }
}