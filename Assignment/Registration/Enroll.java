public class Enroll
{
    public Enroll()
    {
        
    }
    public void addCourse(Student student,Course course)
	{
		student.addCourse(course);
        course.addStu(student);
	}
    public void dropCourse(Student student,Course course)
    {
        student.dropCourse(course);
        course.delStu(student);
    }
}