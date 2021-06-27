package Loops;

import java.util.Scanner;

public class Prime_Sum {
				public static void main(String[] args) {
						
						int i,n,f=0,sum=0;
						
						System.out.println("Enter any number :");
						Scanner sc = new Scanner(System.in);
						n = sc.nextInt();
						
						System.out.println("Following are the prime no between 1 and " +n+ ".\n");
						for(i=1;i<=n;i++)
						{
							if(n%i==0) 
							{	
									for(int j=2;j<i;j++)
									{
										if(i%j==0)
										{
											f++;
										}
									}
									if(f==0)
									{
										System.out.println("This is prime no. " +i);
										sum=sum+i;
									}
							f=0;
							sc.close();
							}
						}
						System.out.println("Sum of prime no is: " +sum);
						
				}
}
