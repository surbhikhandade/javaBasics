package Loops;

import java.util.Scanner;

public class Sum_First_last_No {
				
					public static void main(String[] args) {
							
							int n,k,sum=0;
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							
							k=n;
							
							
							while(n>=10)
							{
								n= n/10;
								k=k%10;
							}
							System.out.println("First Digit is : " +n);
							System.out.println("Last Digit is : " +k);
							
							sum = n + k;
							System.out.println("Sum of First and Last digit : " +sum);
							
							sc.close();
					}

}
