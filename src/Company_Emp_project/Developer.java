package Company_Emp_project;
abstract class Developer extends Emp
{
	public static int dev_c;
	{
		dev_c++;
	}
	final  public static String Desgn="Software Development Engineer";
	Developer (String name,double salary)
	{
		super(name,salary);
	}
	
	Developer()
	{
	}
}
