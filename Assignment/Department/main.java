public class main 
{
	public static void main(String[] args) 
	{
		Department d1 = new CS("CS",5000);
		Department d2 = new EEE("EEE",4500);
		Department d3 = new BBA("BBA",3000);

		Student s = new Student("Niaz Ahmed",d1);
		s.showInfo();
		System.out.println("Semester Fee : "+s.getDept().calculateSemesterFee(16)+"\n");
	
		
	}
}