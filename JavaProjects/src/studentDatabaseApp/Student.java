package studentDatabaseApp;
import java.util.*;
public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentId;
	private String courses="";
	private int tutionBalance=0;
	private int costOfCourse=600;
	private static int id= 1000;
	
	//constructor prompt user to enter students name and year
	public Student() {
		Scanner in=new Scanner(System.in);
		System.out.print("Enter Student first name: ");
		this.firstName=in.nextLine();
		System.out.print("Enter Student last name: ");
		this.lastName=in.nextLine();
		System.out.print("1.Infant\n2.child\n3.junior\n4.senior\nEnter student class level: ");
		this.gradeYear=in.nextInt();
	
		setStudentId();
		
		
	}
	//generate an ID
	private void setStudentId(){
		//gradelevel+static id
		id++;
		this.studentId= gradeYear+""+id;
	}
	//Enroll in course
	public void enroll() {
		//get inside loop
		do {
		System.out.print("Enter the course to enroll(0 to quit): ");
		Scanner in=new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q")) {
			courses=courses+"\n*"+course;
			tutionBalance=tutionBalance+costOfCourse;
		}
		else {break;}
	}while(1 != 0 );
	
	}
	//view Balance
	public void viewBalance() {
		System.out.println("Your balance is: "+tutionBalance);
	}
	//pay tution
	public void payTution() {
		viewBalance();
		Scanner in = new Scanner(System.in);
		System.out.println("Enter your payment");
		int payment =in.nextInt();
		tutionBalance= tutionBalance - payment;
		System.out.println("Thank you for the payment of $"+payment);
		
	}
	//Show status
	public String toString() {
		return "Name: "+firstName+" "+lastName+
				"\nGrade Level: "+gradeYear+
				"\nStudent ID: "+studentId+
				"\nCourses Enrolled: "+ courses +
				"\nBalance: $"+tutionBalance;
				
	}

}
