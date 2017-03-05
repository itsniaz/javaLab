public abstract class Department 
{
	private String deptName;
	private int creditFee;

	public String getDeptName() {
	    return this.deptName;
	}

	public int getCreditFee() {
	    return this.creditFee;
	}

	public void setDeptName(String deptName) {
	    this.deptName = deptName;
	}

	public void setCreditFee(int creditFee) {
	    this.creditFee = creditFee;
	}

	public Department(String deptName,int creditFee)
	{
		this.deptName = deptName;
		this.creditFee = creditFee;
		
	}
	public abstract int calculateSemesterFee(int credit);
}