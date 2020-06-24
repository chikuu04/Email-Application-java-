package bankAccountApp;

public class Savings extends Account{
	
	//list properties specific to saving account
	private int SafetyDepositBoxId;
	private int SafetyDepositBoxKey;
	//constructor to initializes settings for savings account
	public Savings(String name,String ssn,double initDeposit) {
		super(name,ssn,initDeposit);
		accountNo="1"+accountNo;	
		setSafetyDepositBox();
	}
	
	@Override
	public void setrate() {
		rate= getBaseRate()-0.25;
	}
	
	private void setSafetyDepositBox() {
		SafetyDepositBoxId=(int)(Math.random()*Math.pow(10,3));
		SafetyDepositBoxKey=(int)(Math.random()*Math.pow(10,4));
	}
	
	//list any methods specific to saving accounts
	public void showInfo() {
		System.out.println("Account Type: SAVINGS");
		super.showInfo();
		System.out.println("Your saving accounts features: "+
		"\n Safety Deposit Box ID: "+SafetyDepositBoxId+
		"\n Safety Deposit Box Key: "+SafetyDepositBoxKey);
	}
	
	
}
