package array;

public class PalindromeRecursion {
	
//	static boolean checkPalindrome(String str, int i , int j) {
//		//base case
//		if(i>j) {
//			return true;
//		}
//		char [] ch = str.toCharArray();
//		if(ch[i] != ch[j]) {
//			return false;
//		}
//		else {
//			String str1 = String.valueOf(ch);  // convert ch to string for further ops
//			return checkPalindrome(str1, i+1 ,j-1);
//		}
//	}
	
	static boolean checkPalindrome(String str, int i , int j) {
		if(i >= j) {
			return true;
		}
		while(i<=j) {
			if(str.charAt(i++) != str.charAt(j--)) return false;
		}
		return true;
	}
//	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str  = "abbba";
		boolean isPalindrome = checkPalindrome(str,0,str.length()-1);
		if(isPalindrome) {
			System.out.println(str + " is palindrome");
		}
		else {
			System.out.println(str + "  is not palindrome");
		}

	}

}
