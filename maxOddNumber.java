package basicProblems;

public class maxOddNumber {
	public static int maxOddNumber(int[] nums) {
		int temp = 0;
		for(int i = 0; i<nums.length;i++) {
			if(temp<nums[i] && nums[i]%2 == 1) {
				temp = nums[i];
			}
			
		}
		
		System.out.println(temp);
		return temp;
		
	}
	
	public static void main(String[] args) {
		int[] myIntArray = {2,5,9,3,6,4};
		maxOddNumber(myIntArray);
		
	}
}
