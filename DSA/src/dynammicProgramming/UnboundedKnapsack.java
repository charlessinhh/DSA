package dynammicProgramming;

public class UnboundedKnapsack {	
	
	
	// we can take elements multiple times
	public static int maxProfitTable(int[] values, int[] weights, int n , int w) {
		int[][] arr = new int[n+1][w+1];
		
		// base case changes to initialisation of table 
		// initialise first row andcolumn as 0.
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= w; j++) {
				if(i == 0 || j == 0) {
					arr[i][j] = 0;
				}
			}
		}
		/// fill the array with data where value from recursion changes to n == i,, w == j..
		for(int i = 1; i <= n; i++) {  // i starts from 1 
			for(int j = 1; j <= w; j++) {  // j starts from 1
				
				if(weights[i-1] <= j) { // arr[i-1][j-weights[i-1]] chnages to arr[i][j - weights[i-1]]
					arr[i][j] =  Math.max(values[i-1] + arr[i][j - weights[i-1]]  , arr[i-1][j]);
		        }
				else {
					arr[i][j] = arr[i-1][j];
				}
			}
		}
		return arr[n][w];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] values = {1, 4, 5, 7};
		int[] weights = {1, 3, 4, 5};
		int n = 4;
		int w = 8;
		
		int ans2 = maxProfitTable(values, weights , n, w ); 
		System.out.println("max profit from tabulation is "+ans2);
	}

}
