package patternProbs;

import java.util.Scanner;

public class P4 {
/*1
 * 2 2
 * 3 3 3
 * 4 4 4 4
 * 
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int row = 1;
		while(row<=n) {
			int col = 1;
			while(col<=row) {
				System.out.print(row+" ");
				col +=1;
			}
			System.out.println();
			row +=1;
		}
	}

}
