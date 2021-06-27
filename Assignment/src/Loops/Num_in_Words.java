package Loops;

import java.util.Scanner;

public class Num_in_Words {
					
					public static void main(String[] args) {
							
								int n,num,rev=0,r;
								System.out.println("Enter any number : ");
								Scanner sc = new Scanner (System.in);
								n = sc.nextInt();
								num=n;
								
								System.out.println("Given no is : " +num);
								
								while(n!=0)
								{
									rev=(rev*10)+(n%10);
									n=n/10;
								}
									while(rev!=0)
									{
										r=rev%10;
										rev= rev/10;
										
											if(r==0)
											{
												System.out.println("Zero");
											}
											else if(r==1)
											{
												System.out.println("one");
											}
											else if(r==2)
											{
												System.out.println("two");
											}
											else if(r==3)
											{
												System.out.println("three");
											}
											else if(r==4)
											{
												System.out.println("four");
											}
											else if(r==5)
											{
												System.out.println("five");
											}
											else if(r==6)
											{
												System.out.println("six");
											}
											else if(r==7)
											{
												System.out.println("seven");
											}
											else if(r==8)
											{
												System.out.println("eight");
											}
											else if(r==9)
											{
												System.out.println("nine");
											}
											
									}
									sc.close();
					}

}//class end
