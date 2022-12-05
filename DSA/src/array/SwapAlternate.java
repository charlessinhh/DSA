package array;

public class SwapAlternate {
	static void swap(int[] arr, int n) {
		for(int i = 0;  i< n-1; i+=2) { // alternate so i = i+2; no need to i++ // we go to last n-1 pos.
			if(i<n) { // i+1 should be in range of n,
				// swap (arr[i], arr[i+1])
				int c = arr[i+1];
				arr[i+1] = arr[i];
				arr[i]= c;
			}
		}
		for(int j = 0; j <n; j++) {
			System.out.print(arr[j]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5};
		int n = arr.length;;
		swap(arr,n);

	}

}
