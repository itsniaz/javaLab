public class Library
{
		private String libName;
		private	String libAddress;
		private Book [] listOfBook;
		int totalBook;
		
		public Library()
		{
			totalBook = 0;
		}
		public Library(String libName,String libAddress,Book[] listOfBook)
		{
			this.libName = libName;
			this.libAddress = libAddress;
			this.listOfBook = listOfBook;
			this.totalBook = totalBook;
			this.listOfBook = listOfBook;
		}

		public void showLibInfo()
		{
			System.out.println("Library Name : "+libName);
			System.out.println("Library Address : "+libAddress);
			System.out.println("Total Number of Books : "+totalBook);
			System.out.println("\nBooks Available in the Library : ");
			for(int i = 0;	i<listOfBook.length;	i++)
			{
				if(listOfBook[i].getBookName().equals("No Name"))continue;
				listOfBook[i].showBookInfo();
			}
		}
		public void addNewBook(Book book)
		{
			 listOfBook[totalBook] = book;
			 totalBook += book.getBookCopy();
		}

		public static void main(String[] args)
		{
			Book b1[] = new Book[10];
			for(int i = 0; i < b1.length ; i++)
			{
   				 b1[i] = new Book();
			}

			b1[0].setBookName("Bela Periye");
			b1[0].setBookAuthor("Niaz Ahmed");
			b1[0].setBookId("ISBN - 2114");
			b1[0].setBookType("Travel");
			b1[0].setBookCopy(3);


			Library l1 = new Library("AIUB Library","Banani",b1);

			System.out.println("\nBefore Adding Book");
			l1.showLibInfo();
		

			System.out.println("\nAfter Adding Book");
	
			l1.addNewBook(b1[0]);
			l1.showLibInfo();
		}

}