package codeForcess;

import java.util.Scanner;

public class Wrong_Subtraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int k = s.nextInt();
		for (int i = 0; i < k; i++) {
			if (n % 10 == 0) {
				n /= 10;
			} else {
				n--;
			}
		}
		System.out.println(n);

	}

}
