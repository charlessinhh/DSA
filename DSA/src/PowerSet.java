import java.util.ArrayList;
import java.util.List;

public class PowerSet {
	
	private static void permutationFind(List<String> list,String input, String output) {
        if(input.length()==0){
            list.add(output);
            return;
        }
        String out1 = output; 
        String out2 = output;
        out2 += input.charAt(0);
        input = input.substring(1);

        permutationFind(list,input,out1);
        permutationFind(list,input,out2);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 123;
		
		String input = String.valueOf(n);
		String output  = "";
		List<String> list = new ArrayList<>();
		
		permutationFind(list,input,output);
		
		System.out.println(list);
		

	}

}
