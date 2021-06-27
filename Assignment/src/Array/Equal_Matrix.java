package Array;

import java.util.Scanner;

public class Equal_Matrix {
				public static void main(String[] args) {
						
						int a[][],b[][],i,j,n;
						System.out.println("Enter the size of matrix : ");
						Scanner sc = new Scanner (System.in);
						n = sc.nextInt();
						a = new int[n][n];
						b = new int [n][n];
						
						System.out.println("Enter " +n*n+ " for 1st matrix : " );
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								a[i][j]=sc.nextInt();
							}
						}
						
						System.out.println("Enter " +n*n+ " for 2nd matrix : ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								b[i][j] = sc.nextInt();
							}
						}
						
						System.out.println("1st matrix ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.println(a[i][j]);
							}
							System.out.println();
						}
						
						System.out.println("2nd matrix ");
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								System.out.println(b[i][j]);
							}
							System.out.println();
						}
						
						int c=0;
						for(i=0;i<n;i++)
						{
							for(j=0;j<n;j++)
							{
								if(a[i][j]!=b[i][j])
								{
									c=c+1;
								}
							}
						}
						if(c==0)
						{
							System.out.println("Given Matrix are equal");
						}
						else
						{
							System.out.println("Given matrix are different");
						}
						sc.close();
				}

}
