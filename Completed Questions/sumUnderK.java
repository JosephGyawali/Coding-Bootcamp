package basicProblems;

public class sumUnderK  {
	
	
	public static int sumUnderNumber(int k) {
		int sum = 0;
		
		for(int i = 1; i<=k;i++) {
			 
			sum +=i;
			
			//System.out.println(sum1);
		}
		
		System.out.println("Sum of number under " + k+ ": "+sum);
		return sum;
	}
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumUnderNumber(5); // 15
		sumUnderNumber(6); // 21
		sumUnderNumber(7); // 28
		sumUnderNumber(8); // 36
	}
	
	
	
}


