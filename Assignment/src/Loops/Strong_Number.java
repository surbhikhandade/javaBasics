package Loops;

import java.util.Scanner;

public class Strong_Number {
				
					public static void main(String[] args) {
						
							int n,r,sum=0;
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							int temp = n;
							while(n>0)
							{
								r=n%10;
								int fact =1;
								for(int i=1;i<=r;i++)
								{
									fact= fact*i;
								}
									sum= sum+fact;
									n=n/10;	
							}
							if(sum==temp)
							{
								System.out.println("Given no. is strong number.");
							}
							else
							{
								System.out.println("Given no. is not strong number.");
							}
							sc.close();
					}	

}
