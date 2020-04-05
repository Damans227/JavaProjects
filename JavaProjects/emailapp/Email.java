package emailapp;

import java.util.Scanner;

public class Email {
	
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity=500;
	private String alternateEmail;
	private int defaultPasswordlength=10;
	private String email;
	private String companySuffix="generco.com";
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("EMAIL CREATED: "+this.firstName+" "+this.lastName);
		
		// Call a method asking for the department - return the department 
		
		this.department=setDepartment();
		System.out.println("Department: "+ this.department);
		
		seperator();
		

	    // Call a method which returns a random password
		
		this.password=randomPassword(defaultPasswordlength);
		System.out.println("Your random password is: "+ this.password);
		
		seperator();
		
		// combine elements to generate email
		
		email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "."+companySuffix;
		System.out.println("Your email is: "+ email);
		
		seperator();
		//Set mailbox Capacity
		
		mailboxCapacity=setmailboxCapacity();
		System.out.println("Your mailbox capacity is set to : "+ mailboxCapacity);
		
		seperator();
		
	//Set alternate email
		
		alternateEmail=setAltemail();
		System.out.println("Your alternate email is set to : "+ alternateEmail);
		
		seperator();
		
		
	}
	
	// Ask for the department
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter Department code: ");
		Scanner in=new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {return "sales";}
		else if(depChoice==2){return "dev";}
		else if(depChoice==3) {return "acct";}
		else {return "";}
		
		
	}
	
	// Generate a random password
	
	private String randomPassword(int length) {
		
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand= (int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
			
		} return new String(password);
		
		
	}
	// Set the mailbox Capacity
	
	private int setmailboxCapacity() {
		System.out.println("Enter the Capacity of your mailbox: ");
		Scanner in1= new Scanner(System.in);
		int capacity=in1.nextInt();
		return capacity;		
	}
	
	// Set the alternate email
	
	private String setAltemail() {
		System.out.println("Enter the alternative email: ");
		Scanner in2= new Scanner(System.in);
		String altEmail=in2.nextLine();
		return altEmail;
			
	}
	
	private void seperator() {
	System.out.println("******************************");
	}	

}
