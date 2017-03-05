public class main{
	public static void main(String args[]){
		Account sen=new Account("SA-RA-1","Rahim",1500);
		Account rec=new Account("SA-KA-2","Karim",1200);
		
		Account sen2=new Account("SA-RA-1","Raju",2000);
		Account rec2=new Account("SA-MI-1","Mina",2100);
		
		Bank b=new Bank();

		System.out.println("\n-------------Before Trasaction-----------\n");
		sen.showInfo();
		rec.showInfo();
		sen2.showInfo();
		rec2.showInfo();


		b.addTransaction(sen,rec,130);
		b.addTransaction(sen2,rec2,5000);
		System.out.println("\n-------------After Trasaction-----------\n");
		sen.showInfo();
		rec.showInfo();
		sen2.showInfo();
		rec2.showInfo();
		
		b.showAllTransaction();
	}
}