
package emailapp;
import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		
		String fName,lName;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first name of the person");
		fName=sc.nextLine();
		
		System.out.println("Enter the lastname name of the person");
		lName=sc.nextLine();
		
		Email em1= new Email(fName, lName);
		
		// TODO Auto-generated method stub

	}

}
