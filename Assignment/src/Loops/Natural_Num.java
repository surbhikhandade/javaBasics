package Loops;

import java.util.Scanner;

public class Natural_Num {
			
				public static void main(String[] args) {
						
						int num;
						System.out.println("Enter any number : ");
						Scanner sc=new Scanner(System.in);
						num = sc.nextInt();
						System.out.println("Given natural number :");
						
						for(int i=1;i<=num;i++)
						{
							System.out.println(i);
						}
						sc.close();
				}

}
