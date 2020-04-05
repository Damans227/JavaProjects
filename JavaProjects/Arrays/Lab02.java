//Java Program to Find Largest Element of an Array

package Arrays;
import java.util.Scanner;
public class Lab02 {

	public static void main(String[] args) {
		//Get the size of the array
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of your array: ");
	
		int num=sc.nextInt();
		
		double[] arr= new double[num];
		
		//Get the elements of the array
		
		System.out.println("Enter the "+num+" elements of your array one by one: ");
		for(int i = 0; i<num;i++) {
		arr[i]=sc.nextDouble();
		
		}
		//Find the largest elements from the array
		
		double largest =arr[0];
		
		for(double k:arr) {
			
			if(largest<k) {
				
				largest=k;
			}
			
			
		}
		System.out.println("Largest element in the array is: "+ largest);

	}

}
