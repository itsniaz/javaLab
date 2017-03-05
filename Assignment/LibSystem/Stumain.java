public class main
{
    public static void main(String args[])
    {
         Student st1 = new Student("Niaz Ahmed","15-28535-1","CSE",3.78);
         Student st2 =  new Student("Mamun Ashraf","15-28236-1","CSE",3.71);
         Student st3 = new Student("Nawshin Nusrat","15-28519-1","CSE",3.92);

         Course c1 = new Course(0000145,"Advanced CN");
         Course c2 = new Course(0000146,"Compiler Design");
         Course c3 = new Course(0000147,"CAD");
         Course c4 = new Course(0000148,"Mircroprocessor");
         Course c5 = new Course(0000149,"OOP 2");
         Course c6 = new Course(0000151,"Web Tech");

         Enroll e = new Enroll();

         e.addCourse(st1,c1);
         e.addCourse(st1,c2);
         e.addCourse(st1,c3);
         e.addCourse(st1,c4);

         e.addCourse(st2,c6);
         e.addCourse(st2,c3);
         e.addCourse(st2,c5);
         e.addCourse(st2,c2);


         e.addCourse(st3,c1);
         e.addCourse(st3,c2);
         e.addCourse(st3,c3);
         e.addCourse(st3,c4);
         e.addCourse(st3,c5);

        st1.showInfo();
        st2.showInfo();
        st3.showInfo();
        
         e.addCourse(st3,c6);//Testing Course Limit
       
        c2.showRegStu();//Showing Registered Students in a Course
       
       System.out.println("\n\n---------------- ** After Adding Dropping **  --------------\n");
        e.dropCourse(st3,c2);
        e.addCourse(st2,c1);
        st2.showInfo();       
        st3.showInfo();
     
         c2.showRegStu();//Showing Registered Students in a Course
    }
}