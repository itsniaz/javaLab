import java.util.Scanner;
import java.io.*;
public class Title
{
		private String name;
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public void addT()
		{
			name = name.trim();
			if(name.startsWith("Amy")==true)
			{
				System.out.println("Ms. "+name);
			}
			else if(name.startsWith("Buffy")==true)
			{
				System.out.println("Ms. "+name);
			}
			else if(name.startsWith("Cathy")==true)
			{
				System.out.println("Ms. "+name);
			}
			else if(name.startsWith("Elroy")==true)
			{
				System.out.println("Mr. "+name);
			}
			else if(name.startsWith("Fred")==true)
			{
				System.out.println("Mr. "+name);
			}
			else if(name.startsWith("Graham")==true)
			{
				System.out.println("Mr. "+name);
			}
			else
			{
				System.out.println("Mr/Mrs "+name);
			}
		}
		
		public static void main (String[] args)
		{
			Scanner inp = new Scanner(System.in);
			Title t = new Title();
			System.out.printf("Enter a name : ");
			String name = inp.nextLine();
			t.setName(name);
			t.addT();
			
		}
}