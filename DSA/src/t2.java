import java.util.ArrayList;
import java.util.List;

public class t2 {
	
	

	// Driver program
	public static void main(String arg[])
	{
		int arr[] = { 88, 89, 101 };
		int n = arr.length;
		int ans = solve(arr,n);
		System.out.println(ans);
	}

	private static int solve(int[] arr, int n) {
		// TODO Auto-generated method stub
		int c = 0;
		int d = 0;
		for(int i = 0; i <n;i++) {
			for(int j = i+1;j<n;j++) {
				if(Math.abs(arr[i] - arr[j]) < 10) {
					d += 1;
					System.out.println(d);
				}
				if(d == n) c += 1;
			}
		}
		return c;
	}

}
