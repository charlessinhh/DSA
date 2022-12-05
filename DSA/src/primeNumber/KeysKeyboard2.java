package primeNumber;

public class KeysKeyboard2 {

	public static void main(String[] args) { // prime factors of N..
		// 2 Keys Keyboard of leetcode .. Given an integer n, return the minimum number of operations to get the character 'A' exactly n times on the screen.
		int n = 30; //input
		int ans = 0;
        for(int i = 2; i<=n;i++){ 
            while(n%i == 0){  // prime factors of n
                ans = ans + i;
                n = n/i;
            }
        }
        System.out.println(ans);
	}

}
