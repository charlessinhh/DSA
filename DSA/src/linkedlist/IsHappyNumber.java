package linkedlist;

//https://leetcode.com/problems/happy-number/
public class IsHappyNumber {
	
	public boolean isHappy(int n) {
		int fast = n;
		int slow = n;
		do {
			slow = square(slow);
			fast = square(square(fast));
		}while(fast != slow);
		if(slow == 1) {
			return true;
		}
        return false;
    	}
	
	
	public int square(int n ) {
		int ans = 0;
		while(n>0) {
			int rem = n %10;
			ans  += rem*rem;
			n = n/10;
		}
		return ans;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IsHappyNumber ans = new IsHappyNumber();
		System.out.println(ans.isHappy(19));

	}

}
