package binarySearchJava;

import java.util.Arrays;

//find first index and last  index of x(target).. 
//     Input: nums = [5,7,7,8,8,10], target = 8
//     Output: [3,4]  
//we will use binary search to find left and right index.
public class FirstAndLastOccurenceofX {
	
	static int leftIndexBinarySearch(int[] arr, int k) {
		//we will use binary search properties  like s, e, mid
		int s = 0;
		int e = arr.length - 1;
		int mid = s  + (e-s)/2;
		
		int ans = -1;
		while(s<=e) {
			if (k<arr[mid]) {
				e = mid-1;
			}
			else if (k>arr[mid]) {
				s = mid+1;
			}
			else if  ( k == arr[mid]){
				ans= mid;
				e = mid-1;
			}
			mid = s  + (e-s)/2;
		}
		return ans;
	}
	
	static int rightIndexBinarySearch(int[] arr, int k) {
		//we will use binary search properties  like s, e, mid
		int s = 0;
		int e = arr.length - 1;
		int mid = s  + (e-s)/2;
		
		int ans = -1;
		while(s<=e) {
			if (k<arr[mid]) {
				e = mid-1;
			}
			else if (k>arr[mid]) {
				s = mid+1;
			}
			else if  ( k == arr[mid]){
				ans= mid;
				s = mid+1;
			}
		mid = s  + (e-s)/2;
	}
		return ans;
	}
	
	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 8;
		int[] arr = {-1,-1};  //default output
        arr[0] = leftIndexBinarySearch(nums,target); // if left occ is there then left = right or new right occurence will be there
        if(arr[0] != -1){   // if left is there then find right otherwise {-1,-1} will be ans
            arr[1] = rightIndexBinarySearch(nums,target);
        }
       System.out.println(Arrays.toString(arr));		// we have to use Arrays.toString to print arr, normally it will not 
	}	
}
