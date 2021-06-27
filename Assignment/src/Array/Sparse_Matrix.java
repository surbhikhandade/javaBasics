package Array;

import java.util.Scanner;

public class Sparse_Matrix {
		public static void main(String[] args) {
				int i,j = 0,n,a[][],count=0;
				System.out.println("Enter the size of matrix : ");
				Scanner sc = new Scanner(System.in);
				n= sc.nextInt();
				a=new int [n][n];
				
				System.out.println("Enter " +n*n+ " element for array matrix : ");
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
						if(a[i][j]==0)
						{
							count++;
						}
						
					}
					
				}
				if(count >=(i*j)/2)
				{
					System.out.println("Given matrix is Sparse matrix");
				}
				else
				{
					System.out.println("Given matrix is not Sparse matrix");
				}
		}

}
