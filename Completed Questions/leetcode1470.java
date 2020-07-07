
/*
 * LeetCode 1470: Shuffle the Array
 * 
 * Time Complexity: O(n) iterate through input array
 * Space Complexity: O(n) array
 * 
 * https://leetcode.com/problems/shuffle-the-array/
 * 
 * 
 */
public class leetcode1470 {
	
	public static int[] shuffle (int[] nums, int n) {
		int shuffled[] = new int[2*n];
		int i=0, j=0;
		while(j<2*n) {
			shuffled[j] = nums[i];
			shuffled[j] = nums[i+n];
			
			i++;
			j+=2;
		}
		
		return shuffled;
	}
	
	public static void main(String[] args) {
		int[] test1 = new int[] {2,5,1,3,4,7};
		int[] test2 = new int[] {1,2,3,4,4,3,2,1};
		int[] test3 = new int[] {1,1,2,2};
		
		

	}
}
