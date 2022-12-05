package sortingAlgo;

import java.util.Arrays;

public class MergeSort {
	// using recursion
	// tc = O(nlog(n))
	// sc = o(n)
	
	static void mergeSort(int[] arr, int s, int e ) {
		if(s >= e) // base case single elemnt is already sorted.
			return;
		
		int mid = s + (e - s) / 2;
		
		//sort left part of mid,, make  s= s,,e = mid and call functionn
		
		mergeSort(arr, s, mid);
		
		//sort right,, s = mid+1,,e = e..
		mergeSort(arr, mid+1, e);
		
		// merge both left and right 
		merge(arr,s,e);
		 
	}
	
	static void merge(int[] arr , int s, int e) {
		int mid = s + (e-s)/2;
		int len1 = mid  -s +1;
		int len2 = e-mid;
		 // create two array and copy the value in it
		int[] arr1 = new int[len1];
		int[] arr2 = new int[len2];
		
		// copy values into particular array..arr1 and arr2
		int mainArrayIndex = s;  // starting index
		// copy in arr1
		for(int i = 0; i<len1;i++) {
			arr1[i] = arr[mainArrayIndex];
			mainArrayIndex++;
		}
		//copy in arr2
		for(int i = 0 ; i<len2;i++) {
			arr2[i] = arr[mainArrayIndex];
			mainArrayIndex++;
		}
		
		//merge arr1 and arr2 to main array arr..
		int index1 = 0;
		int index2 = 0;
		mainArrayIndex = s;
		
		while( index1 < len1 && index2 < len2) {
			if( arr1[index1] < arr2[index2] ) {
				arr[mainArrayIndex] = arr1[index1];
				mainArrayIndex++;
				index1++;
			}
			else {
				arr[mainArrayIndex] = arr2[index2];
				mainArrayIndex++;
				index2++;
			}
		}
		
		while(index1<len1) {
			arr[mainArrayIndex] = arr1[index1];
			mainArrayIndex++;
			index1++;
		}
		
		while(index2 < len2) {
			arr[mainArrayIndex] = arr2[index2];
			mainArrayIndex++;
			index2++;
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,1,5,3,8,4,0,-2,10,7};
		int n = arr.length;
		mergeSort(arr,0,n-1);
		System.out.println(Arrays.toString(arr));
	}

}
