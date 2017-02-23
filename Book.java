 class Book
{
   
        static int bookObj = 0;
		private  String bookName;
		private String bookAuthor;
		private String bookId;
		private String bookType;
		private int bookCopy;

	
	public void setBookName(String bookName)
	{
		 this.bookName = bookName;
	}
	public void setBookAuthor(String bookAuthor)
	{
		this.bookAuthor = bookAuthor;
	}
	
	public void setBookId(String bookId)
	{
		this.bookId = bookId;
	}
	public void setBookType(String bookType)
	{
		this.bookType = bookType;
	}
	public void setBookCopy(int bookCopy)
	{
		this.bookCopy = bookCopy;
	}
	
	public String getBookName()
	{
		 return bookName;
	}
	public String getBookAuthor()
	{
		return bookAuthor;
	}
	
	public String getBookId()
	{
		return bookId;
	}
	public String getBookType()
	{
		return bookType;
	}
	public int getBookCopy()
	{
		return bookCopy;
	}

	public Book(String bookName,String bookAuthor,String bookId,String bookType)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookObj ++;
	}
    public  Book()
    {
        bookName = "No Name";
		bookAuthor = "No Name";
		bookCopy = 0;
		bookId = "";
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
		System.out.println("Number of Total Books : " +bookObj);
    }
    
}