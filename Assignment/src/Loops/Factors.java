package Loops;

import java.util.Scanner;

public class Factors {
	
				public static void main(String[] args) {
						
						int n;
						System.out.println("Enter number to find its factor : ");
						Scanner sc=new Scanner(System.in);
						n	= sc.nextInt();
						System.out.println("Factors of given no " +n+ " is : ");
						
						for(int i=1; i<=n ;i++)
						{
							if(n%i==0)
							{
								System.out.println(i);
							}
						}
						
						sc.close();
				}

}
