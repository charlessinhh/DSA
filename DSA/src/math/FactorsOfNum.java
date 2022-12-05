package math;

public class FactorsOfNum {
	static void fact(int n ) {   // tc =  0(sqrt(n)) .., sc -= O(1)
		int i ;
		for(i = 1; i*i <n; i++) {   // first print i which gives 0 rem upto sqrt(n)
			if(n%i== 0) {
				System.out.println(i + " ");
			}
		}
		if(i-(n/i)==1) {  // corner cases like 30(5,6) so i --;
			i--;
		}
		for(;i >=1;i--) {    // second print n/i which gives ) rem upto sqrt(n)    
			if(n%i == 0) {
				System.out.println(n/i+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30;
		fact(n);

	}

}
