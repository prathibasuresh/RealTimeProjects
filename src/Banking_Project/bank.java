package Banking_Project;

public abstract class bank {
	private int AC_No;
	private String name;
	private double amount;
	
	static int gen_AC_No;
	
	{
		AC_No=++gen_AC_No;
	}
	
	bank() {
		
	}
	
	bank( String name,double amount)
	{
		this.name=name;
		this.amount=amount;
	}
	
	public int get_AC_no()
	{
		return AC_No;
	}
	
	//Set Name
	public void setName(String name)
	{
		this.name=name;
	}
	
	//Get Name
	public String getNAme()
	{
		return name;
	}
	
	//Set Amount
	public void setAmount(double amount)
	{
		this.amount=amount;
	}
	
	//Get Amount
	public double getAmount()
	{
		return amount;
	}

}
