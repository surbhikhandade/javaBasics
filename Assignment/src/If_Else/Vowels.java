package If_Else;

import java.util.Scanner;

public class Vowels {
	
				public static void main(String[] args) {
						
							char ch ;
							
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter any Alphabets :- ");
							
							ch = sc.next().charAt(0);
							
							if(ch == 'a' || ch== 'e' || ch== 'i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
							{
								System.out.println(ch+ " is Vowel");
							}
							else if((ch >= 'a' && ch<= 'z') || (ch >= 'A' && ch<= 'Z'))
							{
								System.out.println(ch+ " is Consonants ");
							}
							else
							{
								System.out.println("This is not Alphabet");
							}
							sc.close();
				}

}
