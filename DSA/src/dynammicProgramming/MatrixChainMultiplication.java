package dynammicProgramming;

public class MatrixChainMultiplication {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {10,30,5,60};
		int n = arr.length;
		int i = 1;  // i start from 1st index not from 0th index
		int j = n-1; 
		
		int ans = matrixChainMultiplicationRecursive(arr, i ,j);
		int ans1 = MatrixChainMultiplicationMemo(arr,i,j);
		int ans2 = MatrixChainMultiplicationTable(arr,n);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);

	}
	
	//recursive 
	private static int matrixChainMultiplicationRecursive(int[] arr, int i, int j) {
		// base case 
		if(i >= j) return 0;
		
		int minn = Integer.MAX_VALUE;
		
		for(int k = i; k <= j-1; k++) {
			int temp = matrixChainMultiplicationRecursive(arr, i, k) + matrixChainMultiplicationRecursive(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
			
			if(temp < minn) minn = temp;
		}
		
		return minn;
	}
	
	//memoization
	private static int MatrixChainMultiplicationMemo(int[] arr, int i ,int j) {
		// 2d array and put -1 everywhere
		int[][] arr1 = new int[i+1][j+1];
		for(int p = 0; p <= i;p++) {
			for(int q = 0; q <=j; q++) {
				arr1[p][q] = -1;
			}
		}
		
		if(i >= j) return 0;
		
		if(arr1[i][j] != -1) {
			return arr1[i][j];
		}
		
		int minn = Integer.MAX_VALUE;
		
		for(int k = i; k <= j-1; k++) {
			int temp = MatrixChainMultiplicationMemo(arr, i, k) + MatrixChainMultiplicationMemo(arr,k+1,j) + arr[i-1]*arr[k]*arr[j];
			
			if(temp < minn) minn = temp;
		}
		
		return arr1[i][j] = minn;
		
	}
	
	//tabulation
	private static int MatrixChainMultiplicationTable(int[] arr, int N) {
		// 2d array and put -1 everywhere
		int[][] arr1 = new int[N+1][N+1];
		for(int p = 0; p <= N ; p++) {
			for(int q = 0;q <= N; q++) {
				if(p >= q) arr1[p][q] = 0;
			}
		}
		
		for(int i = N-1; i >= 1 ;i--) {
			for(int j = i+1 ; j < N;j++ ) {
				int minn = Integer.MAX_VALUE;
				
				for(int k = i; k <= j-1; k++) {
					int temp = arr1[i][k] + arr1[k+1][j] + arr[i-1]*arr[k]*arr[j];
					
					if(temp < minn) minn = temp;
				}
				
				arr1[i][j] = minn;
			}
		}
		
		return arr1[1][N-1];
		
	}

}
