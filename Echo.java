import java.util.Scanner;
public class Echo
{
    private String name;

    public Echo(String name)
    {
       this.name = name; 
    }
    public Echo()
    {

    }
	public void addEcho()
	{
		name = name.trim();
		int track =  name.indexOf(' ')+1;
		name = name.substring(0,track)+name.substring(track,name.length()).toUpperCase();
	}
    public String getName()
    {
        return name;
    }

    public static void main(String[] args)
    {
        String name;
        Scanner inp = new Scanner(System.in);
        System.out.printf("Enter your name : ");
        name = inp.nextLine();
        Echo e1 = new Echo(name);
        e1.addEcho();
        System.out.println(e1.getName());

    }
}