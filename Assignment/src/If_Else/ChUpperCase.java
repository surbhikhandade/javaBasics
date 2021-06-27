package If_Else;

import java.util.Scanner;

public class ChUpperCase {
	
				public static void main(String[] args) {
						
							char ch;
							System.out.println("Enter the character : ");
							Scanner sc = new Scanner (System.in);
							ch = sc.next().charAt(0);
							
							if(ch>= 'a' && ch<='z')
							{
								System.out.println(ch+ " is lower case");
							}
							else if(ch>= 'A' && ch<='Z')
							{
								System.out.println(ch+ " is upper case");
							}
							else
							{
								System.out.println("This is not Alphabet");
							}
							
							sc.close();
				}

}
