public class t3 {

	public static void main(String[] args) {
		int n = 44;
		System.out.println(climbStairs(n));
		System.out.println(dp(n));
	}

	private static int climbStairs(int n) {
		// TODO Auto-generated method stub
		if (n == 0)
			return 0;
		if (n == 2)
			return 2;
		if (n == 1)
			return 1;
		else {
			return climbStairs(n - 1) + climbStairs(n - 2);
		}
	}

	public static int dp(int n) {
		int[] fibArray = new int[n + 1];
		fibArray[0] = 0;
		fibArray[1] = 1;

		for (int i = 2; i <= n; i++) {
			fibArray[i] = fibArray[i - 1] + fibArray[i - 2];
		}
//		System.out.println(Arrays.toString(fibArray));
		return fibArray[n] + fibArray[n - 1];
	}

}
