package Problem;
/*
 * Description: Given an array of integers, nums, return how many of them contain an even number of digits
 * Note: 1<=nums[i]<=10000
 * Example: Given nums = [12,345,2,6,7896]	Because 12 and 7896 contain an even number of digits-- return 2.
 */


public class findNumbers {
	public static int findNumber(int[] nums) {
		if(nums.length == 0) {
			return -1;
		}
		
		int digitCounter = 0;
		int evenCounter = 0;
		for(int i=0; i<nums.length;i++) {
			while(nums[i]!=0) {
				nums[i] /= 10;
				digitCounter++;
			}
			if(digitCounter%2 == 0) {
				evenCounter++;
			}
			digitCounter = 0;
		}
		return evenCounter;
	}

	public static void main(String[] args) {
		int[] nums = {12,345,2,6,7896};
		System.out.println(findNumber(nums));
	}

}
