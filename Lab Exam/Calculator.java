
public class Calculator implements BasicCalculatorInterface,ScientificCalculatorInterface  
{
	@Override
	public int sum(int x, int y)
	{
		return x+y;
	}

	@Override
	public int sub(int x, int y)
	{
		return x-y;
	}

	@Override
	public int multiplication(int x, int y)
	{
		return x*y;
	}

	@Override
	public int division(int x, int y)
	{
		return x/y;
	}

	@Override
	public double XtoY(int x, int y)
	{
		return Math.pow(x,y);
	}

	@Override
	public double sinVal(int x)
	{
		return Math.sin(x);
	}

	@Override 
	public double cosVal(int x)
	{
		return Math.cos(x);
	}

}