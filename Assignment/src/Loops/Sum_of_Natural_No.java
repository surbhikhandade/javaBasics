package Loops;

import java.util.Scanner;

public class Sum_of_Natural_No {
	
					public static void main(String[] args) {
							
							int n,sum=0;
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							
							for(int i=1;i<=n;i++)
							{
								sum=sum+i;
							}
							System.out.println("Sum of natural no is :" +sum);
							sc.close();
					}

}//class end
