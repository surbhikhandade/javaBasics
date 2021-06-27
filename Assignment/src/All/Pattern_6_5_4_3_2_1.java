package All;

public class Pattern_6_5_4_3_2_1 {
				public static void main(String[] args) {
					
					int i,j,count=6;
					for(i=1;i<=3;i++)
					{
						for(j=1;j<=i;j++)
						{
							System.out.print(count-- +" ");
						}
						System.out.println();
					}
			}

}
