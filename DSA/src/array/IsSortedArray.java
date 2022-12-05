package array;

public class IsSortedArray {
	// array given is sorted or not..
	// using recursion    tc = O(n),, space = O(n) beacuse of recursion call stack memory
	// base case ,, length of array is zero or one,, array will be sorted
	static boolean isSortedRec(int  []arr, int n) {
		// base case
		if(n == 0 || n == 1) {
			return true;
		}
		if(arr[n-1]<arr[n-2]) {  // n-1th index bigger than n-2th index,, so false ,,not sorted
			return false;
		}
		else {
			return isSortedRec(arr , n - 1);
		}
	}
	
	// using for loop 
	static boolean isSortedLoop(int arr[], int n ) {
		if(n == 1 || n == 0) {
			return true;
		}
		for(int i = 1 ; i <n;i++) {
			if (arr[i]<arr[i-1]) {  //unsorted array
				return false;
			}
		}
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {1,2,3,3,5};
		int n = 5; /// length of array 
		if (isSortedRec(arr,n) ){
			System.out.println("array is sorted ");
		}
		else {
			System.out.println("array is not sorted ");
		}
		
		if (isSortedLoop(arr,n) ){
			System.out.println("array is sorted ");
		}
		else {
			System.out.println("array is not sorted ");
		
	}
	}
}
