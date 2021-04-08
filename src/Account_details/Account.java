package Account_details;

public class Account {
	private String accountName;
	private double accountBal;
	
	public Account(String accountName, double accountBal) {
		if(accountBal<0)
		{
			System.out.println("Starting balance can not be less than \0.00");
		}
		else
		{
			this.accountName=accountName;
			this.accountBal=accountBal;
			System.out.println("Account is initialized with "+this.accountBal);
		}

	}
	
	public String getAccountName()
	{
		return accountName;
	}

	public double getAccountBal()
	{
		return accountBal;
	}
	
	public void transferFunds(double withdrawal)
	{
		if(withdrawal>this.accountBal)
		{
			System.out.println("Unnabel to transfer: Balanace is insufficient "+withdrawal);
		}
		else if(withdrawal<0){
			System.out.println("Transfer amount must be greater than \0.00 "+withdrawal);
		}
		else
		{
			this.accountBal=this.accountBal-withdrawal;
			System.out.println(withdrawal +" Amount is trasferred successful and balance in your account now "+this.accountBal);
		}
	}
	
	public void addFunds(double deposit)
	{
		if(deposit<0)
		{
			System.out.println("Amount deposited must be greater than zero \0.00");
		}
		else
		{
			this.accountBal+=deposit;
			System.out.println("Deposit of " +deposit+ " successfull and The balance is now " +this.accountBal);
		}
	}
}
