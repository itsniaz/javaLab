public  class Course
{
	private String courseName;
	private String courseID;
	private double credit;
	private static int Obj=0;


	public Course(String courseName,String courseID,double credit)

	{
		this.courseName = courseName;
		this.courseID = courseID;
		this.credit = credit;
		Obj++;
	}

	public String getCourseName() 
	{
	    return courseName;
	}

	public String getCourseID() 
	{
	    return courseID;
	}

	public void setCourseName(String courseName) 
	{
	    this.courseName = courseName;
	}

	public void setCourseID(String courseID) {
	    this.courseID = courseID;
	}

	public double getCredit() {
	    return this.credit;
	}

	public void setCredit(double credit) {
	    this.credit = credit;
	}

	public static int getObj()
	{
		return Obj;
	}

}