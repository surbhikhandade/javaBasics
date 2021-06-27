package Array;
import java.util.Scanner;
public class Delete {
	
				public static void main(String[] args) {
						
						System.out.println("Enter the Size of an array : ");
						Scanner sc = new Scanner(System.in);
						int size = sc.nextInt();
						
						int a[] = new int [size];
						
							System.out.println("Enter the " +size+ " element of array :");
						for(int i=0; i<size; i++)
						{
							a[i] = sc.nextInt();
						}
						
							System.out.println("Which position do u want to delete ?");
						int pos = sc.nextInt();
						
						if(pos==size+1  || pos<0)
						{
							System.out.println("Invalid position! please enter position between 1 to "+size);
						}
						else
						{
							for(int i=pos-1; i<size-1; i++)
							{
								a[i] = a[i+1];
							}
							size--;
						}
							System.out.println("Element  of array after delete....");
								for (int i=0;i<size;i++)
								{
									System.out.println(a[i]+" ");
								}
			
				}
				

}//class end
