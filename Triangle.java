class Triangle
{
	private int x;
	private int y;
	private int z;
	
	public Triangle()
	{
		x =0;
		y = 0;
		z= 0;
	}
	public Triangle(int x,int y,int z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void showInfo()
	{
		System.out.println("--------Showing Triangle Information-------");
		System.out.println("X = "+x);
		System.out.println("Y = "+y);
		System.out.println("Z = "+z);
	}
	public void testTriangle()	{
		if((x == y) && (y == z))	
		{
			System.out.println("the  triangle is equilateral");
		}
		else if((x == y) || (y == z) || (x == z))	
		{
			System.out.println("the  triangle is equilateral");
		}
		else	
		{
			System.out.println("the  triangle is scalene");
		}
	}
	public static void main(String[] args)
	{
		Triangle tr = new Triangle(4,5,6);
		tr.showInfo();
		tr.testTriangle();
	}
}