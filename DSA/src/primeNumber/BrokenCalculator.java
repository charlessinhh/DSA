package primeNumber;

public class BrokenCalculator {

	public static void main(String[] args) {
		// leetcode 
		//Given two integers startValue and target, 
		//return the minimum number of operations needed to display target on the calculator
		// Input: startValue = 2, target = 3
		// Output: 2  
		int startValue = 3;
		int target = 10;
		int ans = 0; // let ans 0 print ans
		
		while(target>startValue) {  // start from target and we will divide target by 2. 
			ans ++;  //every time increment ans 
			if (target % 2 == 0)  //even target
				target /= 2;
			else{
				target += 1;  // odd target
			}
		}
		System.out.println(ans +(startValue-target));  // target<startValue ,, increment target by 1 to reach startValue

	}

}
