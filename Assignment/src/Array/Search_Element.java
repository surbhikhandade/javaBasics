package Array;

import java.util.Scanner;

public class Search_Element {
			public static void main(String[] args) {
					int a[],i,n,num;
					System.out.println("Enter size of matrix : ");
					Scanner sc = new Scanner(System.in);
					n=sc.nextInt();
					a=new int[n];
					
					System.out.println("Enter " +n+ " element of array matrix ");
					for(i=0;i<n;i++)
					{
							a[i]=sc.nextInt();
						
					}
					System.out.println("Enter the number which u want to search ");
					num = sc.nextInt();
					
					for(i=0;i<n;i++)
					{
						if(a[i]==num)
						{
							System.out.println("Given " +num+ " found in index " +i);
						}
					}
					
			}

}
 class SearchElement 
{
	public static void main(String[] args) 
	{
		int a[],n,i,num;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array : ");
		n=sc.nextInt();
		a=new int[n];
		
		System.out.println("Enter "+n+" elements into the array : ");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter the number which you want to search..");
		num=sc.nextInt();
		
		for(i=0;i<n;i++)
		{
			if(a[i]==num)
			{
				System.out.println("Given Number "+num+" found on the index "+i);
			}
		}
		
	}
}
