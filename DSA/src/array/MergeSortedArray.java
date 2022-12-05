package array;

import java.util.Arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
		int[] arr1 ={1,2,3};
		int i = arr1.length;
		int []  arr2 =  {-1,3};
		int j = arr2.length;
		int [] arr3 = new int[i+j];
		merge(arr1, i, arr2, j,arr3);
		for(int x = 0; x <i+j;x++) {
			System.out.print(arr3[x]+" ");
		}	
	}

	private static void merge(int[] arr1, int i, int[] arr2, int j, int[] arr3) {
		int p = 0;
		int q = 0;
		int k = 0;
		while(p<i && q<j) {
			if(arr1[p] < arr2[q]) {
				arr3[k++] = arr1[p++];
			}
			else {
				arr3[k++] = arr2[q++];
			}
		}
		while(p<i) {
			arr3[k++] = arr1[p++];
		}
		while(q<j) {
			arr3[k++] = arr2[q++];
		}
		
	}

}
