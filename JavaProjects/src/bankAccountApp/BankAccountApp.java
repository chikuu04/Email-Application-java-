package bankAccountApp;

import java.util.LinkedList;

import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts=new LinkedList<Account>();

		
		//read a csv file and create new account based on that data
		String file= "C:\\Users\\KIIT\\Desktop\\DS & JAVA\\project.csv";
		java.util.List<String[]> newAccountHolder = utilities.CSV.read(file);
		for(String[] accountHolder: newAccountHolder) {
			String name=accountHolder[0];
			String ssn=accountHolder[1];
			String accountType=accountHolder[2];
			double initDeposit=Double.parseDouble(accountHolder[3]);
			
			
			if(accountType.equals("Savings")) {
				accounts.add(new Savings(name,ssn,initDeposit));
			}else if(accountType.equals("Checking")){
				accounts.add(new Checking(name,ssn,initDeposit));
			}else {
				System.out.println("Error");
			}
				
		}
		
		
		for(Account acc: accounts) {
			System.out.println("\n************************");
			acc.showInfo();
		}

	}
}

