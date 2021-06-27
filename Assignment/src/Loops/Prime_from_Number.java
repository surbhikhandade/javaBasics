package Loops;
import java.util.Scanner;

public class Prime_from_Number {
		
					public static void main(String[] args) {
							
						int n,i,f=0;
						System.out.println("Enter any number :");
						Scanner sc = new Scanner(System.in);
						n = sc.nextInt();
						
						System.out.println("Following are the prime no between 1 and " +n+ ".\n");
						for(i=1;i<=n;i++)
						{
							if(n%i==0)
							{
								for(int j=2;j<i;j++)
								{
									if(i%j==0)
									{
										f++;
									}
								}
								if(f==0)
								{
									System.out.println("This is prime factor " +i);
								}
								f=0;
								sc.close();
							}	
						}
						
					}//main end

}//class end 
