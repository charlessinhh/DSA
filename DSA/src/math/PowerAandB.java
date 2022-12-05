package math;

public class PowerAandB {
	static double myPow(double x, int n) {
		if (x == 1){  //digit is 1
            return 1;
        }
        if ( n == 0) // power zero 
            return 1;
      if(n<0){  //negative power then x = 1/x and power = -n;
            return 1/x * myPow(1/x, -(n+1));  
        }
        // if n is even then x = x*x and n = n /2 ,,, a^b = (a^(b/2))^2   === 2^6 = (2^(6/2))^2
        // if n is odd then x = x*x and n = n/2 and overall multiply by x ...  a^b = ((a^(b/2))^2)*a
      if(n%2 == 0) //even n
    	  return myPow(x*x,n/2);
      else
    	  return x*myPow(x*x, n/2);
      
    //  return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);  // one line code
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 2;
		int n = -1;  // a^n;;; output
		System.out.println(myPow(a,n));
	}

}
