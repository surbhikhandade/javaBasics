package If_Else;

import java.util.Scanner;

public class EquiIsoSclTriangle {
	
					public static void main(String[] args) {
						
							int s1,s2,s3;
							System.out.println("Enter 3 sides of triangle : ");
							Scanner sc = new Scanner (System.in);
							s1 = sc.nextInt();
							s2=sc.nextInt();
							s3=sc.nextInt();
							
							if(s1==s2 && s1==s3 && s2==s1 && s2==s3 && s3==s1 && s3==s1)
							{
								System.out.println("Given side makes Equilatral Triangle");
							}
							else if(s1==s2 || s1==s3 || s2==s1 || s2==s3 || s3==s1 || s3==s2)
							{
								System.out.println("Given side makes Isolate Triangle");
							}
							else
							{
								System.out.println("Given side makes Scalane Triangle");
							}
							sc.close();
					}

}
