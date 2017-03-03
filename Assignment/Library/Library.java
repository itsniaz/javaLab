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
}