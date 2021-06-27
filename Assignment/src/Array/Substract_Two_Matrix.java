package Array;

import java.util.Scanner;

public class Substract_Two_Matrix {
					public static void main(String[] args) {
						int i,j,n,a[][],b[][],c[][];
						System.out.println("Enter the size of matrix: ");
						Scanner sc=new Scanner(System.in);
						n=sc.nextInt();
						a=new int [n][n];
						b=new int [n][n];
						c=new int [n][n];
						
						System.out.println("Enter " +n*n+ " elements for array matrix: ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								a[i][j]=sc.nextInt();
							}
						}
						
						System.out.println("Enter " +n*n+ " elements for array matrix: ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								b[i][j]=sc.nextInt();
							}
						}
						
						System.out.println("First matrix ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.print(a[i][j]+ " ");
							}
							System.out.println();
						}
						
						System.out.println("Second matrix ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.print(b[i][j]+ " ");
							}
							System.out.println();
						}
						
						System.out.println("Substraction of two matrix: ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								c[i][j] = a[i][j] - b[i][j];
							}
						}
						
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.print(c[i][j]+" ");
							}
							System.out.println();
						}
						sc.close();
					}

}//main end
