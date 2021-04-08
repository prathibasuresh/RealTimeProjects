package Company_Emp_project;
import java.io.Serializable;

abstract class Emp implements iEmp,Serializable 
{
	private String name ;
	private int eid;
	private double salary;
	static int gen_id ; 
	
	{
		eid = ++gen_id ;
	}

	Emp()
	{
	}

	Emp(String name , double salary)
	{
		this.name=name;
		this.salary=salary;
	}

	public void setName(String name)
	{
		this.name= name;
	}

	public String getName()
	{
		return name;
	}

	public int getEid()
	{
		return eid;
	}

	public void setSalary(double salary)
	{
		this.salary=salary;
	}

	public double getSalary()
	{
		return salary;
	}

	public int compareTo(Object obj)
	{
		if (this.salary==((Emp)obj).salary)
			return 0;
		else if(this.salary>((Emp)obj).salary)
			return 1;
		else 
			return -1;
	}

	/* public boolean equals(Object obj)
	{
		Emp temp=(Emp) obj;
		return this.name==temp.name;
	}*/ 

}
