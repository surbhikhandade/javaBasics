package If_Else;

import java.util.Scanner;

public class Profite_Loss {
				
					public static void main(String[] args) {
							
							int sprice,cprice,sum;
							
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter Selling Price :- ");
							sprice = sc.nextInt();
							
							Scanner sc1=new Scanner(System.in);
							System.out.println("Enter Cost Price :- ");
							cprice = sc1.nextInt();
							
							if(sprice > cprice)
							{
								sum = sprice - cprice ;
								System.out.println("Profit is " +sum);
							}
							else if (cprice > sprice )
							{
								sum = cprice - sprice ;
								System.out.println("Loss is " +sum);
							}
							else
							{
								System.out.println("No profit and No Loss");
							}
							sc.close();
							sc1.close();
					}

}
