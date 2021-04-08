package Company_Emp_project;
class JrDeveloper extends Developer 
{
	public static int jdev_c;
	{
		jdev_c++;
	}
	public void work()
	{
		System.out.println("junior developer should write code");
	}
	JrDeveloper (String name,double salary)
	{
		super(name,salary);
	}
	
	JrDeveloper()
	{
	}
}
