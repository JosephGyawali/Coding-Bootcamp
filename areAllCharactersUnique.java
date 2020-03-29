package Problem;

public class areAllCharactersUnique {
	public static boolean areAllCharactersUnique(String str) {
		if(str == null || str.length()<=1) {
			return true;
		}
		
		// for ascii values
		boolean[] checkerArray = new boolean[256];
		
		for(int i = 0; i<str.length(); i++) {
			
			int position = str.charAt(i);
			
			// debugger
			System.out.println(position);
			
			if(checkerArray[position]) { return false;}
			checkerArray[position] = true;
			
		}
		return true;
		
		
		
	}

	public static void main(String[] args) {
		String a = "abcda";
		System.out.println(areAllCharactersUnique(a));

	}

}
