package dynammicProgramming;

public class PalindromePartitionCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "aba";
		int i = 0;
		int j = s.length() - 1;
		
//		int ans = PalindromePartitionCountRecursive(s, i , j);
		int ans1 = PalindromePartitionCountMemo(s,i,j);
		int ans2 = PalindromePartitionCountMemoOpti(s,i,j);
//		System.out.println(ans);
		System.out.println(ans1);
		System.out.println(ans2);
	}

	
	private static int PalindromePartitionCountRecursive(String s, int i, int j) {
		// TODO Auto-generated method stub
		
		//base case
		// if string size is 0,, rturn 0 ,,, if size is 1 means it is palindrome return 0 partition
		// check full string for palindrome ,, if  already palindrome return 0 partition
		if(i >=  j) return 0;
		if(isPalindrome(s,i,j)) return 0;
		int minn = Integer.MAX_VALUE;
		
		for(int k = i; k < j ;k++) {
			int temp = 1 + PalindromePartitionCountRecursive(s,i,k) + PalindromePartitionCountRecursive(s,k+1,j);
			
			if( temp < minn ) minn = temp;
		}
		return minn;
	}
	
	
	private static int PalindromePartitionCountMemo(String s, int i, int j) {
		// TODO Auto-generated method stub
		int l = s.length();
		int[][] arr1 = new int[l+1][l+1];
		for(int p = 0; p <= i;p++) {
			for(int q = 0; q <=j; q++) {
				arr1[p][q] = -1;
			}
		}
		
		if(i >= j) return 0;
		
		if(arr1[i][j] != -1) {
			return arr1[i][j];
		}
			
		if(isPalindrome(s,i,j)) return 0;
		int minn = Integer.MAX_VALUE;
		
		for(int k = i; k < j ;k++) {
			int temp = 1 + PalindromePartitionCountMemo(s,i,k) + PalindromePartitionCountMemo(s,k+1,j);
			
			if( temp < minn ) minn = temp;
		}
		return arr1[i][j]= minn;
	}
	
	
	
	private static int PalindromePartitionCountMemoOpti(String s, int i, int j) {
		// TODO Auto-generated method stub
		int[][] dp = new int[i+1][j+1];
		for(int p = 0; p <= i;p++) {
			for(int q = 0; q <=j; q++) {
				dp[p][q] = -1;
			}
		}
		
		if(i >= j || isPalindrome(s,i,j)) return 0;
		
		if(dp[i][j] != -1) return dp[i][j];
		int minn = Integer.MAX_VALUE;
		
		for(int k = i; k< j ;k++) {
			if(isPalindrome(s,i,k)) {
				int temp = 1 + PalindromePartitionCountMemoOpti(s,k+1,j);
				if(temp < minn) minn = temp;
			}
		}
		return dp[i][j] = minn;
		
		
	}
	

	private static boolean isPalindrome(String s, int i, int j) {
		// TODO Auto-generated method stub
		if(i >= j) {
			return true;
		}
		while(i<j) {
			if(s.charAt(i++) != s.charAt(j--)) return false;
		}
		return true;
	}

}
