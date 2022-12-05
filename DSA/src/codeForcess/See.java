package codeForcess;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class See {

	public static String getPalindrome(String str) {

		// Store counts of characters
		HashMap<Character, Integer> counting = new HashMap<>();
		for (char ch : str.toCharArray()) {
			if (counting.containsKey(ch)) {
				counting.put(ch, counting.get(ch) + 1);
			} else {
				counting.put(ch, 1);
			}
		}

		/*
		 * Find the number of odd elements. Takes O(n)
		 */
		int oddCount = 0;
		char oddChar = 0;

		for (Entry<Character, Integer> itr : counting.entrySet()) {
			if (itr.getValue() % 2 != 0) {
				oddCount++;
				oddChar = itr.getKey();
			}
		}

		/*
		 * odd_cnt = 1 only if the length of str is odd
		 */
		if (oddCount > 1 || oddCount == 1 && str.length() % 2 == 0) {
			return "NO PALINDROME";
		}

		/* Generate first half of palindrome */
		String firstHalf = "", lastHalf = "";
		for (Entry<Character, Integer> itr : counting.entrySet()) {

			// Build a string of floor(count/2)
			// occurrences of current character
			String ss = "";
			for (int i = 0; i < itr.getValue() / 2; i++) {
				ss += itr.getKey();
			}

			// Attach the built string to end of
			// and begin of second half
			firstHalf = firstHalf + ss;
			lastHalf = ss + lastHalf;
		}

		// Insert odd character if there
		// is any
		return (oddCount == 1) ? (firstHalf + oddChar + lastHalf) : (firstHalf + lastHalf);
	}

	// Driver code
	public static void main(String[] args) {
//		System.out.println("enter no");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			String str = sc.nextLine();
			String str1 = str + str;
			System.out.println(getPalindrome(str1));
		}

	}

}
