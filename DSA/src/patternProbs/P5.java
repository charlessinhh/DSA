package patternProbs;

import java.util.Scanner;

public class P5 {
	/*1 
2 3 
4 5 6 
7 8 9 10 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		int i = 1;
		int count = 1;
		while(i<=n) {
			int j = 1;
			while(j<=i) {
				System.out.print(count+" ");
				count +=1;
				j = j+1;
			}
			System.out.println();
			i = i+1;
		}
		
		
	}

}
