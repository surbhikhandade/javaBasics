package Array;

import java.util.Scanner;

public class Display_array {
	
					public static void main(String[] args) {
							
						int i,n;
						System.out.println("Enter size of array : ");
						Scanner sc = new Scanner(System.in);
						 n = sc.nextInt();
						 
						 System.out.println("Enter element " +n+ " of array : ");
						 int a[]= new int [n];
						 for(i=0;i<n;i++)
						 {
							 a[i]=sc.nextInt();
						 }
						 
						 System.out.println("Your array elements are : ");
						 
						 for(i=0;i<n;i++)
						 {
							System.out.println(a[i] + " ");
						 }
						 sc.close();
					}
					

}
