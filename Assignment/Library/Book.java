 class Book
{
   
        static int bookObj = 0;
		static int copyObj = 0;
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

	public Book(String bookName,String bookAuthor,String bookId,String bookType,int bookCopy)
	{
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookId = bookId;
		this.bookType = bookType;
        this.bookCopy = bookCopy;
        bookObj ++;
		copyObj += bookCopy;
	}

    public  Book()
    {
    }
    public void showBookInfo()
    {
        System.out.println("\nTitle 	   		:  "+bookName);
        System.out.println("Author     		:  "+bookAuthor);
        System.out.println("Book ID    		:  "+bookId);
        System.out.println("Book Type  		:  "+bookType);
        System.out.println("Numer Of Copies 	:  "+bookCopy+"\n\n");
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
		System.out.println("\n***Number of Total Books : " +bookObj);
		System.out.println("***Number of Total Copies : " +copyObj);
    }
    
}