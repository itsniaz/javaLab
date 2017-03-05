public class BBA extends Department
{
	public BBA(String deptName,int creditFee)
	{
		super(deptName,creditFee);
	}
    @Override
	public int calculateSemesterFee(int credit)
	{
		return credit*getCreditFee();
	}
}