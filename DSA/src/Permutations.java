import java.util.ArrayList;

public class Permutations {
	
	private static void solve(int[] input,ArrayList<Integer> output ) {
		if(input.length ==0 ) {
			System.out.println(output);
		}
		ArrayList<Integer> output1 = output;
		ArrayList<Integer> output2 = output;
		
//		output2 += input[0];
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {2,3};
		ArrayList<Integer> output = new ArrayList<Integer>();
		
		solve(input,output);
		
	}

}
