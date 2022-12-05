package dynammicProgramming;

import java.util.ArrayList;
import java.util.Arrays;

//given N and M find the minimum number of primes required to make N using first M primes to do so..[N<=10^3][M<=10^4]
//input N = 10 , M = 1
//ouput = 5
//explanation : minimum we require 5 primes[2+2+2+2+2]
//input N = 11, M = 3
//ouput = 3
//exp: we require 3 primes[5+3+3]
// we will find ArrList of primes of from start upto M
// then find the sol

public class MinPrimes {

	public static int MinNoOfPrimesToMakeN(int N, int M) {

		ArrayList<Integer> ArrPrime = getFirstMprimesArrFromSeive(N, M);
		System.out.println(ArrPrime);
		// no find min of primes from ArrPrime needed to get N
		// similar to coin change or unbounded knapsack where coin[] and sum given ,
		// here also ArrPrime[] and N given

		int dp[][] = new int[ArrPrime.size() + 1][N + 1];
		for (int j = 0; j < N + 1; j++) {
			dp[0][j] = Integer.MAX_VALUE - 1;
		}
		for (int i = 0; i < ArrPrime.size() + 1; i++) {
			dp[i][0] = 0;
		}

		for (int i = 1; i <= ArrPrime.size(); i++) {
			for (int j = 1; j <= N; j++) {
				if (ArrPrime.get(i - 1) <= j) {
					dp[i][j] = Math.min(1 + dp[i][j - ArrPrime.get(i - 1)], dp[i - 1][j]);

				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}
		if (dp[ArrPrime.size()][N] == Integer.MAX_VALUE - 1)
			return -1;
		else
			return dp[ArrPrime.size()][N];

	}

	private static ArrayList<Integer> getFirstMprimesArrFromSeive(int n, int m) {
		boolean primeArr[] = new boolean[n + 1];
		Arrays.fill(primeArr, true);
		primeArr[0] = primeArr[1] = false;
		// find primes and mark multiples as false
		for (int i = 2; i <= n; i++) {
			if (primeArr[i] == true) {
				for (int j = i * i; j <= n; j = j + i) {
					primeArr[j] = false;
				}
			}
		}
		ArrayList<Integer> ArrList = new ArrayList<>();
		int primeCountInArrList = 0;
		for (int k = 2; k < primeArr.length; k++) {
			if (primeArr[k] == true) {
				primeCountInArrList += 1;
				ArrList.add(k);
			}
			if (primeCountInArrList >= m)
				break;
		}
		return ArrList;

	}

	public static void main(String[] solve) {
		int N = 11, M = 3;
		int ans = MinNoOfPrimesToMakeN(N, M);
		System.out.println(ans);
	}

}
