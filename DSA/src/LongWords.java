import java.util.Scanner;

public class LongWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0) {
			String str = sc.next();
			int l = str.length();
			if(l > 10) {
				char ch1 = str.charAt(0);
				String s1 = Character.toString(ch1);
				int m = l-2;
				char ch2 = str.charAt(l-1);
				String s2 = Character.toString(ch2);
				System.out.println(s1+m+s2);
			}
			else {
				System.out.println(str);
			}
			
		}
		
		

	}
}