package All;

public class Star_Pattern_1 {
				public static void main(String[] args) {
						
					int i,j,k;
					for(i=1;i<=3;i++)
					{
						for(j=5;j>i;j--)
						{
							//System.out.print(" ");
					
//							for(k=1;k<=i;k++)
//							{
//								System.out.print(" *");
//							}
						if(j>i)
						{
							System.out.print(" ");
					
						}
						else
						{
							System.out.print(" *");
						}
								
						}	
						System.out.println("");
					}
				}

}
