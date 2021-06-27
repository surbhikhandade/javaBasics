package Loops;

import java.util.Scanner;

public class Reverse_Num {
	
					public static void main(String[] args) {
							
							int n,rev = 0;
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							
							//int temp=n;
							
							while(n !=0)
							{
								
								
								rev=(rev*10)+(n%10);
								
								n=n/10;
							
							}
							System.out.println(rev);
							sc.close();
					}

}
