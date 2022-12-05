package array;

public class SumArrayRecursion {

	static int sum(int [] arr, int n) {
		int ans = 0;
		if (n == 0) {  // base case 
			return ans;
		}
		
		if (n == 1) {  // if n == 1,, return that single element as sum
			ans = arr[0];
			return ans;
		}
		else {
					// ans = ans+arr[n-1]..
			return ans + arr[n-1] + sum(arr,n-1);
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []  arr = {1,2,3,4,5,6};
		int n = arr.length;
		int ans = sum(arr,n);
		System.out.println(ans);
	}

}
