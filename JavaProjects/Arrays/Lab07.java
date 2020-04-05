//Java Program to Add Two Matrix Using Multi-dimensional Arrays

package Arrays;
import java.util.Scanner;
public class Lab07 {

	public static void main(String[] args) {
	
		int rows, cols;
		
		//Get Size of the Array
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		rows=sc.nextInt();
		System.out.println("Enter the number of cols: ");
		cols=sc.nextInt();
		
		//Declare the arrays 
		double[][] arr1=new double[rows][cols];
		double[][] arr2=new double[rows][cols];
		double[][] sum=new double[rows][cols];
		
		// Enter the array elements
		
		System.out.println("Enter the elements for your Array-1\nNote: Total number of elements allowed are "+rows*cols+" :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				arr1[i][j]=sc.nextDouble();
				
			}
		}
		System.out.println("Enter the elements for your Array-2\nNote: Total number of elements allowed are "+rows*cols+" :");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				arr2[i][j]=sc.nextDouble();
				
			}
		}
		System.out.println("Array 1: ");
		display(arr1);
		System.out.println("Array 2: ");
		display(arr2);

		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
			sum[i][j]=arr1[i][j]+arr2[i][j];
				
			}
		}
		System.out.println("Sum of the Array-1 and Array-2: ");
		display(sum);

	
	}
	
	
	
	
// Display function for array output
	public static void display(double matrix[][]) {
		
		for(double k[]:matrix) {
			for(double j:k) {
				
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
