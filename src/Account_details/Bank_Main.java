package Account_details;

import java.util.Scanner;

public class Bank_Main {
	static Scanner s=new Scanner(System.in);

	public static void main(String[] args) {
		boolean quit=true;
		int choice;
		String accountName;
		double startBal;
		
		System.out.println("Welcome to ICICI bank(:-)");
		System.out.println("=============================");
		System.out.println("Please Enter your details below");
		System.out.println("Account Name: ");
		accountName=s.nextLine();
		System.out.println("Starting Balance: ");
		startBal=s.nextDouble();
		Account account=new Account(accountName, startBal);
		
		while(quit)
		{
			System.out.println("1. Check Balance");
			System.out.println("2. Add Funds");
			System.out.println("3. Transfer Funds");
			System.out.println("4. Exit the program");
			choice=printMainMenu();
			System.out.println(choice);
			
			switch(choice)
			{
			case 1:
				System.out.println("Check Balance: ");
				System.out.println("Account Name: " +account.getAccountName()+ "   Accont Balanace: "+account.getAccountBal());
				break;
			case 2:
				System.out.println("Enter amount to be added:");
				account.addFunds(s.nextDouble());
				break;
			case 3:
				System.out.println("Enter amount to be transferred:");
				account.transferFunds(s.nextDouble());
				break;
			case 4:
                quit = true;
                System.out.println("THANK YOU.....!!!! VISIT AGAIN.....!!!") ;
                break;
			default:
                System.out.println("Invalid choice.");
              }
			System.out.println("1. continue with banking");
			System.out.println("press any number to exit ");
			System.out.println("============================");
			int ch2 = s.nextInt();

			if (ch2 != 1)
			{
				quit = false ;
			}
		}
		
		s.close();
		
	}
	
	public static int printMainMenu()
	{
		
		while(!s.hasNextInt())
		{
			s.next();
			System.out.println("Please enter correct choice");
		}
		int ch=s.nextInt();
		return ch;
	}

}
