package Loops;

import java.util.Scanner;

public class Frequency_of_Number {
		
					public static void main(String[] args) {
							
							int n,r,num;
							int rz=0,rt=0,ro=0,rth=0,rf=0,rfi=0,rse=0,re=0,rn=0,rs=0,rte=0;
							
							System.out.println("Enter any number : ");
							Scanner sc = new Scanner (System.in);
							n = sc.nextInt();
							num=n;
							
							while(n!=0)
							{
								r=n%10;
								
								
								if(rz==0)
								{
									rz++;
								}
								  else if(rt==1)
								  {
									  rt++;
								  }
								  else if(ro==2)
								  {
									  ro++;
								  }
								  else if(rth==3)
								  {
									  rth++;
								  }
								  else if(rf==4)
								  {
									  rf++;
								  }
								  else if(rfi==5)
								  {
									  rfi++;
								  }
								  else if(rse==6)
								  {
									  rse++;
								  }
								  else if(re==7)
								  {
									  re++;
								  }
								  else if(rn==8)
								  {
									  rn++;
								  }
								  else if(rs==9)
								  {
									  rs++;
								  }
							  else   
							  {
								rte++;
							  }
								n=n/10;
								
								
								sc.close();
								
									
						}
							
							System.out.println("Frequency of given no : " +num);
							System.out.println("Frequency of 0  : " +rz);
							System.out.println("Frequency of 1  : " +ro);
							System.out.println("Frequency of 2  : " +rth);
							System.out.println("Frequency of 3  : " +rf);
							System.out.println("Frequency of 4  : " +rfi);
							System.out.println("Frequency of 5  : " +rse);
							System.out.println("Frequency of 6  : " +re);
							System.out.println("Frequency of 7  : " +rn);
							System.out.println("Frequency of 8  : " +rs);
							System.out.println("Frequency of 9  : " +rte);
							
							
							
					}//main end

}//class end
