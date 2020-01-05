package basicProblems;

public class countEven {
	public static int countEven(int[] nums) {
		int counter = 0;
		for(int i = 0; i<nums.length;i++) {
			
			if(nums[i]%2 == 0) {
				counter++;
			}
			
		}
		
		System.out.println(counter);
		return counter;
	}
	
	public static void main(String[] args) {
		int[] myIntArray = {2,5,9,3,6,4};
		countEven(myIntArray); // output 3
		
	}
}
