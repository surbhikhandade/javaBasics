package Array;
/* identity matrix = 1 0 0
 * 					 0 1 0
 * 					 0 0 1				
 * */

import java.util.Scanner;

public class Identity_Matrix {
				public static void main(String[] args) {
						int n,i,j,a[][],f=0;
						System.out.println("Enter the size of matrix : ");
						Scanner sc = new Scanner(System.in);
						n=sc.nextInt();
						a=new int [n][n];
						
						System.out.println("Enter " +n*n+ " element of array matrix : ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								a[i][j]=sc.nextInt();
							}
						}
						System.out.println("Given matrix is : ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.print(a[i][j] + " ");
							}
							System.out.println();
						}
						
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								if(i==j && a[i][j]!=1)
								{
									f=1;
								}
								else if(i!=j && a[i][j]!=0)
								{
									f=1;
								}
							}
						}
						if(f==0)
						{
							System.out.println("Given matrix is identity matrix ");
						}
						else
						{
							System.out.println("Given matrix is not identity matrix ");

						}
						
				}

}
