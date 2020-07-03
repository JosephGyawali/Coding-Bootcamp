package basicProblems;

public class countTarget {
	public static int countTarget(int[] nums, int target) {
		int counter = 0;
		for(int i = 0; i<nums.length;i++) {
			if(nums[i] == target)	counter++;
			
		}
		System.out.println(counter);
		return counter;
	}
	
	public static void main(String[] args) {
		int[] myIntArray = {1,3,9,-5,3,-3};
		
		countTarget(myIntArray, 3); //	return 2
	}
}
