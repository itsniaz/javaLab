public class Library
{
		private String libName;
		private	String libAddress;
		private Book [] listOfBook;
		int totalBook=0;
		
		public Library()
		{

		}
		public Library(String libName,String libAddress)
		{
			this.libName = libName;
			this.libAddress = libAddress;
			listOfBook = new Book[10];
		}

		public void showLibInfo()
		{
			System.out.println("\n\n-----------------------------------------");
			System.out.println("|\tLibrary Name   : "+libName+"\t|");
			System.out.println("|\tLibrary Address : "+libAddress+"\t|");
			System.out.println("-----------------------------------------\n");
			System.out.println("Books Available in the Library : \n");
			for(int i = 0;	i<listOfBook.length;i++)
			{
				
				if(listOfBook[i]!=null)
				{
					listOfBook[i].showBookInfo();
				}
			}
			Book.showTotalBookInfo();

		}
		public void addNewBook(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
		{
			Book b = new Book(bookName,bookAuthor,bookId,bookType,bookCopy);

			for(int i = 0;i<listOfBook.length;i++)
			{
				if(listOfBook[i]==null)
				{
					listOfBook[i]=b;
					break;
				}
			}
		}

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