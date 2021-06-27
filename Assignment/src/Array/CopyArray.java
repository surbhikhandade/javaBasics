package Array;

import java.util.Scanner;

public class CopyArray {
				
				public static void main(String[] args) {
							
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter the element of array :");
							int size = sc.nextInt();
							int a[] = new int[size];
							int b[] = new int [size];
							
							System.out.println("Enter Element " +size+ " Number of array :");
							for(int i=0;i<size;i++)
							{
								
								a[i] = sc.nextInt();
							}
							
							/*System.out.println("Originnal Array is :");
							for(int i=0;i<size;i++)
							{
								
								System.out.println(a[i]+ " ");
							}*/
							
							System.out.println("Copy of array is :");
							for(int i=0 ;i<size;i++)
							{
								b[i] = a[i];
								System.out.println(b[i]);
							}
							
							
					}
}
