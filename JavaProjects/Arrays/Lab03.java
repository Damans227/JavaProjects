//Concatenate Two Arrays without using arraycopy

package Arrays;
import java .util.Scanner;
public class Lab03 {

	public static void main(String[] args) {
		
		// get the size of the array1
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of the first array: ");
		int n1=sc.nextInt();
		
		// declare the array1
		
		double[] arr1=new double[n1];
		
		//get elements for array1
		System.out.println("Enter the elements of the first array: ");
		for(int i=0;i<n1;i++) {
			
			arr1[i]=sc.nextDouble();
			
		};
	// get the size of the both the array1
		
		System.out.println("Enter the size of the second array: ");
		int n2=sc.nextInt();
		
		// declare the array2
		
		double[] arr2=new double[n2];
		
		//get elements for array2
		System.out.println("Enter the elements of the second array: ");
		for(int i=0;i<n2;i++) {
			
			arr2[i]=sc.nextDouble();
			
		};
	
		//concatenate those arrays
		
		int length=arr1.length+arr2.length;
		double[] result=new double[length];
		
		int pos=0;
		
		for(double k:arr1) {
			result[pos]=k;
			pos++;
		}
		

		for(double k:arr2) {
			result[pos]=k;
			pos++;
		}
		// display the new array
		System.out.print("Your concetaned array: ");
		for(double k:result) {
			
			System.out.print(k +" ");
		}

	}

}
