package primeNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SegmentedSieve {
	// we use segment or piece of sieve ..
	// step 1,, generate all primes till sqrt(high) with simple sieve
	// step 2 ,, create a dummy array arr of size high - low+1 and fill it with 1 or
	// true.
	// step 3,, mark false or 0 if any multiples found in array arr of all primes
	// from step 1..
	// step 4.,, get the count or list of array with value as 1 or true in arr.

	static boolean[] createSieve(int n) {
		boolean sieve[] = new boolean[n + 1]; // take a boolean array fill true
		Arrays.fill(sieve, true);
		sieve[0] = sieve[1] = false;
		for (int i = 2; i * i <= n; i++) {
			if (sieve[i] == true) { // check arr[i] is prime or not
				// if prime mark multiple of 'i' as false
				for (int j = i * i; j <= n; j = j + i) {
					sieve[j] = false;
				}
			}
		}
		return sieve;
	}

	// step 1
	static ArrayList<Integer> generatePrime(boolean[] sieve, double d) {
		ArrayList<Integer> arr = new ArrayList<Integer>(); // to store prime number
		for (int i = 0; i <= d; i++) {
			if (sieve[i] == true) {
				arr.add(i);
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = 1000000; // 10^6..
		boolean[] sieve = createSieve(n); // create a simple sieve of size n ..
		System.out.println("print total prime no between L to R ");
		System.out.println("enter L (low) : min 2 ,, not less than 2  ");
		int l = s.nextInt();
		System.out.println("enter R(high) : ");
		int r = s.nextInt();

		// step 1; generate all primes till sqrt(l) from simple sieve .
		ArrayList<Integer> primes = generatePrime(sieve, Math.sqrt(r));
		System.out.println(primes);

		// step 2.. create dummy array and fill it with 1..
		int[] dummy = new int[r - l + 1];
		Arrays.fill(dummy, 1);

		System.out.println(Arrays.toString(dummy));

//		step 3..  fill all multiples with 0 if factors found of primes from step 1...
		for (int pr : primes) {
			int firstMultiple = (l / pr) * pr;
			if (firstMultiple < l) {
				firstMultiple += pr;
			}

			for (int k = Math.max(firstMultiple, pr * pr); k <= r; k += pr) {
				dummy[k - l] = 0; // fill it with 0 if factors found
			}
		}

		System.out.println(Arrays.toString(dummy));

		// step 4.. get all primes from dummy

		for (int i = l; i <= r; i++) {
			if (dummy[i - l] == 1) { // i-l will give array index in range
				System.out.println(i + " ");
			}
		}
		System.out.println();
	}

}
