import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
 * LeetCode 136: Single Number
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) for hashmap need to learn how to optimize this
 * 
 * https://leetcode.com/problems/single-number/
 * 
 * 
 */



public class leetcode136 {
	
	public static int singleNumber(int[] nums) {
	
		HashMap<Integer, Integer> hm = new HashMap<>();
		
		for(int i=0; i<nums.length; i++) {
			if(hm.containsKey(nums[i])) {
				hm.put(nums[i], 2);
			}
			else {
				hm.put(nums[i], 1);
			}
			
		} // end of for loop filled up hashmap
		
		for(Integer j: hm.keySet()) {
			if(hm.get(j) == 1) {
				return j;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		int [] test1 = new int[] {2,2,1};
		int [] test2 = new int[] {4,1,2,1,2};
		
		System.out.println(singleNumber(test1));
		System.out.println(singleNumber(test2));
		
		
	}

}
