import java.util.Scanner;
public class perLine
{
    private String something;
    
    public void setSomething(String something)
    {
        this.something = something;
    }

    public perLine(String something)
    {
        this.something = something;
    }


    public perLine()
    {

    }

    public void linePerChar()
    {
        for(int i = 0; i<something.length(); i++)
        {
           System.out.println(something.charAt(i));
        }
    }

    public static void main(String[] args)
    {
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter something : ");
        String something = inp.nextLine();
        perLine ob1 = new perLine();
        ob1.setSomething(something);
        ob1.linePerChar();

    }
}