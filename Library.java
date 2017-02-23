
//Incomplete 
public class Library
{
		private String libName;
		private	String libAddress;
		private Book [] listOfBook;
		int totalBook;
		
		public Library()
		{
			
		}
		public Library(String libName,String libAddress,Book[] listOfBook,int totalBook)
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
			for(int i = 0;i<listOfBook.length();i++)
			{
				if(listOfBook[i].getbookName.equals("null"))
				{
					continue;
				}
				else
				{
					listOfBook[i].showBookinfo();
				}
			}
		}
		public static void main(String[] args)
		{
			Book b1[] = new Book[5];
			Library l1 = new Library("AIUB Library","Banani",b1,5);
			l1.showLibInfo();
		}

}