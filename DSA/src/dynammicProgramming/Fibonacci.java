package dynammicProgramming;

import java.util.Arrays;

// print array of fibonacci numbers upto n..
// we can print nth fib no also by fib[n]..

public class Fibonacci {

	private static void findFibArray(int n) {
		int[] fibArray = new int[n + 2];
		fibArray[0] = 0;
		fibArray[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
		System.out.println(Arrays.toString(fibArray));
		System.out.println(fibArray[n] + fibArray[n - 1]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 44;
		findFibArray(n);

	}

}
