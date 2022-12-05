 package sortingAlgo;

import java.util.Arrays;

public class BubbleSort {
	// tc = O(n^2)// best = O(n)
	// sc = O(1)
	
	
	static void bubbleSort(int[] arr, int n ) {
		for(int i = 0 ; i < n-1 ; i++) {   // i = 1; i <n;
//		for(int i = 1 ; i <n ; i++) { 
			// loop for 1 to n-1 // no of round to process ele
			for(int j = 0 ; j < n-1; j++) {
//			for(int j = 0 ; j < n-i; j++)// if i = 1,   j will be <n-i .. 
				// process ele till (n-i)th index.
				if(arr[j] > arr[j+1]) {  // if j = n-1 then it will give exception j +1 not outside array
					int temp = arr[j] ;
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {2,1,5,3,8,4,0,-2,10,7};
		int n = arr.length;
		bubbleSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}

}
