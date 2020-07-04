
public class bigONotation {
	
	private int[] theArray;
	private int arraySize;
	private int itemsInArray = 0;
	static long startTime;
	static long endTime;

	public static void main(String[] args) {
		
		bigONotation testalgo = new bigONotation(10000);
		testalgo.generateRandomArray();
		
		bigONotation testalgo1 = new bigONotation(100000);
		testalgo1.generateRandomArray();
		
		bigONotation testalgo2 = new bigONotation(1000000);
		testalgo2.generateRandomArray();
		
		bigONotation testalgo3 = new bigONotation(10000000);
		testalgo3.generateRandomArray();
		
		
		testalgo.linearSearch(200);
		testalgo1.linearSearch(200);
		testalgo2.linearSearch(20);
		testalgo3.linearSearch(200);
	}
	
	bigONotation(int size) {
		arraySize = size;
		theArray  = new int[size];
		
	}
	
	public void linearSearch(int value) {
		
		boolean valueInArray = false;
		String indexsWithValue = "";
		
		startTime = System.currentTimeMillis();
		
		for(int i = 0; i < arraySize; i++) {
			if(theArray[i] == value) {
				valueInArray = true;
				indexsWithValue += i + " ";
				}
			}
		
		System.out.println("Value found: " + valueInArray);
		endTime = System.currentTimeMillis();
		
		System.out.println("Linear search took "+ (endTime-startTime));
		}
	
	public void generateRandomArray() {
		for(int i = 0; i < arraySize; i++) {
			theArray[i] = (int)(Math.random()*1000)+10;
		}
	
	}
}


