/*
 * Update on: 15/04/2020 
 * Student Name: Yuxi Wang
 * Student ID: 22001587
 */
import java.util.Scanner;
public class Account_Test 
{
	public static void main(String[] args) 
	{
		double totalWithdrawAmount = 0;
		int count = 0;
		double avgWithdrawAmount = 0;
		
		Scanner input = new Scanner(System.in);
		Account acct1 = new Account("John Smith", 100.00);
		System.out.printf("%s account balance is : $%.2f\n", acct1.getName(), acct1.getBalance());
		System.out.println("\n=====================================================");
		
		System.out.print("Enter withdrawal amount: (999.99 to stop) $");
		double withdrawAmount = input.nextDouble();
		
		while (withdrawAmount != 999.99)
		{
			if( 0 < withdrawAmount )
			{	
				if (withdrawAmount <= acct1.getBalance())
				{	
				totalWithdrawAmount += withdrawAmount;
				count = count + 1;				
				avgWithdrawAmount = totalWithdrawAmount / count;
				acct1.withdraw(withdrawAmount);
				System.out.printf("\n%s balance is: $%.2f\n", acct1.getName(), acct1.getBalance());						
				System.out.println("\n=====================================================");  
				} else {
					System.out.print("\nWithdrawal Amount exceeded the account balance.\n\n");
				       }				
			}else{
				System.out.println("\nWithdrawal amount must be positive ( > 0)\n");
				System.out.printf("%s balance is: $%.2f\n", acct1.getName(), acct1.getBalance());	
				System.out.println("\n====================================================="); 
			}
			     
				System.out.print("Enter withdrawal amount: (999.99 to stop) $");
				withdrawAmount = input.nextDouble();	
		}
				System.out.println("\n====================================================="); 
				System.out.printf("You have made %d withdraw amount today.%nThe total is $%.2f%n" +
						"The average withdrawal amount is $%.2f%n", count, totalWithdrawAmount, avgWithdrawAmount);
				System.out.print("\nEnd of program");

	}

}
