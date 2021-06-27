package Array;

public class Addition2Array {
	
					public static void main(String[] args) {
							
							int a[][] = {{1,3,4},{3,4,5}};
							int b[][] = {{1,3,4},{3,4,5}};
							
							int c[][] = new int [2][3]; // creating another matrix to store the sum of two matrics
							
							int i,j = 0;
							for( i=0;i<2;i++)
							{
								for( j=0; j<3; j++)
								{
									c[i][j]= a[i][j] + b[i][j];
									 
									System.out.print(c[i][j]+ " ");
								}
								
								System.out.println();
							}
							
					}

}
