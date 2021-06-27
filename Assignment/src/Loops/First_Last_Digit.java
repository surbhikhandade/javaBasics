package Loops;

import java.util.Scanner;

public class First_Last_Digit {
		
				public static void main(String[] args) {
						
							int n ;
							
							System.out.println("Enter any number : ");
							Scanner sc=new Scanner(System.in);
							n	= sc.nextInt();
							int k = n;
							
							while(n>=10)
							{
								n= n/10;
							}
							System.out.println("First Digit is " +n);
							
								k= k%10 ;
							System.out.println("Last Digit is " +k);
							
							sc.close();
					}

}
