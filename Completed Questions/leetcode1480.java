/*
 * LeetCode 1480: Running Sum of 1d Array
 * 
 * Time Complexity: O(n)
 * Space Complexity: O(n) 
 * 
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * 
 * 
 */

public class leetcode1480 {
	
	public static int[] runningSum(int[] nums) {
		int[] solution = new int[nums.length];
		int counter = 0;
		
		for(int i = 0; i<nums.length; i++) {
			counter += nums[i];
			
			solution[i] = counter;
		}
		
		return solution;
	}
	
	public static void main(String[] args) {
		int[] test1 = new int[] {1,2,3,4};
		int[] test2 = new int[] {1,1,1,1};
		int[] test3 = new int[] {3,1,2,10,1};
		
		System.out.println(runningSum(test1));
		System.out.println(runningSum(test2));
		System.out.println(runningSum(test3));
		
	}

}
