package Company_Emp_project;
abstract class TestEngineer extends Emp
{
	final public static  String Desgn="Software Test Engineer";
	public static int test_c;
	{
		test_c++;
	}

	TestEngineer (String name,double salary)
	{
		super(name,salary);
	}
	
	TestEngineer()
	{
	}

}
