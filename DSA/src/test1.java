import java.util.Arrays;

public class test1 {
	
	
	private static int solve(int n) {
		if(n <= 0) return 0;
		return n + solve(n-1);
	}
	
	private static int solve2(int n ) {
		int sum = 0;
		for(int i = 1; i<= n; i++) {
			sum += i;
		}
		return sum;
	}
	
	public static void main(String c[]) {
		int n = 1000000000;
		
		System.out.println(solve2(n));	
		System.out.println(solve(n));	
		
		
	}
}
