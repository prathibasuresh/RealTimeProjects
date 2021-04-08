package Account_details;

import java.util.Scanner;

public class Check_printmainmenu {
	static Scanner s=new Scanner(System.in);
	public static int validateInput()
	{	
		System.out.println("enter any number");
		while(!s.hasNextInt())
		{
			s.next();
			System.out.println("please enter correct choice");
			
		}
		int ch=s.nextInt();
		return ch;
	}



	public static void main(String[] args) {
		
		int choice=Check_printmainmenu.validateInput();
		System.out.println("from Main method");
		System.out.println(choice);

	}

}
