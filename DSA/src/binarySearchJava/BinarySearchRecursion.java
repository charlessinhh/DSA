package binarySearchJava;

public class BinarySearchRecursion {
	
	static int bSearchRec(int[] arr, int s ,int e, int k  ) {

		if(s>e) {  // not found
			return -1;
		}
		int mid = s + (e-s)/2;
		if (arr[mid] == k) {
//			System.out.println(mid);  // index where elemnt found
			return mid;
		}
		
		// left part
		if(arr[mid] > k) {
			return bSearchRec( arr, s , mid-1, k);
		}
		else {  // right part
			return bSearchRec(arr, mid+1, e , k);
		}
	
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6,7,8,9};
		int n = arr.length;
		int k = 6; //key to search in arr
		int s = 0;
		int e = n-1;
		int ans = bSearchRec( arr, s ,e, k); // index of key
		System.out.println(ans); 
		
	}

}
