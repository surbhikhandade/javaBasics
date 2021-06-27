package All;

public class Star_Pattern_3 {
			
				public static void main(String[] args) {
					int i,j;
					
					for(i=1;i<=6;i++)
					{
						for(j=1;j<=i;j++)
						{
							//if((i==1 && j==1)   || (i==2 && j==3)|| (i==3 && j==3) )
							if(i==1||i==4 )
							{
								System.out.print("@");
							}
							
							else if(i==2||i==5 )
							{
								System.out.print("*");
							}
							else 
							{
								System.out.print("#");
							}
						}
						System.out.println();
					}	
						
			}

}
