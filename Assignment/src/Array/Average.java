package Array;

public class Average {
	
				public static void main(String[] args) {
						
						double a[]= {10.1,11.2,12.3,13.4,14.5};
						double avg = 0;
						double res = 0;
						
						for(int i=0;i<a.length;i++)
						{
							avg = avg + a[i];
							res = avg/5;
							
						}
						
						System.out.println("Average is " +res);
				}

}//class end
