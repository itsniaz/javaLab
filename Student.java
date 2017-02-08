public class Student
{
	private String name;
	private String id;
	private String Department;
	private double CGPA;
	
	
	public Student()
	{
		name = "No name";
		id = "NULL";
		Department = "No Dept";
		CGPA = 0.00;
		
	}
	public Student(String name,String id,String Department,double CGPA)
	{
		this.name = name;
		this.id = id;
		this.Department = Department;
		this.CGPA = CGPA;
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
		System.out.println(name);
		System.out.println(id);
		System.out.println(Department);
		System.out.println(CGPA);
	}
	
	
	public static void main(String[] args)
	{
		Student st = new Student("Niaz Ahmed","15-28535-1","CSE",3.78);
		st.showInfo();
		
		
	}
	
}