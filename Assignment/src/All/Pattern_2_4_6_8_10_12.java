package All;

public class Pattern_2_4_6_8_10_12 {
			
				public static void main(String[] args) {
					int i,j,count=0;
					for(i=1;i<=3;i++)
					{
						for(j=1;j<=i;j++)
						{
							count=count+2;
							System.out.print(count + " ");
						}
						System.out.println();
					}
			}

}//class end
