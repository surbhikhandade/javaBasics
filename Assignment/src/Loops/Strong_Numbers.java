package Loops;

import java.util.Scanner;

public class Strong_Numbers {
		
					public static void main(String[] args) {
							
							int n,r,sum=0,fact,temp,original;
							
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							
							for(int i=1;i<=n;i++)
							{
								fact=1;
								temp=i;
								original=i;
								
									while(temp>0) 
									{
										r=temp%10;
										for(int j=1;j<=r;j++)
										{
											fact = fact*j;
										}
											sum=sum+fact;
											temp=temp/10;
										
									}
								if(sum==original)	
								{
									System.out.println("Strong number is..." +sum);
								}
								
							}
							sc.close();
							
					}

}
