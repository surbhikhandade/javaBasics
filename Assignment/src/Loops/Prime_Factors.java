package Loops;

import java.util.Scanner;

class Prime_Factor{
			
				public static void main(String[] args) {
					
					int n,i;
					System.out.println("Enter any number :");
					Scanner sc = new Scanner(System.in);
					n = sc.nextInt();
					
					System.out.println("prime Factor of Given no is " +n);
					for(i=2;i<=n;i++)
					{
						if(n%i==0)
						{
							System.out.println(i);
							n=n/i;
							
						}
						
					}
					if(n>2)
					{
						System.out.println(n);
					}
					sc.close();
					
				}
				
}
