import java.util.Scanner;
public class Microwave
{
    private StringBuffer time;

    public Microwave(StringBuffer time)
    {
        this.time = time;
    }
    public Microwave()
    {

    }
    public void setTime(StringBuffer time)
    {
        this.time = time;
    }
    public StringBuffer getMyTime()
    {
        time = time.insert(time.length()-2,":");
        return time;
    }

    public static void main(String[] args)
    {
        Microwave m1 = new Microwave();
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter cook time -> ");
        String time = inp.nextLine();
        StringBuffer bfrtime = new StringBuffer(time);
        m1.setTime(bfrtime);
        System.out.println("Your Time -> "+m1.getMyTime());
        

    }

}