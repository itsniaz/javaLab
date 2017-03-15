public class Student
{
	private String name;
	private String id;
	private String Department;
	private double CGPA;
	private Course course;
	private static int Obj=0;
	
	
	public Student()
	{
		name = "No name";
		id = "NULL";
		Department = "No Dept";
		CGPA = 0.00;
		Obj++;
		
	}
	public Student(String name,String id,String Department,double CGPA,Course course)
	{
		this.name = name;
		this.id = id;
		this.Department = Department;
		this.CGPA = CGPA;
		this.course = course;
		Obj++;

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
	public Course getCourse()
	{
		return course;
	}
	
	public static int getObj()
	{
		return Obj;
	}
}