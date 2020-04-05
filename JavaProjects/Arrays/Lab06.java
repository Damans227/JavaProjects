//Program to Find Transpose of a Matrix

package Arrays;
import java.util.Scanner;

public class Lab06 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		// Get the size of the 2-D array
		
		System.out.println("Enter the number of rows for your array: ");
		int rows=sc.nextInt();
		System.out.println("Enter the number of columns for your array: ");
		int cols=sc.nextInt();
		
		// Declare the array
		
		int[][] arr = new int[rows][cols];
		
		// Ask for the elements of the array
		
		System.out.println("Enter the elements for your array\nNote: Total number of elements allowed are "+rows*cols+" :");
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				arr[i][j]=sc.nextInt();
				
			}
			
	} 		
		System.out.println("Array you have Entered: ");
		display(arr);
		
		int[][] transpose= new int[cols][rows];
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				
				transpose[j][i]=arr[i][j];
			}
		}
		
		System.out.println("Transposed Array: ");
		display(transpose);
		

	}
	
	
	public static void display(int matrix[][]) {
	

		for(int k[]: matrix) {
			for(int l:k) {
				System.out.print(l+ " ");
			}	System.out.println();
		}
		
	}

}
