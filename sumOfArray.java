package basicProblems;

public class sumOfArray {
	public static int sumOfArray(int[] nums) {
		int sum = 0;
		for(int i = 0;i<nums.length;i++) {
			sum+=nums[i];
		}
		
		System.out.println(sum);
		return sum;
		
	}
	
	public static void main(String[] args) {
		int[] myIntArray = {1,2,3,4};
		
		sumOfArray(myIntArray);
	}
}
