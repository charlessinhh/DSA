package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/combination-sum/
public class CombinationSumLeetcode {
	
	public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        //elements can be same inside a list so index in solve must start from 0 every time
        List<List<Integer>> list = new ArrayList<>();
        
        List<Integer> output = new ArrayList<>();
        Arrays.sort(candidates);  // test case 
        
        solve(list, output, candidates, target,0);
        return list;
    }
    
    static void solve(List<List<Integer>> list, List<Integer> output,int[] candidates, int target, int start){
        //base case
        if(target<0) return;
        else if(target == 0){
            list.add(new ArrayList<>(output)); // put output as new ArrayList..
            return;
        }
        else{
            for(int i = start; i < candidates.length; i++){
                // if duplicates are there in input candidates check for cand[i]= cand[i-1] for i > start.
                // not present here
                // if(i > start && candidates[i] == candidates[i-1]) continue;
                output.add(candidates[i]);
                solve(list, output, candidates, target-candidates[i], i); //i will be same because we can start from starting.
                output.remove(output.size()-1);
            }
        }
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// find subset whose sum gives target ,, we can add single elements multiple times
		int[] candidates = {2,3,6,7};
		int target = 8;
		System.out.println(combinationSum(candidates,target));

	}

}
