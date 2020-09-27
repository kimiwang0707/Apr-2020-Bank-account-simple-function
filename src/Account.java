/*
 * Update on: 15/04/2020 
 */
public class Account 
{
	private String name;
	private double balance;
	
	public Account(String name, double balance)
	{
		this.name = name;
		if (balance > 0)
		{
			this.balance = balance;
		}
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount <=  balance)
		{
			balance = balance - withdrawAmount;
		} else
		{
			System.out.print("\nWithdrawal amount exceeded the account balance.\n");
		}
	}
	
	public double getBalance()
	{
		return balance;
	}
			

}
