public class CS extends Department 
{
	public CS(String deptName,int creditFee)
	{
		super(deptName,creditFee);
	}
	@Override
	public int calculateSemesterFee(int credit)
	{
		return credit*getCreditFee();
	}
	
}