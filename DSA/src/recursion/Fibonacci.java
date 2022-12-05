package recursion;

// print nth fibonacci number...
public class Fibonacci {
	
	private static int findfib(int n) {
		if(n <= 0) return 0;
		if(n == 1) return 0; // first fib no
		if(n == 2) return 1; // second fib no
		else {
			return findfib(n-1) + findfib(n-2);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7; // 7th fib no,, [0,1,1,2,3,5,8...]
		int ans = findfib(n);
		System.out.println(n+"th fibonacci number is "+ans);
	}

}
