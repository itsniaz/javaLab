public class Contact
{
    String personName;
    String personId;
    int age;
    String mobileNumber;
    char gender;
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
    public static void main (String args[])
    {
        Contact c1 = new Contact("Niaz Ahmed","xxxxx",21,"017-xxxxxxxx",'M');
        c1.showPersonalInfo();
        
    }
}