public class Student
{
	private String name;
	private String id;
	private String Department;
	private double CGPA;
	private Course[] listOfCourse;

	public Student(String name,String id,String Department,double CGPA)
	{
		
		this.name = name;
		this.id = id;
		this.Department = Department;
		this.CGPA = CGPA;
		listOfCourse = new Course[5];
	}

	public void addCourse(Course course)
	{
		int i=0;
		for(;i<listOfCourse.length;i++)
		{
			if(listOfCourse[i]==null)
			{
				
				listOfCourse[i] = course;
				break;
			}
		}
		if(i==listOfCourse.length)
		{
			System.out.println("***Mr.\\Mrs. "+name+" you can't take more than five courses\n");
		}
	}

	public void dropCourse(Course course)
	{
		for(int i=0;i<listOfCourse.length;i++)
		{
			if(listOfCourse[i]==course)
			{
				listOfCourse[i]=null;
			}
		}
	}

	public void setName(String Name)
	{
		this.name = name;
	}
	public void setID(String ID)
	{
		this.id = id;
	}
	
	public void setDept(String Department)
	{
		this.Department = Department;
	}
	public void setCGPA(double CGPA)
	{
		this.CGPA = CGPA;
	}
	
	public String getName()
	{
		return name;
	}
	public String getID()
	{
		return id;
	}
	public String getDept()
	{
		return Department;
	}
	public double getCGPA()
	{
		return CGPA;
	}
	public void showInfo()
	{
		System.out.println("---------------------------------------------------");
		System.out.println("|\t\t*** Student Profile***\t\t  |");
		System.out.println("|\t\tStudent Name : "+name+"\t  |");
		System.out.println("|\t\tID           : "+id+"\t  |");
		System.out.println("|\t\tDept         : "+Department+"\t\t  |");
		System.out.println("|\t\tCGPA         : "+CGPA+"\t\t  |");
		System.out.println("---------------------------------------------------");

		System.out.println("\n  Registered Courses : ");
		int j=0;
		for(int i=0;i<listOfCourse.length;i++)
		{
			if(listOfCourse[i]!=null)
			{
				System.out.println("\t\t\t"+(++j)+"."+listOfCourse[i].getCourseName()+"\n"); 
				                                    
			}
		}
		System.out.println("\n");

	}
}