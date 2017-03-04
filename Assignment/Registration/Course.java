public class Course {

    private int courseID;
    private String courseName;
    private Student registered[];

    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Course(int courseID,String courseName)
    {
        this.courseID = courseID;
        this.courseName = courseName;
        registered = new Student[30];

    }
    public void showRegStu()
    {
        System.out.println("  \nShowing registered students in "+courseName+" :");
        for(int i=0;i<registered.length;i++)
        {
            if(registered[i]!=null)
            {
               System.out.println("\t\t"+(i+1)+"."+registered[i].getID()+"   "+registered[i].getName());
            }
        }
    }
    public void addStu(Student student)
    {
        int i;
        for(i=0;i<registered.length;i++)
        {
            if(registered[i]==null)
            {
                registered[i]=student;
                break;
            }
        }
        if(i==registered.length)
        {
            System.out.println("Section Full");
        }
    }

    public void delStu(Student student)
    {
        for(int i=0;i<registered.length;i++)
        {
            if(registered[i]==student)
            {
                registered[i]=null;
            }
        }
    }
}