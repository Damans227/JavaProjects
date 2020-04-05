package studentdatabaseapp;
import java.util.Scanner;
public class Student {
	
	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses="";
	private int tuitionBalance=0;
	private static int costOfCourse=600;
	private static int id =1000;
	
	
	
//constructor: prompt user to enter students name and year
	public Student() {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter student first name: ");
		this.firstName=in.nextLine();
		
		System.out.println("Enter student last name: ");
		this.lastName=in.nextLine();
		
		System.out.println("1 - Frehsman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter student class level: ");
		this.gradeYear=in.nextLine();
		
		setStudentID();
	
		
		
	}
	
//Generate an ID
	
	private void setStudentID() {
		
		// Grade level + ID
		id++;
		this.studentID = gradeYear + "" + id;
		
		
		
	}
//Enroll in courses
	public void enroll() {
		do {
		System.out.print("Enter the course to enroll (Q to quit)");
		Scanner in = new Scanner(System.in);
		String course=in.nextLine();
		if(!course.equals("Q")) {
			courses = courses+  "\n" + course;
			tuitionBalance=tuitionBalance+costOfCourse;
			
		} else {
			break;
			
		}
		}while(1!=0);
	}
	
//View Balance
	public void viewBalance() {
		System.out.println("Your new balance is: $"+tuitionBalance);	
		
	}
	
// Pay tuition
	
	public void payTuition() {
		
		System.out.println("Enter your payment: $");
		Scanner in=new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance=tuitionBalance-payment;
		System.out.println("Thanks for your payment of $: " + payment);
		viewBalance();
		
		
	}
//Show Status
	
	public String showInfo() {
		
		return "Name: "+ firstName + " " +lastName + "\nGrade Level: "+ gradeYear + "\nStudent ID: "+ studentID +"\nCourses Enrolled:" + courses +
				"\nBalance: $"+tuitionBalance;
	}
	
	

}
