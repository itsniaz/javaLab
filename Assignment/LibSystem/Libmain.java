public class main
{
    public static void main(String[] args)
		{
			Library library = new Library("AIUB Library","Banani,Dhaka");
		
			library.addNewBook("Bela Periye","Shuvro Soikot","ISBN 2201","Travel",1);
			library.addNewBook("Somoy Holo Oshomoye","Kasafaddoza Noman","ISBN55646","Novel",3);
			library.addNewBook("Ballpoint","Humayun Ahmed","ISBN89841","Autobiography",2);
			library.addNewBook("The Art Of the Deals","Donald Trump","ISBN46542","Autobiography",1);
			library.addNewBook("Ghost in The Wires","Kevin Mitnick","ISBN65465","Hacking",2);
			library.showLibInfo();
	    }
}