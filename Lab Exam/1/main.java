public class main 
{
	public static void main(String[] args) 
	{
		Course c1 = new Course("OOP1","000145",3.0);
		Course c2 = new Course("Physics 1","445770",1.0);


		Student s1 = new Student("Mamun Ashraf","15-28535-1","CSE",3.71,c1);
		Student s2 = new Student("Manzarul Islam ","15-28899-1","CSSE",3.65,c2);



		System.out.println("\n"+s1.getName()+" has taken "+s1.getCourse().getCourseName()+" with credit "+s1.getCourse().getCredit()+" his/her CGPA is : "+s1.getCGPA());
		System.out.println("\n"+s2.getName()+" has taken "+s2.getCourse().getCourseName()+" with credit "+s2.getCourse().getCredit()+" his/her CGPA is : "+s2.getCGPA());
		System.out.println("\n\n"+"Number of course Objects Created : "+Course.getObj());
		System.out.println("Number of Student Objects Created : "+Student.getObj());
	}

	
}