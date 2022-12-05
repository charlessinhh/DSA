package sortingAlgo;

import java.util.Arrays;

public class SelectionSort {
	// space complexity = we haventt created any extra space to store so O(1),, constant.
// time complexity = n*n =  O(n^2)
	
	static void selectionSort(int arr[], int n)
	{
	   // take arr[0]  as min ele
		for(int i = 0; i<n;i++) {
			int minIndex = i;   // min index as min
			// compare this minindex in remaining arr from i +1;
			for(int j = i+1; j< n; j++) {
				if(arr[j] < arr[minIndex])  // means more ele are found in array less than arr[i] or arr[min]
					minIndex = j;   // update minIndex to that index 'j'..
			}
			//if found swap minIndex with i
			int temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;
		}
	}
	
	public static void main(String args[]) {
		int [] arr = {2,1,5,3,8,4,0,-2,10,7};
		int n = arr.length;
		selectionSort(arr,n);
		System.out.println(Arrays.toString(arr));
	}
}
