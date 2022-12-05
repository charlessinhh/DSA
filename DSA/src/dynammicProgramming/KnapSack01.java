package dynammicProgramming;

import java.util.Arrays;

public class KnapSack01 {
	// recursion
	public static int maxProfitRec(int[] values, int[] weights, int n, int w) {
		// base case for recursion 
        if( n == 0 || w == 0) return 0;
        
        if(weights[n-1] <= w){
            return Math.max(values[n-1] + maxProfitRec(values, weights , n-1, w - weights[n-1])  , maxProfitRec(values, weights , n-1, w )) ;
        }
        else{
            return maxProfitRec(values, weights , n-1, w );         
        }
	}
	
	//memoization or TOp-Down 
	public static int maxProfitMemo(int[] values, int[] weights, int n, int w) {
		//2d array to store recursive call data
		int[][] arr = new int[n+1][w+1];
		// fill it with -1 .
		for(int i = 0; i <= n; i++) {
			for(int j = 0; j <= w; j++) {
				arr[i][j] = -1;
			}
		}
		
		// base case
		if(n == 0 || w == 0) return 0;
		
		if (arr[n][w] != -1){
			return arr[n][w];
		}
		
		if(weights[n-1] <= w){
            return arr[n][w] = Math.max(values[n-1] + maxProfitMemo(values, weights , n-1, w - weights[n-1])  , maxProfitMemo(values, weights , n-1, w )) ;
        }
        else{
            return arr[n][w] = maxProfitMemo(values, weights , n-1, w );         
        }
	}
	
	// tabulation or Bottom-Up 
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
				
				if(weights[i-1] <= j) {
					arr[i][j] =  Math.max(values[i-1] + arr[i-1][j - weights[i-1]]  , arr[i-1][j]);
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
		int[] values = {12,35 ,41 ,25, 32};
		int[] weights = {20 ,24, 36, 40 ,42};
		int n = 5;
		int w = 100;
		
		int ans = maxProfitRec(values, weights , n, w ); 
		int ans1 = maxProfitMemo(values, weights , n, w ); 
		int ans2 = maxProfitTable(values, weights , n, w ); 
		System.out.println("max profit from recursion is "+ans);
		System.out.println("max profit from memoization is "+ans1);
		System.out.println("max profit from tabulation is "+ans2);
				

	}

}
