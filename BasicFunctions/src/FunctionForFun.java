import java.util.Scanner;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class FunctionForFun {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		sayHello();

		sayHelloNumberOfTimes(5);

		double theSum = sumSomeNumbers(s);
		System.out.println("The summed result is: " + theSum);
		
		
		// Some up as many longs as you want to put in
		System.out.print("Input how many longs you want to type in: ");
		int numLongsToRead = s.nextInt();
	
		long theLongSum = sumSomeLongNumbers(numLongsToRead, s);
		System.out.println("The summed long result is: " + theLongSum);

		System.out.println("We're done!");
		
		s.close();
	}

	private static long sumSomeLongNumbers(int numLongsToRead, Scanner s) {
		
		// Init the local variable longSum to 0
		long longSum = 0;

		for (int j = 0; j < numLongsToRead; j++) {
			// Read in a long
			System.out.print("Enter a long: ");
			long theLong = s.nextLong();
			
			if (theLong > 100) {
				theLong = -100;
			} else {
				theLong = theLong * 2;
			}
			
			longSum = longSum + theLong;
			// longSum += theLong;
		}


		
		return longSum;
	}

	private static double sumSomeNumbers(Scanner s) {
		// TODO Auto-generated method stub


		// Read in a float
		System.out.print("Enter a float: ");
		float num1 = s.nextFloat();
//		System.out.println();

		// Read in a int
		System.out.print("Enter a int: ");
		int num2 = s.nextInt();
//		System.out.println();

		// Read in a long
		System.out.print("Enter a long: ");
		long num3 = s.nextLong();
//		System.out.println();

		System.out.print("foobar");

		double sumOfNums = num1 + num2 + num3;

		
		return sumOfNums;
	}

	private static void sayHello() {
		System.out.print("Hello,");
		System.out.print(" cruel,");
		System.out.print(" cruel");
		System.out.println(" world!");

	}

	private static void sayHelloNumberOfTimes(int numTimesToPrint) {

		for (int i = 0; i <= numTimesToPrint; i++) {
			System.out.print(i + ") ");
			System.out.println("Hello");
		}

		System.out.println("Done with loop!");
	}
}
