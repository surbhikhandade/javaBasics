package All;

import java.util.Scanner;

public class Leap_Year {
				public static void main(String[] args) {
			 	   
			   		int year ;
			   		
			   		System.out.println("Enter the year : ");
					Scanner sc = new Scanner (System.in);
					
					year = sc.nextInt();
					if(year % 4==0)
					{
						System.out.println("Given year " +year+ " is Leap year");
					}
					else 
					{
						System.out.println("Given year " +year+ " is not Leap year");
					}
					sc.close();
			}
	

}
