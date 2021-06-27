package All;

public class Pattern_12345678 {
	public static void main(String[] args) {
		int i,j,count=1;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				System.out.print(count++ + " ");
			}
			System.out.println();
		}
}

}

class  Pattern_1234{
	
	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=i;j++)
			{
				
				if(i%2==0)
				{
					System.out.print("#");
				}
				else
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
}
		
}
