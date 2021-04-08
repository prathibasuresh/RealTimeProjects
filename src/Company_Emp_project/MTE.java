package Company_Emp_project;
class MTE extends TestEngineer
{
	public static int mte_c;
	{
		mte_c++;
	}
	public void work()
	{
		System.out.println("MTE is responsible for manually testing the software");
	}
	MTE(String name,double salary)
	{
		super(name,salary);
	}
	
	MTE()
	{
	}
}
