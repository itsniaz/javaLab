public class Student
{
    private String stuName;
    private Department dept;

    public String getStuName()
    {
        return this.stuName;
    }

    public Department getDept() 
    {
        return this.dept;
    }

    public void setStuName(String stuName) 
    {
        this.stuName = stuName;
    }

    public void setDept(Department dept) 
    {
        this.dept = dept;
    }
    public void changeDept(Department dept)
    {
        this.dept = dept;
    }
    public Student(String stuName,Department dept)
    {
        this.stuName = stuName;
        this.dept = dept;
    }

    public Student()
    {
    	
    }

    public int semesterFee(int totalCredit)
    {
       return(dept.calculateSemesterFee(totalCredit));
    }

    public void showInfo()
    {
        System.out.println("Name : "+getStuName());
        System.out.println("Dept : "+dept.getDeptName());
    }

}