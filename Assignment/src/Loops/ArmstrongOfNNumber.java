package Loops;

import java.util.Scanner;

public class ArmstrongOfNNumber {
	
					public static void main(String[] args) {
							
							int n,r,i,sum=0,temp=0;
							
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner(System.in);
							n	= sc.nextInt();
							
							for(i=1;i<=n;i++)
							{
								sum = 0;
								temp = i;
								int original = i;
								
									while(temp != 0)
									{
										r = temp%10 ;
										sum = sum+(r*r*r);
										temp = temp/10;
										
											if(sum==original)
											{
												System.out.println("Number is armstrong " +original+ " = " +sum);
											}
									}
									sc.close();
							}
							
							
					}

}
