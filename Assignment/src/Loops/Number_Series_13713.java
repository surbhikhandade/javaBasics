package Loops;

public class Number_Series_13713 {

						public static void main(String[] args) {
								
							int oldres=1,newres=0;
							
							for(int i=0;i<=5;i++)
							{
								newres = oldres + (2*i);
								System.out.print(newres+ " ");
								oldres = newres;
								
							}
							
						}
}//class end
