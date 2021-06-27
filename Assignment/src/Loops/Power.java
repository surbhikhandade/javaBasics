package Loops;

import java.util.Scanner;

public class Power {
				
				public static void main(String[] args) {
					
						int base,exponent;
						long power = 1;
						
						System.out.println("Enter base : ");
						Scanner sc = new Scanner (System.in);
						base = sc.nextInt();
						
						System.out.println("Enter Exponent : ");
						Scanner sc1 = new Scanner (System.in);
						exponent = sc.nextInt();
						
						for(int i=1;i<=exponent;i++)
						{
							power = power * base;
							System.out.println(power);
						}
						
						sc.close();
						sc1.close();
						
						
				}

}
