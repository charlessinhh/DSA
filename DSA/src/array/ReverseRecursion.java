package array;

public class ReverseRecursion {
	

	static String reverse(String str, int i ,int j) {
		//base case 
		if(i>j) {
			return str;
		}
		// convert to char array to perform swap with temp 
		char [] ch = str.toCharArray();
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
		i++;
		j--;
		// important ....convert "ch" to  a new string and apply recursion
		String str1 = String.valueOf(ch);
		return reverse(str1   , i  ,  j);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "charles";
		String str1 = reverse(str,0,str.length()-1);
		System.out.println(str1);
		
	}

}
