package sortingAlgo;

import java.util.Arrays;

public class QuickSort {

	public static void quickSort(int[] arr, int s, int e) {
		// base case
		if(s>=e)
			return ;
		
		//partition fnc to find index 
		int p = partition(arr,s,e);
		//left subarray sort
		quickSort(arr, s, p-1);
		//right subarray sort
		quickSort(arr,p+1,e);
	}
	
	// partition fun
	// step1 take a pivot (anyone,  start, end or mid or anything)
	//step2 count all element less than pivot (int cnt)
	//step3 swap pivot to s+cnt. 
	//step4 check pivot is at right position
	
	static int partition(int[] arr, int s, int e) {
		
		int pivot = arr[s];  // taking starting element as pivot element
		
		int cnt = 0;  // counting number less than pivot
		for(int i = s+1 ; i <= e; i++) {
			if (arr[i] < pivot)
				cnt++;
		}
		//place pivot at right position
		int pivotIndex = s+cnt;
		//swap arr[s] with arr[pivotIndex]
		int temp = arr[s];
		arr[s] = arr[pivotIndex];
		arr[pivotIndex] =  temp;
		
		//left and right check pivot is at right position
		int i = s; int j = e;
		while(i < pivotIndex && j > pivotIndex) {
			// arr[i] < pivot means i++ left checked 
			//arr[j] > pivot means j-- right checked
			//if not swap those particular i with j ..
			while(arr[i] <= pivot)
				i++;
			while(arr[j] > pivot)
				j--;
			
			if(i < pivotIndex && j > pivotIndex) {
				int temp1 = arr[i];
				arr[i] = arr[j];
				arr[j] = temp1;
				i++;
				j--;
			}
			
		}
		return pivotIndex;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = {2,1,5,3,8,4,0,-2,10,7};
		int n = arr.length;
		quickSort(arr, 0,n-1);
		System.out.println(Arrays.toString(arr));
	}

}
