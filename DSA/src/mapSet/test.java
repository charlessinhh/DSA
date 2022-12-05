package mapSet;

import java.util.*;


public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList (1,1,3,3,2,2,2,2,2,2,2));
		Map<Integer, Integer> map = new HashMap<>();
		for(Integer num: arr){
            map.put(num, map.getOrDefault(num,0) + 1);
            
        }
		System.out.println(map);
		System.out.println(map.size());
		
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (Integer key: map.keySet()) {
			arr1.add(key);
            System.out.print(key+" ");
        }
		System.out.println();
		System.out.println(arr1);
		System.out.println();
		ArrayList<Integer> arr2 = new ArrayList<Integer>();
		for(Map.Entry<Integer, Integer> m: map.entrySet()) {
		    if(m.getValue().equals(2)) {
		    	arr2.add(m.getKey());
		    	System.out.println("key is " +m.getKey());
		    }           
		}
		
		System.out.println(arr2);
		System.out.println("*********");
		for(int i = 0; i< arr2.size();i++) {
			System.out.println(arr2.get(i));
		}
		Set<Integer> set = new HashSet<>(map.values());
//		System.out.println(set);
		
	}

}
