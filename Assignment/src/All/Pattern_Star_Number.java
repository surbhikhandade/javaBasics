package All;

public class Pattern_Star_Number {
		public static void main(String[] args) {
			
						for(int i=1;i<=3;i++)
						{
							for(int j=1;j<=9;j++)
							{
								if(j<=3)
								{
									System.out.print(j);
								}
								else if(j >=3 && j<7)
								{
									System.out.print("*");
								}
								else if(i==2 && j==8)
								{
									System.out.print("2");
								}
								else
								{
									System.out.print("1");
								}
							}
						     System.out.println();
						}
		}

}
