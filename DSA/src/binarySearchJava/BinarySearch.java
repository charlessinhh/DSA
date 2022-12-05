package binarySearchJava;

public class BinarySearch {
	//search the target element with the help of Binary search having TC = logn.
	// we will use index as start 's' and end 'e'.
	public int bSearch(int arr[], int size, int target) {
		int s = 0;        // start index as 0 
		int e = size-1;    //end index as size of array -1
		int mid = s + (e-s)/2;
		
		while(s<=e) {
			if (arr[mid] == target) {    // if target == mid of array
				return mid;
			}
			if (target > arr[mid]) {  // target > mid ,, right array 
				s = mid+1;
			}
			else {
				e = mid-1; /// left array 
			}
			mid = s + (e-s)/2;
		}
		return -1;
	}
	
			
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2,3,4,5,6,7};
		int k = 6; //key to search in arr
		BinarySearch obj = new BinarySearch();
		int index = obj.bSearch(arr, 6, k);
		System.out.println("index of "+k+" is "+index);
	}
}
