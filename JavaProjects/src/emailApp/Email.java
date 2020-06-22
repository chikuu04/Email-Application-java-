package emailApp;
import java.util.*;
public class Email {
			private String firstName;
			private String lastName;
			private String password;
			private String department;
			private String email;
			private int mailboxCapacity=500;
			private int defaultPasswordLength=10;
			private String alternateEmail;
			private String companySuffix="anycompany.com";
			
			//constructor to recieve firstname and lastname
			public Email(String firstName,String lastName) {
				this.firstName=firstName;
				this.lastName=lastName;
				//System.out.println("Email Created :  "+this.firstName+" "+this.lastName);
				
			// Calling a method for the department - return the department	
				this.department=setDepartment();
				//System.out.println("Department is: "+this.department);
				
			// Calling a method that returns random password
				this.password=randomPassword(defaultPasswordLength);
				System.out.println("Your Password is: "+this.password);
				
			//comnine elements to generate email
				email= firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+"."+department+companySuffix; 
				//System.out.println("Your Email is: "+email);
			}
			//Ask for department
			private String setDepartment() {
				System.out.println("New Worker: "+firstName+",Department Codes\n 1 for Sales\n 2 for development\n"
						+ " 3 for Accounting\n 0 for none\nEnter the Department Code");
				Scanner in = new Scanner(System.in);
				int depChoice=in.nextInt();
				if(depChoice==1) { return "Sales"; }
				else if(depChoice==2) { return "Development"; }
				else if(depChoice==3) { return "Accounting" ; }
				else { return "None" ; }
				
			}
			//generate a random password
			private String randomPassword(int length) {
				String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789;@#$&%";
				char[] password = new char[length];
				for(int i=0;i<length;i++) {
					int rand= (int) (Math.random()*passwordSet.length());
					password[i]=passwordSet.charAt(rand);
				}
				return new String(password);
			}
			//set a mailbox capacity
			public void setMailBoxCapacity(int capacity) {
				this.mailboxCapacity=capacity;
			}
			
			//set the alternate email
			public void setAlternateEmail(String altEmail) {
				this.alternateEmail=altEmail;				
			}
			
			//change the password
			public void changePassword(String password) {
				this.password=password;
			}
			
			public int getMailboxCapacity() {return mailboxCapacity; }
			public String getAlternateEmail() { return alternateEmail;}
			public String getPassword() { return password;}
			
			public String showInfo() {
				return "DISPLAY NAME: "+firstName+" "+lastName+
						"\nCOMPANY EMAIL: "+email+
						"\nMAILBOX CAPACITY: "+mailboxCapacity+"mb";
			}
			
		
}