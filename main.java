import java.util.Scanner;
import java.io.*;
public class main
{
	public static void main (String[] args)
	
	{
		Scanner inp = new Scanner(System.in);
		
		String name = inp.nextLine();
		
	
		
		int track =  name.indexOf(' ');
		
		track++;
		
		
		System.out.println(name.substring(0,track)+name.substring(track,name.length()).toUpperCase());
	}
}