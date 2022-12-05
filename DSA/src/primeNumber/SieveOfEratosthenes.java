package primeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SieveOfEratosthenes {
	/// time complexity N*(log(logN))
	// n*(1/2+ 1/3 + 1/5 + .....) harmonic progression of prime numbers
	// (1/2+ 1/3 + 1/5 + .....) gives log(logN) by tailors theorem...
	// so TC is N*(log(logN))

	static void simpleSieve(int n) {
		boolean primeArr[] = new boolean[n + 1]; // take a boolean array fill true
		Arrays.fill(primeArr, true);
		primeArr[0] = primeArr[1] = false; // first index and second index fill false edge case

		for (int i = 2; i * i <= n; i++) {
			if (primeArr[i] == true) { // check arr[i] is prime or not
				// if prime mark multiple of 'i' as false
				for (int j = i * i; j <= n; j = j + i) {
					primeArr[j] = false;
				}
			}
		}

		ArrayList<Integer> arr = new ArrayList<Integer>(); // to store prime number
		int totalPrime = 0;
		for (int i = 2; i < n; i++) {
			if (primeArr[i] == true) {
				arr.add(i);
				totalPrime++;
//				System.out.println(i);
			}
		}
		System.out.println(arr);
		System.out.println("primeArr " + Arrays.toString(primeArr));
		System.out.println("totalPrime " + totalPrime);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print total prime no between 0 to N,, enter n: ");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		simpleSieve(n);
	}
}
