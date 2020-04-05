//Check if Int Array contains a given value

package Arrays;
import java.util.Scanner;
public class Lab04 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// get the size of the array
		System.out.println("Enter the size of your array: ");
		int n=sc.nextInt();
    	//declare the array
		double[] arr=new double[n];
		//get the elements of your array
		System.out.println("Enter the members your array: ");
		for(int i=0;i<n;i++) {	
			arr[i]=sc.nextDouble();
		}
		
	//find your element
		System.out.println("Enter the member to be searched in your array: ");
		double tofind=sc.nextDouble();
		int pos=0;
		
		boolean found=false;
		for(double k:arr) {
			
			if(k==tofind) {
				pos++;
				found = true;
				break;
			}
		}
		
		System.out.println("your number "+tofind+" is at position "+pos );
		
		
		
	

	}

}
