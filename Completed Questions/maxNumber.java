package basicProblems;

public class maxNumber {
	public static int maxNumber(int[] nums) {
		int temp = 0;
		for(int i = 0; i<nums.length;i++) {
			
			if(temp<nums[i])	temp = nums[i];
			
		}
		
		System.out.print(temp);
		return temp;
		
	}
	
	public static void main(String[] args) {
		int[] myIntArray = {2,5,9,3,6,4};
		
		maxNumber(myIntArray);
	}
}
