package If_Else;

import java.util.Scanner;

public class Week {
		 
			public static void main(String[] args) {
					
					int week;
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter Week Day :- ");
					
					week = sc.nextInt();
					
					if(week == 1)
					{
						System.out.println("Monday");
					}
						else if(week == 3)
						{
							System.out.println("Tuesday");
						}
						else if(week == 4)
						{
							System.out.println("Wednsday");
						}
						else if(week == 5)
						{
							System.out.println("Thursday");
						}
						else if(week == 6)
						{
							System.out.println("Friday");
						}
						else if(week == 7)
						{
							System.out.println("Saturday");
						}
						else if(week == 8)
						{
							System.out.println("Sunday");
						}
					else 
					{
						System.out.println("Invalid ! please enter week number between (1-7) ");
					}
					sc.close();
			}
				

}
