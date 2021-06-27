package If_Else;

import java.util.Scanner;

public class Gross_Salary {

					public static void main(String[] args) {
						
						double basic,gross,da,hra ;
						System.out.println("Enter basic salary of empoyee : ");
						Scanner sc = new Scanner (System.in);
						basic = sc.nextDouble();
						
						if(basic <= 10000)
						{
							da= basic *0.8;
							hra = basic *0.2;
						}
						else if(basic <= 20000)
						{
							da = basic * 0.9;
							hra = basic * 0.25;
						}
						else 
						{
							da = basic * 0.95;
							hra = basic * 0.3;
						}
						gross = basic + da + hra ;
						
						System.out.println("he got da with Rs : " +da);
						System.out.println("he got hda with Rs : " +hra);
						System.out.println("Salary of Employee with Rs : " +gross);
						
						sc.close();
					}
					
				
	
}
