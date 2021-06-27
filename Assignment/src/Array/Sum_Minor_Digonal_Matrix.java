package Array;

import java.util.Scanner;

public class Sum_Minor_Digonal_Matrix {
			public static void main(String[] args) {
				int a[][],i,j,n,sum=0;
				System.out.println("Enter the size of matrix : ");
				Scanner sc = new Scanner(System.in);
				n=sc.nextInt();
				a=new int[n][n];
				
				System.out.println("Enter " +n*n+ " elements for array matrix :");
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
						System.out.print(a[i][j]+" ");
					}
					System.out.println();
				}
				
				
				System.out.println("Minor Diagonal elements of given matrix is ");
				j=n-1;
				for(i=0;i<n;i++)
				{
					{
						System.out.println(a[i][j]+" ");	
						sum =sum+a[i][j];
					}
					j--;
					
				}
				System.out.println("Minor Digonal Matrix sum is : " +sum);
			}

}
