package If_Else;

import java.util.Scanner;

public class Site_Triangle {
			
					public static void main(String[] args) {
							
							int s1,s2,s3;
							
							Scanner sc=new Scanner(System.in);
							System.out.println("Enter Three sides of Triangle :- ");
							s1 = sc.nextInt();
							s2 = sc.nextInt();
							s3 = sc.nextInt();
							
							if(s1+s2 > s3 && s2+s3 >s1 && s1+s3 >s2 )
							{
								System.out.println("Triangle sides are valid");
							}
							else
							{
								System.out.println("Triangle sides are Invalid");
							}
							sc.close();
					}
	

}
