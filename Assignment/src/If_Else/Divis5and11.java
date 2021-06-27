package If_Else;

import java.util.Scanner;

public class Divis5and11 {

				public static void main(String[] args) {
					
						int no;
						System.out.println("Enter the Number : ");
						Scanner sc = new Scanner (System.in);
						no = sc.nextInt();
						
						if(no % 5==0)
						{
							System.out.println("Number is divisible by 5" +no);
						}
						else if(no% 11==0)
						{
							System.out.println("Number is divisible by 11" +no);
						}
						else
						{
							System.out.println( no+ " is not divisible by 5 and 11");
						}
						
						sc.close();
						
				}
				
				
	
	
}
