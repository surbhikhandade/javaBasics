package Array;

import java.util.Scanner;

public class Sum_Each_Row {
			
			public static void main(String[] args) {
					int i,j,n,sum=0,a[][],b[][];
					System.out.println("Enter the size of matrix :");
					Scanner sc=new Scanner(System.in);
					n=sc.nextInt();
					a=new int[n][n];
					b=new int [n][n];
					
					System.out.println("Enter " +n*n+ " elements for array matrix : " );
					for(i=0;i<n;i++)
					{
						for(j=0;j<n;j++)
						{
							a[i][j]=sc.nextInt();
						}
					}
					
					System.out.println("Given matrix :");
					for(i=0;i<n;i++)
					{
						for(j=0;j<n;j++)
						{
							System.out.print(a[i][j]+ " ");
						}
						System.out.println();
					}
					
					System.out.println("Sum of each row :");
					for(i=0;i<n;i++)
					{
						for(j=0;j<n;j++)
						{
							sum=sum+a[i][j];
						}
						System.out.println("Sum of " +(i+1)+ " row is " +sum);
					}
					sc.close();
			}

}
