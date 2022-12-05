import java.util.ArrayList;
import java.util.List;

public class Subset {
	
	public static void subset(List<List<Integer>> list,List<Integer> temp,int[] nums, int start) {
		list.add(new ArrayList<>(temp));
		System.out.println("list1 "+list);
		for(int i = start ; i < nums.length;i++ ) {
			if(i>start && nums[i] == nums[i-1]) continue;
			temp.add(nums[i]);
			System.out.println("temp1 "+temp);
			 // for duplicates
			subset(list,temp,nums,i+1);
			System.out.println("list2 "+list);
			temp.remove(temp.size()-1);
			System.out.println("temp2 "+temp);
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {1,2,2};
		List<List<Integer>> list = new ArrayList<>();
		List<Integer> temp = new ArrayList<>();
		
		subset(list,temp,nums,0);
		System.out.println("final list "+list);

	}

}
