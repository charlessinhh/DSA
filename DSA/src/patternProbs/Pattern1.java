package patternProbs;

import java.util.Scanner;

public class Pattern1 {
	/*1 2 3 4
	   1 2 3 4
	   1 2 3 4
 	   1 2 3 4
	 */
	/*
	 * 4 3 2 1
	 * 4 3 2 1
	 * 4 3 2 1
	 * 4 3 2 1
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); // take input to form pattern
		//p1
		int i = 1;
		while(i<=n) {
			int j =1;
			while(j<=n) {
				System.out.print( ""+j+" " );
				j=j+1;
			}
			System.out.println();
			i = i+1;
		}
		System.out.println();
		
		//p2
		int p = 1;
		while(p<=n) {
			int q =1;
			while(q<=n) {
				System.out.print( n-q+1+" ");
				q=q+1;
			}
			System.out.println();
			p = p+1;
		}

	}

}
