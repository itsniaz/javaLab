public class EEE extends Department
{
	public EEE(String deptName,int creditFee)
	{
		super(deptName,creditFee);
	}
	@Override
	public int calculateSemesterFee(int credit)
	{
		return credit*getCreditFee();
	}
}