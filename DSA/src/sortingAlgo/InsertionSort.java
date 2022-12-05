package sortingAlgo;

import java.util.Arrays;

public class InsertionSort {
	// tc = O(n^2)
	// best case = all ready sorted = O(n)
	//sc = O(1)
	
	static void insertionSort(int[] arr, int n){
		for(int i = 1; i < n;i++) {// i = 1 , we let i = 0 is already sorted 
			int temp  = arr[i] ; // temp to store
			int j = i-1; //prev index.
			for(;j>=0;j--) {
				if(arr[j] > temp ) {
				// shift to right
					arr[j+1] = arr[j] ;
				}
				else {
					break;
				}
			}
			arr[j+1] = temp;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,1,5,3,8,4,0,-2,10,7};
		int n = arr.length;
		insertionSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
