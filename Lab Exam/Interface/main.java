public class main extends Calculator 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();

	   //Method from ScientificCalulator Interface
	    System.out.println("Cos Value of 52 : "+c.cosVal(52));
	    System.out.println("2 to the power 4 is : "+c.XtoY(2,4));

	    //Methods from BasicCalculatorInterface
	    System.out.println("5 + 4 : "+c.sum(5,4));
	    System.out.println("5 - 4 : "+c.sub(2,4));
	    System.out.println("5 * 4 : "+c.multiplication(2,4));


	}

}