package binarySearchJava;

public class SquareRootBinarySearch {
	public static int sqrt(int x) {
		int ans = -1;

		int s = 0;
		int e = x - 1; // x is number whose square root is to be found.
		int mid = s + (e - s) / 2;

		while (s <= e) {
			long square = (long) mid * (long) mid;

			if (square == x) {
				return mid;
			}
			if (square > x) { // square greater than x means search in left part
				e = mid - 1;
			} else {
				ans = mid;
				s = mid + 1;
			}
			mid = s + (e - s) / 2;
		}
		return ans;
	}

	public static void main(String args[]) {
		int x = 9;
		System.out.println(sqrt(x));
	}

}
