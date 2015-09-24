package exercise_2;
import java.util.Scanner;

public class Driver {
	
	public static BankAccount bank; // create object for BankAccount class

	public static void main(String[] args) {
		
		//LOCAL VARIABLES
		String account, owner;
		float balance, withdrawal, deposit;
		
		Scanner input = new Scanner(System.in);
		
		//USER INPUT
		System.out.print("Enter Account Number: ");
		account = input.nextLine(); // user inputs to this local variable

		System.out.print("Enter Owner's Name: ");
		owner = input.nextLine(); // user input to local variable
		
		System.out.print("Enter Current Balance: $");
		balance = input.nextFloat(); // user input to local variable
		
		// instantiate object - setting the values through the arguments in the Constructor - 
		// - and before using the setters for Withdraw and Deposit 
		//(need the object instantiated first before being able to use properties from the BankAccount class
		bank = new BankAccount(account, owner, balance); 
		
		System.out.print("Enter Withdrawal Value: $");
		withdrawal = input.nextFloat(); // user input to local variable -
		bank.setWithdraw(withdrawal); // - set Bank class variable
		
		System.out.print("Enter Deposit Value: $");
		deposit = input.nextFloat(); // user input to local variable -
		bank.setDeposit(deposit); // - set Bank class variable
		
	
		bank.getAccountInfo();//display this display method from Bank class
	}

}
