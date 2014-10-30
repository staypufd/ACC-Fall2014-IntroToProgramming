import java.util.Random;




public class MoreArraysApp {

	public static void main(String[] args) {
//		makeAndPrint2DArray();
//		System.out.println("------");
//		forSkipping(10, 5);
//
//		printRandom5by5ArrayOfOdds();

		printRandomArrayOfOdds();
	}


	/**
	 *
	 */
	@SuppressWarnings("unused")
	private static void makeAndPrint2DArray() {
		String[][] a = new String[3][2];

		a[2][1] = "Sam";


		print2DArray(a);
	}


	/**
	 * @param a
	 */
	private static void print2DArray(String[][] a) {
		// Do rows
		System.out.println("[");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col]);
				if(col < a.length - 1) {
					System.out.print(", ");
				}
			}
			System.out.println("]");
		}
	}

	/**
	 * @param a
	 */
	private static void print2DArray(int[][] a) {
		// Do rows
		System.out.print("[");
		for (int row = 0; row < a.length; row++) {
			for (int col = 0; col < a[row].length; col++) {
				System.out.print(a[row][col]);
				if(col < a.length - 1) {
					System.out.print(", ");
				}
			}
			if(row != a.length - 1) {
				System.out.println();
			}
		}
		System.out.print("]");
	}

	private static void print2DArrayUsingFunction(int[][] a)
	{
		System.out.println(">>");
		for (int i = 0; i < a.length; i++) {
			int[] theInts = a[i];
			print1DArray(theInts);
		}
		System.out.println(">>");
	}

	public static void forSkipping(int skipAmount, int howManyNumsWanted) {

		int[] myInts = new int[howManyNumsWanted];

		for (int x = 0; x < myInts.length; x++) {
			myInts[x] = x * skipAmount;
		}

		print1DArray(myInts);
	}

	/**
	 * @param myInts - the strings to be printed
	 */
	private static void print1DArray(int[] myInts) {
		System.out.print("[");
		for (int i = 0; i < myInts.length; i++) {
			System.out.print(myInts[i]);
			// Print out a separator character
			if (i != myInts.length - 1) {
				System.out.print(", ");
			}
		}
		System.out.println("]");
	}

	public static void printRandom5by5ArrayOfOdds()
	{
		int[][] my5By5 = new int[5][5];
		for (int j = 0; j < my5By5.length; j++) {
			for (int i = 0; i < my5By5.length; i++) {
				int randNum = new Random().nextInt(100);
				while (!isOdd(randNum)) {
					randNum = new Random().nextInt(100);
				}
				my5By5[i][j] = randNum;
			}
		}

		print2DArray(my5By5);
	}


	private static boolean isOdd(int randNum) {

		return randNum % 2 == 1;
	}

	@SuppressWarnings("unused")
	private static boolean isEven(int randNum) {

		return randNum % 2 == 0;
	}


	public static void printRandomArrayOfOdds()
	{
		int[][][][] myRandomOdds = new int[5][10][20][3];

		for (int j = 0; j < myRandomOdds.length; j++) {

			int[][][] dim1ArrayOfInts = myRandomOdds[j];

			for (int c = 0; c < dim1ArrayOfInts.length; c++) {

				int[][] dim2ArrayOfInts = myRandomOdds[j][c];

				for (int i = 0; i < dim2ArrayOfInts.length; i++) {

					int[] dim3ArrayOfInts = myRandomOdds[j][c][i];

					for (int k = 0; k < dim3ArrayOfInts.length; k++) {
						int myRandInt = getRandomOddNumber();
						myRandomOdds[j][c][i][k] = myRandInt;
					}
				}
			}


		}

		print4DArray(myRandomOdds);
	}


	private static void print3DArray(int[][][] myRandomOdds) {

//		System.out.println(">");
//		for (int i = 0; i < myRandomOdds.length; i++) {
//			System.out.println(">>");
//			for (int j = 0; j < myRandomOdds[i].length; j++) {
//				System.out.println(">>>");
//				for (int c = 0; c < myRandomOdds[i][j].length; c++) {
//					System.out.print(myRandomOdds[i][j][c] + ", ");
//				}
//				System.out.println(">>>");
//			}
//			System.out.println(">>");
//		}
//		System.out.println(">");


		for (int i = 0; i < myRandomOdds.length; i++) {
			int[][] outerArray = myRandomOdds[i];
			System.out.println(">>>");
			print2DArrayUsingFunction(outerArray);
			System.out.println(">>>");
		}
	}

	private static void print4DArray(int[][][][] theArrays)
	{
		for (int i = 0; i < theArrays.length; i++) {
			int[][][] outerArray = theArrays[i];
			System.out.println(">>>>");
			print3DArray(outerArray);
			System.out.println(">>>>");
		}
	}

	// Random Odd number generator
	private static int getRandomOddNumber() {
		int theRandomNum;
		do {
			theRandomNum = new Random().nextInt(100);
		} while (!isOdd(theRandomNum));


		return theRandomNum;
	}

}






































