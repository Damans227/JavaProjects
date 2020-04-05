//Java Program to Calculate Average Using Arrays
package Arrays;
import java.util.Scanner;

public class Lab01 {
	
	public static void main(String[] args) {
		double sum=0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total number of elements for \nwhich you want to calculate the average: ");
		//Accept the size of the Array
		
		int n=sc.nextInt();
		double[] arr= new double[n];
		
		//Accept the elements of the Array
		System.out.println("Enter those "+ n + " elements one by one: ");
		for(int i =0; i<n;i++) {
			
			arr[i]=sc.nextDouble();
			
		}
		
		//Calculate the sum of all the elements in an Array
		for(double k:arr) {
		sum+= k;
				
		}
		//Calculate the Average of the Array elements
		
		double average=sum/arr.length;
		
		System.out.println("Average of all the numbers you have entered: "+average);
		
		
		
	}

}
