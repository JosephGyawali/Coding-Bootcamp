
/*
 * LeetCode 1323: Maximum 69 Number
 * 
 * Time Complexity: O(n) iterate through elements in array
 * Space Complexity: O(n) created char array
 * 
 * https://leetcode.com/problems/maximum-69-number/
 * 
 * 
 */



public class leetcode1323 {
	
	public static int maximum69Number (int nums) {
		
		String s = Integer.toString(nums);
		
		
		char[] sArray = s.toCharArray();
		
		Boolean found = false;
		
		for(int i = 0; i<sArray.length; i++) {
			if(sArray[i] == '6') {
			if(found == true) {
				break;
			}
				sArray[i] = '9';
				found = true;
			}
		}
		
		int solution = Integer.parseInt(new String(sArray));
		
		return solution;
		
	}

	public static void main(String[] args) {
		int test1 = 9669;
		int test2 = 9996;
		int test3 = 9999;
		
		System.out.println(maximum69Number(test1));
		System.out.println(maximum69Number(test2));
		System.out.println(maximum69Number(test3));
	}

}
