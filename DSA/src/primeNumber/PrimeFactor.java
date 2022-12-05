package primeNumber;

public class PrimeFactor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 30; // prime factors of 30 is 2,3,5
		int ans = 0;
        for(int i = 2; i<=n;i++){
            while(n%i == 0){  
            	System.out.println(i);
                n = n/i;
            }
        }
	}
}
