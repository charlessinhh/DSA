
public class sssssss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 3;
		int b = 5;
		int ans = rec(a, b);
		System.out.println(ans);

	}

	private static int rec(int a, int b) {
		// TODO Auto-generated method stub
		if (a == b)
			return 1;
		return 1 + +rec(Math.abs(a - b), Math.min(a, b));
	}

}
