package If_Else;

import java.util.Scanner;

public class Month_day {

				public static void main(String[] args) {
					
						int month ;
						
						System.out.println("Enter the month Number : ");
						Scanner sc = new Scanner (System.in);
						month = sc.nextInt();
						
						if(month == 1)
						{
							System.out.println("1st month is Janvary and it is 31 day's month");
						}
								else if(month == 2)
								{
									System.out.println("2nd month is February and it is 28 & 29 day's month");
								}
								else if(month == 3)
								{
									System.out.println("3rd month is March and it is 31 day's month");
								}
								else if(month == 4)
								{
									System.out.println("4th month is April and it is 30 day's month");
								}
								else if(month == 5)
								{
									System.out.println("5th month is May and it is 31 day's month");
								}
								else if(month == 6)
								{
									System.out.println("6th month is June and it is 30 day's month");
								}
								else if(month == 7)
								{
									System.out.println("7th month is July and it is 31 day's month");
								}
								else if(month == 8)
								{
									System.out.println("8th month is August and it is 31 day's month");
								}
								else if(month == 9)
								{
									System.out.println("9th month is September and it is 30 day's month");
								}
								else if(month == 10)
								{
									System.out.println("10th month is October and it is 31 day's month");
								}
								else if(month == 11)
								{
									System.out.println("11th month is November and it is 30 day's month");
								}
								else if(month == 12)
								{
									System.out.println("12th month is December and it is 31 day's month");
								}
								
						else
						{
							System.out.println("Invalid ! Please enter month number between (1-12)");
						}
						sc.close();
					
				}
	
}
