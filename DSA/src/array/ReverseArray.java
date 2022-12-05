package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	
	
////	static void revArr(int arr[], int n) {
////		int c;  // temp to store one data so that after swap not be vanished
////		for(int i = 0;i<n/2;i++) {
////			c = arr[i];
////			arr[i] = arr[n-1-i];
////			arr[n-1-i] = c;
////		}
////		System.out.println("reveresd array is "+Arrays.toString(arr));
////	}
	
	
	static void revArr(String arr, int n) {
		// create a char array and print from behind..
		char[] arr1 = arr.toCharArray();
		for(int i = n-1 ; i>=0 ; i--) {
			System.out.print(arr1[i]);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
//		System.out.println("enter int eelements in array: ");
//		int arr[] = new int[5];
//		for(int i = 0; i<arr.length;i++) {
//			arr[i] = s.nextInt();
//		}
//		System.out.println("original array is "+Arrays.toString(arr));
//		revArr(arr, arr.length); 
//	}
		
		String arr = "charles";
		int n = arr.length();
		System.out.println(n);
		revArr(arr, n);
}
}
