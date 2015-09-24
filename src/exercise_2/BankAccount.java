package exercise_2;

public class BankAccount {

	//PUBLIC INSTANCE VARIABLES
	public String accountNumber;
	public String ownersName;
	public float balance;
	public float withdraw;
	public float deposit;
	
	//GETTERS AND SETTERS
	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getOwnersName() {
		return ownersName;
	}

	public void setOwnersName(String ownersName) {
		this.ownersName = ownersName;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}
	
	public float getWithdraw() {
		return withdraw;
	}

	public void setWithdraw(float withdraw) {
		this.withdraw = withdraw;
	}

	public float getDeposit() {
		return deposit;
	}

	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}

	//CONSTRUCTOR~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	public BankAccount(String accountNumber, String ownersName, float balance)
	{
		this.accountNumber = accountNumber;
		this.ownersName = ownersName;
		this.balance = balance;
	}
	
	//PUBLIC METHODS
	public void getAccountInfo() //display by returning values set by the constructor
	{
		float previousBalance = this.balance; // to hold the previous Balance before being decremented by the withdrawal or incremented by the deposit
		this.balance -= this.getWithdraw();
		this.balance += this.getDeposit();
		System.out.printf("__________________________________%nChequing - %s%n%s%n%nYour previous balance: $%,.2f%nWithdrawals: $%,.2f%nDeposits: $%,.2f%nYour current balance is $%,.2f", this.accountNumber, this.ownersName, previousBalance, this.withdraw, this.deposit, this.balance);
	}

}
