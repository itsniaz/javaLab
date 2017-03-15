public class main 
{
	public static void main(String[] args)
    {
		Rectangle r[] = new Rectangle[5];

		r[0] 	 = new Rectangle(32,56);
		r[1]	 = new Rectangle(55,56);
		r[2]	 = new Rectangle(112,47);
		r[3]	 = new Rectangle(98.05,174.12);
		r[4]	 = new Rectangle(141.32,221.33);

		double avg=0;

		for(Rectangle re : r)
		{
			avg+=re.getArea();
		}

		System.out.println("\nArea of all Rectangles : "+avg/r.length);

		System.out.println("\nAreas where y > 100 : ");

		for(Rectangle re : r)
		{
			if(re.getY()>100)
				System.out.println("\nX = "+re.getX()+" Y = "+re.getY()+" Area = "+re.getArea());
		}
	}
}