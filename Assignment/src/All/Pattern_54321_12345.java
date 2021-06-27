package All;

public class Pattern_54321_12345 {
	public static void main(String[] args) {

		int p = 5, q = 5;
		for (int i = 1; i <= 5; i++, p--, q++) {
			int k = 5, r=i;
			for (int j = 1; j <= 9; j++) {
				if ((j >= 1 && j <= p) || (j >= q && j <= 9)) // j>=5 j<=5
				{
					if (j <= 5) {
						System.out.print(k);
						k--;
					} else if (j >= 5){

						System.out.print(r);
						r++;
					}
				} 
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
