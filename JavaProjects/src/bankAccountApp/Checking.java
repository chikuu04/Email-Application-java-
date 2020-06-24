package bankAccountApp;

public class Checking extends Account{
	
	//list properties specific to checking
	private int debitCard;
	private int pin;
	
	//constructor to initializes checking account properties
	public Checking(String name,String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNo="2"+accountNo;
		setSafetyDepositBox();
	}
	
	@Override
	public void setrate() {
		rate= getBaseRate()*0.15;
	}
	
	private void setSafetyDepositBox() {
		debitCard=(int)(Math.random()*Math.pow(10,12));
		pin=(int)(Math.random()*Math.pow(10,4));
	}
	
	//list any methods specific to checking account
	public void showInfo() {
		System.out.println("Account Type: CHECKING");
		super.showInfo();
		System.out.println("Your saving accounts features: "+
		"\n Debit Card Number: "+debitCard+
		"\n pin: "+pin);
		
	}
}
