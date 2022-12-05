package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets { //power Set
	
	public static void subset(List<List<Integer>> list,List<Integer> temp, int[] nums, int start) {
		//no base case,, because we are adding the last data recursion and after that loop will not run so
		
		
		list.add(new ArrayList<>(temp));
		for(int i = start ; i< nums.length ; i++) {
			// when there is duplicates in nums then check for nums[i] == nums[i-1],, then dont add that next element and continue to next loop
			if(i > start && nums[i] == nums[i-1]) continue; //continue to next loop
			temp.add(nums[i]);
			subset(list,temp,nums,i+1);
			temp.remove(temp.size()-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,3};
//		int[] nums = {1,2,2};  //duplicates
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		Arrays.sort(nums);
		subset(list,temp,nums,0);
		System.out.println("final list "+list);
		

	}

}
