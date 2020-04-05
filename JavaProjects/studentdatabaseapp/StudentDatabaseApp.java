package studentdatabaseapp;
import java.util.Scanner;
public class StudentDatabaseApp {

	public static void main(String[] args) {
	
		

		// Ask how many new users you want to add
		
		System.out.print("Enter number of new students to enroll: ");
		Scanner in = new Scanner(System.in);
		int numOfStudents=in.nextInt();
		Student[] Students= new Student[numOfStudents];
		
		
		// Create n number of new students 
		
		for(int n=0;n<numOfStudents; n++) {
			
			Students[n]=new Student();
			Students[n].enroll();
			Students[n].payTuition();
		}
		
		for(int n=0; n< numOfStudents; n++) {
			System.out.println(Students[n].showInfo());
			
		}
	}

}
