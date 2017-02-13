public class Book
{
   
        static int bookObj = 0;
		private  String bookName;
		private String bookAuthor;
		private String bookId;
		private String bookType;
		private int bookCopy;


	public Book(String bookName,String bookAuthor,String bookId,String bookType)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookObj += 1;
	}
    public  Book()
    {
        bookObj +=  1;
    }
    public void showBookInfo()
    {
        System.out.println(bookName);
        System.out.println(bookAuthor);
        System.out.println(bookId);
        System.out.println(bookType);
        System.out.println(bookCopy);
    }
    public void addBookCopy(int x)
    {
        bookCopy += x;
    }
    static int bookCounter()
    {
        return bookObj;
    }
    static void showTotalBookInfo()
    {
    
    }
   public static void main(String[] args) 
   {
      Book b1 = new Book();
      Book b2 = new Book();
      Book b3 = new Book();
      System.out.println("Number of Books : "+bookObj); 
   
   }
    
}