package basicProblems;

public class only14 {
	public static boolean only14(int[] nums) {
		// i = iterator of the array
		for(int i = 0; i<nums.length;i++) {
			if(nums[i] != 1 && nums[i] != 4) {
				System.out.println("False");
				return false;
			}
		}
		
		System.out.println("True");
		return true;
	}
	
	
	
	public static void main(String[] args) {
		int[] myIntArray = {1,1,4,4};
		
		only14(myIntArray); // return true
		
		int[] myIntArray1 = {1,2,3,4};
		
		only14(myIntArray1);
		
		
	}
}
