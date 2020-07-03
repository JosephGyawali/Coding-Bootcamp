/*
 * LeetCode 7: Reverse Integer
 * 
 * Time Complexity: 
 * Space Complexity: 
 * 
 * https://leetcode.com/problems/reverse-integer/
 * 
 * 
 */
public class leetcode7 {
	
	public static int reverse(int x) {
		long temp = 0;
		while(x!=0) {
			temp = temp*10 + x%10;
			x = x/10;
		}
		
		if(temp > Integer.MAX_VALUE) {
			return 0;
		}
		
		if(temp < Integer.MIN_VALUE) {
			return 0;
		}
		
		return (int)temp;
		
	}
	
//	BRUTE FORCE SOLUTION
	
//		boolean isNegative = false;
//		
//		if(x%10 == 0) {
//			x = x/10;
//		}
//		
//		if(x<0) {
//			x = Math.abs(x);
//			isNegative = true;
//			
//		}
//
//		
//		String y = Integer.toString(x);
//		char[] xArray = y.toCharArray();
//		
//		
//		char[] cSolution = new char[xArray.length];
//		
//		
//		
//		int spc = 0;
//		
//		for(int i = xArray.length-1; i >= 0; i--) {
//			cSolution[spc] = xArray[i];
//			spc++;
//		}
//		
//		String sSolution = new String(cSolution);
//		int iSolution = Integer.parseInt(sSolution);
//		
//		if(isNegative) {
//			return (iSolution*-1);
//		}
//		
//		return iSolution;
//
//	}

	public static void main(String[] args) {
		int x = -123;
		int y = -456;
		
		System.out.println(reverse(x));
		System.out.println(reverse(y));

	}

}
