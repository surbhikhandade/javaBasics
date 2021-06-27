package If_Else;

import java.util.Scanner;

public class Max_num {
	
					public static void main(String[] args) {
						
							int a, b ;
							
							System.out.println("Enter the two number : ");
    						Scanner sc = new Scanner (System.in);
    						
    						a = sc.nextInt();
    						b = sc.nextInt();
    						
    						if(a==b)
    						{
    							System.out.println("Number are are equal " +a+ " = " +b);
    						}
    						else if(a>b)
    						{
    							System.out.println("Greater number is " +a);
    						}
    						else
    						{
    							System.out.println("Greater number is " +b);
    						}
    						sc.close();
					}

}
