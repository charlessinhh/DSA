package primeNumber;

import java.util.Scanner;

public class FindNoisPrimeOrNot {
	
	static boolean isPrime(int n ) {
		if (n<=1) {  // edge case 
			return false;
		}
		for (int i = 2 ; i<=Math.sqrt(n); i++) {
			if (n%i == 0) {  // if n is divisible by i means i is factor of n so not prime..
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("print N to find is prime or not");
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		
		if (isPrime(n)) {
			System.out.println("'"+n+"'" +" is a prime number");
		}
		else {
			System.out.println(n +" is not a prime number");
		}
	}

}
