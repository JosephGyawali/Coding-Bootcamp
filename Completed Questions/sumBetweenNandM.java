package basicProblems;

public class sumBetweenNandM {
		public static int sumBetweenNandM(int n, int k){
			int sum=0;
			
			for(;n<=k;n++) {
				sum +=n;
				
			}
			System.out.println(sum);
			return sum;
				
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sumBetweenNandM(5,7); // 18
		sumBetweenNandM(1,5); // 15
		sumBetweenNandM(10,12);//33
		sumBetweenNandM(2,5); //14

	}

}

