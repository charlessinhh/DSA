package dynammicProgramming;

public class LongestCommonSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abcdefg";
		String str2 = "adegdxh";
		
		int ans = longestCommonSubsequence(str1,str2);
		int ans1 = longestCommonSubsequenceMemo(str1,str2);
		int ans2 = longestCommonSubsequenceTable(str1,str2);
		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);

	}
	
	
	//recursion
 	private static int longestCommonSubsequence(String str1, String str2) {
 		// TODO Auto-generated method stub
 		// base case,, length str 1 or str2,, one or both may be zero
 		int n = str1.length();
 		int m = str2.length();
 		if (n == 0 || m == 0) return 0;
		
// 		//  choice diagram
 		if(str1.charAt(n-1) == str2.charAt(m-1)) {
 			return 1 + longestCommonSubsequence(str1.substring(0,n-1),str2.substring(0,m-1));
 		}
 		else {
 			return Math.max(longestCommonSubsequence(str1,str2.substring(0,m-1)), longestCommonSubsequence(str1.substring(0,n-1),str2));
 		}
		
 	}
	
// 	//top-down
 	private static int longestCommonSubsequenceMemo(String str1, String str2) {
 		int n = str1.length();
 		int m = str2.length();

 		int[][] arr = new int[n+1][m+1];
 		// fill it with -1 .
 		for(int i = 0; i <= n; i++) {
 			for(int j = 0; j <= m; j++) {
 				arr[i][j] = -1;
 			}
 		}
		
 		if (n == 0 || m == 0) return 0;
		
 		if (arr[n][m] != -1){
 			return arr[n][m];
 		}
		
 		if(str1.charAt(n-1) == str2.charAt(m-1)) {
 			return arr[n][m] =  1 + longestCommonSubsequence(str1.substring(0,n-1),str2.substring(0,m-1));
 		}
 		else {
 			return arr[n][m] = Math.max(longestCommonSubsequence(str1,str2.substring(0,m-1)), longestCommonSubsequence(str1.substring(0,n-1),str2));
 		}	
 	}
 	
 	
 	//bottom up
	private static int longestCommonSubsequenceTable(String str1, String str2) {
		int n = str1.length();
		int m = str2.length();
			// base case initialisation
		int[][] arr = new int[n+1][m+1];
		for(int i = 0; i<=n ; i++) {
			for(int j = 0;j <= m;j++) {
				if(n == 0 || m == 0) arr[i][j] = 0;	
			}
		}
		
		//fill the array with data
		for(int i = 1; i <=n;i++) {
			for(int j = 1; j <=m;j++) {
				if(str1.charAt(i-1) == str2.charAt(j-1)) {
					arr[i][j] = 1 + arr[i-1][j-1];
				}
				else {
					arr[i][j] = Math.max(arr[i][j-1], arr[i-1][j]);
				}
			}
		}
		
		return arr[n][m];
	}

}
