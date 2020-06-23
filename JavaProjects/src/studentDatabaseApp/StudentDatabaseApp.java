package studentDatabaseApp;
import java.util.*;
public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		//Ask how many students we want add
		System.out.print("Enter the number of students to enroll:");
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		Student[] students=new Student[num];
		
		//create n number of new students
		for(int i=0;i<num;i++) {
			students[i]=new Student();
			students[i].enroll();
			students[i].payTution();
			
		}
		
		for(int i=0;i<num;i++) {
			System.out.println(students[i].toString());
		}
		

	}

}
