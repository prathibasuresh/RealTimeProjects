package Company_Emp_project;
public class ATE extends TestEngineer
{
	public static int ate_c;
	{
		ate_c++;
	}
	public void work()
	{
		System.out.println("ATE is responsible for writing script");
	}
	ATE (String name,double salary)
	{
		super(name,salary);
	}
	
	ATE()
	{
	}
}
