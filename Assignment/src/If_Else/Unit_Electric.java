package If_Else;

import java.util.Scanner;

public class Unit_Electric {
					
					public static void main(String[] args) {
						
					
						double unit,surcharge,cary,total,total_amt;
						
						Scanner sc=new Scanner(System.in);
						System.out.println("Enter Electricity total unit  :- ");
						unit = sc.nextDouble();
						
						if(unit <=50)
						{
							total = unit * 0.50 ;
							surcharge = total *0.20;
							total_amt = surcharge + total;
								System.out.println("Total Bill with surcharge 20% discount for unit " +unit+ " is " +total_amt+ " Rs.");
						}
						
							else if(unit > 50 && unit <=100)
							{
								cary = unit - 50;
								total = (50 * 0.50) +(cary * 0.75) ;
								surcharge = total *20;
								total_amt = surcharge + total;
									System.out.println("Total Bill with surcharge 20% discount for unit " +unit+ " is " +total_amt+ " Rs.");
							}
							else if(unit >100 && unit <=250)
							{
								
								cary = unit - 100;
								total = (100 * 0.75)+(50 * 0.50)+(cary * 1.20);
								surcharge = total *20;
								total_amt = surcharge + total;
									System.out.println("Total Bill with surcharge 20% discount for unit " +unit+ " is " +total_amt+ " Rs.");
	
							}
					 else 
					 {
						 cary = unit - 250 ;
						 total = (50*0.50)+(100 * 0.75)+(250*1.20)+(cary * 1.50);
						 surcharge = total *20;
						 total_amt = surcharge + total;
						 	System.out.println("Total Bill with surcharge 20% discount for unit " +unit+ " is " +total_amt+ " Rs.");
						
					 }
						sc.close();
						
			}
						

}
