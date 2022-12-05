package recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
	
	public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(0,ans,nums);
        return ans;
    }
    private static void solve(int index,List<List<Integer>> ans,int[] nums){
        if(index == nums.length){
            // add output ds to ans
            List<Integer> output = new ArrayList<>();
            for(int i = 0 ; i<nums.length;i++){
                output.add(nums[i]);
            }
            if(ans.contains(output)) {
            	return;
            }
            else {
            ans.add(new ArrayList<>(output));
            return;
            }
        }
        for(int i = index; i< nums.length;i++){
            swap(i,index,nums);
            solve(index+1,ans,nums);
            swap(i,index,nums);
        }
    }
    
    static void swap(int i, int j, int[] nums){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2};
		System.out.println(permute(nums));
		

	}

}
