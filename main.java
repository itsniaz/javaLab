import java.util.Scanner;
import java.io.*;
public class main
{
	public static void main (String[] args)
	
	{
		Scanner inp = new Scanner(System.in);
		
		String name = inp.nextLine();
		
		System.out.println(name);
		
		track =  name.indexOf(' ');
		
		track++;
		
		System.out.println(name.substring(track,name.length).toUpperCase());
	}
}