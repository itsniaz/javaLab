public class Contact
{
    private String personName;
	private	 String personId;
    private int age;
    private String mobileNumber;
    private char gender;
	
	public void setPersonName(String personName)
	{
		this.personName = personName;
	}
	public void setPersonId(String personId)
	{
		this.personId = personId;
	}
	
	public void setPersonAge(int age)
	{
		this.age = age;
	}
	
	public void setMobileNo(String mobileNumber)
	{
		this.mobileNumber = mobileNumber;
	}
	public void setGender (char gender)
	{
		this.gender = gender;
	}
	
	public String getPersonName()
	{
		return personName;
	}
	public String getPersonId()
	{
		return personId;
	}
	public int getAge()
	{
		return age;
	}
	public char getGender()
	{
		return gender;
	}
	
	public String getMobileNo()
	{
		return mobileNumber;
	}
    public Contact()
    {

    }
    public Contact(String personName, String personId, int age, String mobileNumber, char gender)
    {
        this.personName = personName;
        this.personId = personId;
        this.age = age;
        this.mobileNumber = mobileNumber;
        this.gender = gender;
    }
    public void showPersonalInfo()
    {
        System.out.println(".......Showing Person Information........");
        System.out.println(personName);
        System.out.println(personId);
        System.out.println(age);
        System.out.println(mobileNumber);
        System.out.println(gender);
    }
	public void detectMobileOp()
	{
		if(mobileNumber.charAt(2)=='7')
		{
			System.out.println("Grammenphone");
		}
		else if(mobileNumber.charAt(2)=='8')
		{
			System.out.println("Robi");
		}
		else if(mobileNumber.charAt(2)=='9')
		{
			System.out.println("Banglalink");
		}
		else if(mobileNumber.charAt(2)=='6')
		{
			System.out.println("Airtel");
		}
		else if(mobileNumber.charAt(2)=='5')
		{
			System.out.println("Teletalk");
		}
		else
		{
			System.out.println("Can't Detect The Operator");
		}
	
	}
	public static void search(String Name,Contact[] p)
	{
		for(int i=0;i<p.length;i++)
		{
			if(p[i].getPersonName().equals(Name))
			{
				System.out.println("\n\n------Found-----");
				System.out.println(p[i].getPersonName());
				System.out.println(p[i].getPersonId());
				System.out.println(p[i].getAge());
				System.out.println(p[i].getGender());
				System.out.println(p[i].getMobileNo());
			}
		}
	}
    public static void main (String args[])
    {
       Contact c1 = new Contact("Niaz Ahmed","xxxxx",21,"017-xxxxxxxx",'M');
	   Contact c2 = new Contact("Mamun Ashraf","xxxxx",21,"019-xxxxxxxx",'M');
	   Contact c3 = new Contact("Nawshin Nusrat","xxxxx",25,"019-xxxxxxxx",'F');
	   
	   Contact[] p = new Contact[3];
	   p[0]=c1;
	   p[1]=c2;
	   p[2]=c3;
	
      c1.detectMobileOp();
	  Contact.search("Niaz Ahmed",p);
        
    }
}