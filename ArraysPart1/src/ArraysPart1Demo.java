import java.util.Scanner;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class ArraysPart1Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		singleDimensionArrayWithArrayLiteral();
		System.out.println("-----------------");
		singleDimensionArray();

		
		s.close();
	}



	private static void singleDimensionArray() {
		
		String[] myStrings = new String[10];
		int[] myInts = new int[10];
		float[] myFloats = new float[10];
		boolean[] myBooleans = new boolean[10];
		
		int[] myIntsTwo = {6, 9, 8, 4, 6, 2, 1, 0, 8, 9, 11, 12};
		float[] myFloatsTwo = {4.5f, 6.7f, 2.4f};
		boolean[] myBooleansTwo = {true, false, true, false, true};
		short[] myShorts = {(short) 1.0, (short) 2.0};
		byte[] myBytes = {(byte)127};
		char[] myChars = {'\u06DE', 'c'};
		
		System.out.println(myChars);
		
		System.out.println("Ouput a Byte value");
		System.out.println(">>>" + myBytes[0]);
		
		
		printArray(myStrings);
		
		System.out.println();
		myStrings[1] = "Sam";
		myStrings[6] = "Sally";
		
		myInts[0] = 1;
		myInts[1] = 5;
		
		myFloats[0] = 4.0f;
		myFloats[5] = 6.2f;
		
		myBooleans[0] = true;
		myBooleans[1] = true;
		myBooleans[6] = false;
		
		
		printArray(myStrings);
		printSparseArray(myStrings);
	}



	/**
	 * @param myStrings - the strings to be printed
	 */
	private static void printArray(String[] myStrings) {
		System.out.print("[");
		for (int i = 0; i < myStrings.length; i++) {
			System.out.print(myStrings[i]);
			// Print out a separator character
			if (i != myStrings.length - 1) {
				System.out.print(" - ");
			}
		}
		System.out.println("]");
	}
	
	/**
	 * Doesn't print null values of the array
	 * 
	 * @param myStrings - the strings to be printed
	 */
	private static void printSparseArray(String[] myStrings) {
		
		String[] tempArray = new String[myStrings.length];

		
		System.out.print("[");
		
		// Copy the values that aren't null into the tempArray at tempArrayIndex
		for (int i = 0; i < myStrings.length; i++) {
			if (myStrings[i] != null) {
				tempArray[i] = myStrings[i];
			}
		}
		
		// Now print it with commas between elements that aren't null
		for (int i = 0; i < tempArray.length; i++) {
			String theItem = tempArray[i];
			if (theItem != null) {
				System.out.print(tempArray[i]);
			}
			
			int nextIndex = i + 1;
			if (nextIndex < tempArray.length) {
				String nextItem = tempArray[i + 1];
				if (nextItem != null) {
					System.out.print(", ");
				}
			}
		}
		
		System.out.println("]");
	}
	


	private static void singleDimensionArrayWithArrayLiteral() {
		String[] myStrings = {"Sam", "abc", "Sally"};
		
		for (int i = 0; i < myStrings.length; i++) {
			System.out.print(i + ") ");
			System.out.println(myStrings[i]);
		}
		
		int arrayUpperBound = myStrings.length;
		int arrayLowerBound = 0;
		int index = 3;
		
		if ( (index >= arrayLowerBound) && (index < arrayUpperBound) ) {
			System.out.println("Safe to use this index");
		} else {
			System.out.println("Index would be out of the arrays bounds");
		}

	}

}
