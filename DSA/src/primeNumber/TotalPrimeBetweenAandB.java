package primeNumber;

import java.util.Scanner;

public class TotalPrimeBetweenAandB {

	static boolean isPrime(int i) {
		if (i <= 1) {
			return false;
		}
		for (int p = 2; p <= Math.sqrt(i); p++) {
			if (i % p == 0) { // if n is divisible by i means i is factor of n so not prime..
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("left range of prime number : ");
		int l = s.nextInt();
		System.out.println("right range of prime number : ");
		int r = s.nextInt();
		int ans = 0;
		long startTime = System.currentTimeMillis();
		for (int i = l; i <= r; i++) {
			if (isPrime(i)) {
				ans += 1;
//				System.out.print(i + " ");
			}
		}
		System.out.println(ans);
		System.out.println();
		long endTime = System.currentTimeMillis();
		long time = endTime - startTime;
		System.out.println("total time :" + time + "ms");
	}

}
