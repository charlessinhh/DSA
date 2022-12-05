package patternProbs;

import java.util.Scanner;

public class P3 {
/*
 *    *
 *    * *
 *    * * *
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int row= 1;
		while(row<=n) {
			int col = 1;
			while(col<=row) {
				System.out.print("x"+" ");
				col +=1;
			}
			System.out.println();
			row = row+1;
		}
	}

}
