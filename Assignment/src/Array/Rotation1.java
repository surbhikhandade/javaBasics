package Array;
import java.util.Scanner;

public class Rotation1 {
	


	
		public static void main(String[] args) 
		{
			int a[],n,i;
			System.out.println("Enter the size of an array : ");
			Scanner sc=new Scanner(System.in);
			n=sc.nextInt();
			a=new int[n];
		
			System.out.println("Enter "+n+" elements : ");
			for(i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
			}
			
			System.out.println("Enter rotate number : ");
			int rotate=sc.nextInt();
			
			System.out.println("\nGiven array is : ");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}
			
			int first,j;
			for(i=0;i<rotate;i++)
			{
				first=a[0];
				for(j=0;j<n-1;j++)
				{
					a[j]=a[j+1];
				}
				a[n-1]=first;
			}
			
			System.out.println("\nAfter Rotation : ");
			for(i=0;i<n;i++)
			{
				System.out.print(a[i]+" ");
			}

		}
	

}
