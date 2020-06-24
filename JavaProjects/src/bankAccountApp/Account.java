package bankAccountApp;

public abstract class Account implements IBaseRate {
		//list common properties for saving and checking accounts
		private String name;
		private String ssn;
		private double balance;
		
		private static int index=10000;
		protected String accountNo;
		protected Double rate;
		
	//constructor to set base properties and initializes the account
	public Account(String name,String ssn,double initDeposit) {
	this.name=name;
	this.ssn=ssn;
	balance=initDeposit;
	//Set account number
	index++;
	this.accountNo=setAccountNumber();
	setrate();
	}
	public abstract void setrate();
	
	private String setAccountNumber() {
		String lastTwoOfSsn= ssn.substring(ssn.length()-2,ssn.length());
		int UniqueId=index;
		int randomNumber=(int)(Math.random()*Math.pow(10,3));
		return lastTwoOfSsn+UniqueId+randomNumber;
	}
	
	public void Compound() {
		double accruedInterest=balance*(rate/100);
		balance=balance + accruedInterest;
		System.out.println("Accrued Interest: $"+accruedInterest);
		printBalance();
	}
	//list common methods
	public void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Depositing $"+amount);
		printBalance();
	}
	
	public void withdraw(int withdraw) {
		balance=balance-withdraw;
		System.out.println("Withdrawing $"+withdraw);
		printBalance();
	}
	public void transfer(String toWhere,int amount) {
		balance= balance-amount;
		System.out.println("Transferring $ "+amount+" to "+toWhere);
		printBalance();
	}
	public void printBalance() {
		System.out.println("Your balance is now: $"+balance);
	}
	
	public void showInfo() {
		System.out.println("Name: "+name+"\n"+"Account Number: "+accountNo+"\n"+
	                         "Balance: "+balance+"\n"+"Rate: "+rate+"%");
	}
}
