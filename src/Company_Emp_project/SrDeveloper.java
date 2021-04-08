package Company_Emp_project;
class SrDeveloper extends Developer 
{
	public static int sdev_c;
	{
		sdev_c++;
	}
	public void work()
	{
		System.out.println("senior developer should design HLD and LLD");
	}
	SrDeveloper (String name,double salary)
	{
		super(name,salary);
	}
	
	SrDeveloper()
	{
	}
}
