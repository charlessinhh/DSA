package math;

public class FastPower {
	static int myPow(int x, long n) {
		int m = 1000009;
		int ans = 1;
		while(n > 0) 
		{
			if(n%2 == 1)
			{
				ans = (ans * x %m)%m;
			}
			x = (x*x)%m;
			n = n>>1;
			
		}
		return ans ;
	}
	
	
	public static void main(String[] args) {
		int  x = 2;
		long n = 16;
		System.out.println(myPow(x,n));

	}

}
