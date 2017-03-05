	public class main{
    public static void main(String args[])
	{
		Mobile m1 = new Mobile("Niaz Ahmed","01754545499",0.00,"Android",true);
		m1.showInfo();

        System.out.println("\n\n*****   After Recharge  *****");
        m1.recharge(100.00);
        m1.showInfo();


        int duration = 17;

		m1.callSomeone(duration);
      
		System.out.println("\n\n   *****  After Making Call   *****");
        System.out.println("Call Duration : "+duration);
		m1.showInfo();
		System.out.println("\n\n*****   After Recharge BDT : 30    ***** ");
		m1.recharge(30);
		m1.showInfo();
	}
    }