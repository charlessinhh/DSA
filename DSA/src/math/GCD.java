package math;

public class GCD {
	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 48;
		int b = 20;
//		System.out.println(gcd(a,b));
		System.out.println(1234 % 10);
		System.out.println(1234 / 10);

	}
	//// lcm * gcd = a*b /// trick

}
