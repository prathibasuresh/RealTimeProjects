package Company_Emp_project;
import java.util.Scanner ;
import java.util.Collections;
import java.util.ArrayList ;
import java.io.*;

class Company  
{
	static ArrayList <Emp> emp  = new ArrayList<>(); //generics(creating homogeneous ArrayList of type Emp)
	static Scanner s = new Scanner(System.in);

	public static int validateInput()
	{	
		
		while(!s.hasNextInt())
		{
			s.next();
			System.out.println("please enter correct choice");
			
		}
		int ch=s.nextInt();
		return ch;
	}

	public static void createEmp() throws Exception
	{
		boolean flag=true;

		while (flag )
		{
			System.out.println("select which employee you want to create...");
			System.out.println("1. Senior Developer");
			System.out.println("2. Junior Developer");
			System.out.println("3. MTE");
			System.out.println("4. ATE");
			int choice=validateInput();
			System.out.println("Enter name ") ;
			String name = s.next() ;
			System.out.println("Enter Salary :") ;
			double  salary  = s.nextDouble() ;
			FileOutputStream fout=new FileOutputStream("D://f1.txt");
			ObjectOutputStream out=new ObjectOutputStream(fout);
		
			switch (choice)
			{
				case 1:emp.add( new SrDeveloper( name , salary) ) ;
						out.writeObject(emp);
						break;

				case 2:	emp.add( new JrDeveloper( name , salary) ) ;
						out.writeObject(emp);
						break;

				case 3:	emp.add( new MTE( name , salary) ) ;
						out.writeObject(emp);
						break;

				case 4:	emp.add( new ATE( name , salary) ) ;
						out.writeObject(emp);
						break;

				default:System.out.println("invalid choice....");
			}
			System.out.println("1. continue creating employee");
			System.out.println("press any number to go back ");
			int ch2 = s.nextInt();

			if (ch2 !=1)
			{
				flag = false ;
			}
		
		}
	}

	public static void displayFromFile() throws Exception
	{
		FileInputStream fin=new FileInputStream("D://f1.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			ArrayList ob=(ArrayList)in.readObject();
			for (Object i:ob )	// for each loop (iterator)
			{
				
			System.out.println("name:"+((Emp) i).getName());
					}
				// i1=(Emp)in.readObject();
				//System.out.println("name:"+i1.getName());
	}

	public static void displayAll( ) 
	{
		for (Emp i:emp )	// for each loop (iterator)
			{
			  System.out.println("******************************") ;

				if(i instanceof Developer)
				   System.out.println("Employee Designation: "+Developer.Desgn);

				if(i instanceof TestEngineer)
				   System.out.println("Employee Designation: "+TestEngineer.Desgn) ;

			   System.out.println("Employee Id: " + i.getEid());
			   System.out.println("Employee name: " + i.getName());
			   System.out.println("Employee Salary: " + i.getSalary());
			   System.out.print("Employee work: ");
			   i.work();

			   System.out.println("******************************") ;
			   System.out.println("******************************") ;
			
			}
			System.out.println("total employees are :"+Emp.gen_id) ;
			System.out.println("total no. developers are :"+Developer.dev_c) ;
			System.out.println("total no. test engineers are :"+TestEngineer.test_c) ;
			System.out.println("total no. senior developers are :"+SrDeveloper.sdev_c);
			System.out.println("total no. junior developers are :"+JrDeveloper.jdev_c);
			System.out.println("total no. MTE are :"+MTE.mte_c);
			System.out.println("total no. ATE are :"+ATE.ate_c);
	}

	public static void search()
	{
			System.out.println("enter name to be searched");
			String name = s.next() ;
			boolean flag = true ;
			for (int i = 0 ; i < emp.size()  ; i++ )
			{
				Emp temp = emp.get(i) ;
			
				if (name.equalsIgnoreCase(temp.getName()))
				{
					System.out.println("hurrreeyy..!! employee found");
					System.out.println("at position " + (i+1));
					flag = false ;
					break ;
				}
			}
			if ( flag )
			{
				System.out.println("sorry to say...!!! employee which you are searching was not found....!!!!");
			}
	}

	public static void delete()
	{
		System.out.println("enter employee id ");
		int eid =s.nextInt();
		boolean flag=false;
		
		for (Emp temp:emp)
		{
			if (eid==temp.getEid())
			{
				if(temp instanceof Developer)
				Developer.dev_c--;

				if(temp instanceof TestEngineer)
				TestEngineer.test_c--;

				if(temp instanceof SrDeveloper)
				SrDeveloper.sdev_c--;

				if(temp instanceof JrDeveloper)
				JrDeveloper.jdev_c--;

				if(temp instanceof ATE)
				ATE.ate_c--;

				if(temp instanceof MTE)
				MTE.mte_c--;

				Emp.gen_id--;

				emp.remove(temp);

				System.out.println("Employee with employee id : "+eid+" is successfully deleted");

				flag=true;
				break;
			}
		}
		if (!flag)
		{
			System.out.println("SORRY..!! Employee not found ");
		}
	}

	public static void sort()
	{
		ArrayList<Emp>temp=new ArrayList<>(emp);
		Collections.sort(temp) ;
		System.out.println("SORTED BASED ON SALARY ");
		for (Emp i:temp )	// for each loop (iterator)
			{
			   
			   System.out.println("******************************") ;

				if(i instanceof Developer)
				   System.out.println("Employee Designation: "+Developer.Desgn);

				if(i instanceof TestEngineer)
				   System.out.println("Employee Designation: "+TestEngineer.Desgn) ;

			   System.out.println("Employee Id: " + i.getEid());
			   System.out.println("Employee name: " + i.getName());
			   System.out.println("Employee Salary: " + i.getSalary());
			   System.out.print("Employee work: ");
			   i.work();

			   System.out.println("******************************") ;
			   System.out.println("******************************") ;
			
			}	
	}

	public static void main(String[] args) throws Exception
	{
		boolean flag = true ;
		while (flag )
		{
			System.out.println("WELCOME TO COMPANY ") ;
		
			System.out.println("Please enter your choice") ;
			System.out.println("1. for creating an emp...") ;
			System.out.println("2. display all....") ;
			System.out.println("3. Search emp based on name") ;
			System.out.println("4. delete an employee") ;
			System.out.println("5. Display employee in sorted order of salary ") ;
			System.out.println("6. Display employee read from file ") ;

			int ch = validateInput() ;
			switch (ch)
			{
			case 1 : createEmp() ;
						 break ;
			case 6 : displayFromFile();
						break;
			case 2 :  displayAll() ; 
						 break ;
			case 3 : search() ;
						 break ;
			case 4 : delete() ;
						break;
			case 5 : sort();
						break;

			default : System.out.println("invalid..!!") ;
			}

			System.out.println("1. for main menu");
			System.out.println("press any number to exit");
			int ch2 = s.nextInt();
			if (ch2 !=1)
			{
				flag = false ;
			}
		}
		System.out.println("THANK YOU.....!!!! VISIT AGAIN.....!!!") ;
	}
}