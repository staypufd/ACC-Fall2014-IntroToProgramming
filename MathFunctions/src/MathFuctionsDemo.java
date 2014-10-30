/**
 *
 */

/**
 * @author samjr
 *
 */
public class MathFuctionsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		roundExample();
		ceilingExample();
		absoluteValueExample();
		cubeRootExample();
		copySignExample();
		floorExample();
		floorDivExample();
		naturalLogExample();
		base10LogExample();
		maxExample();
		minExample();
		nextUpExample();
		powerExample();
		randomExample();
		sinExample();
		squareRootExample();

	}


	private static void squareRootExample() {
		// Square Root
		System.out.println(Math.sqrt(16.0000));

		printDivider();
	}


	private static void sinExample() {
		// Returns the Sin of the argument (the argument is in radians)
		System.out.println(Math.sin(0));
		System.out.println(Math.sin(Math.PI / 2));
		System.out.println(Math.sin(Math.PI / 4));
		System.out.println(Math.sin(-1 * Math.PI / 2));

		printDivider();
	}


	private static void randomExample() {
		// Returns a random double between 0.0 (inclusive) and 1.0 (exclusive)
		System.out.println(Math.random());

		printDivider();
	}


	private static void powerExample() {
		// Returns the first argument raised to the power of the second argument
		System.out.println(Math.pow(3, 3));

		printDivider();
	}


	private static void nextUpExample() {
		// Returns the next value adjacent to the arg
		System.out.println(Math.nextUp(45.00001));
		System.out.println(Math.nextUp(45.00002));
		System.out.println(Math.nextUp(45.00003));
		System.out.println(Math.nextUp(45.00004));
		System.out.println(Math.nextUp(45.00005));
		System.out.println(Math.nextUp(45.00006));

		printDivider();
	}


	private static void minExample() {
		// Min returns which number of two numbers is smaller
		System.out.println(Math.min(45.1112, 12.004));

		printDivider();
	}


	private static void maxExample() {
		// Max returns which number of two numbers is the larger
		System.out.println(Math.max(56.18284, 56.18344));
		System.out.println(Math.max(56.18284, -56.001));
		System.out.println(Math.max(116.18284, 56.001));

		printDivider();
	}


	private static void base10LogExample() {
		// Base 10 log
		System.out.println(Math.log10(57.3111));

		printDivider();
	}


	private static void naturalLogExample() {
		// Natural log of the argument
		System.out.println(Math.log(92.89383));

		printDivider();
	}


	private static void floorDivExample() {
		// Divides a number and rounds down to the nearest integer divisor
		System.out.println(Math.floorDiv(1000, 20));
		System.out.println(Math.floorDiv(1000, 21));
		System.out.println(Math.floorDiv(1000, 22));
		System.out.println(Math.floorDiv(1000, 23));

		printDivider();
	}


	private static void floorExample() {
		// Floor returns a double that is less than or equal to the argument and
		// a mathematical integer (meaning the digits after the decimal are zeros)
		// such as 45.0 which is the same as the mathematical integer 45
		System.out.println(Math.floor(348.459));
		System.out.println(Math.floor(348.4000001));
		System.out.println(Math.floor(348.8000001));
		System.out.println(Math.floor(348.9999999));

		printDivider();
	}


	private static void copySignExample() {

		// Copies the sign from the 2nd argument (sign) to the first argument (magnitude)
		System.out.println(Math.copySign(3.5, -10000.0));
		System.out.println(Math.copySign(-100.435, -10.0));
		System.out.println(Math.copySign(-100.435, 2.0));

		printDivider();
	}


	private static void cubeRootExample() {
		// Cube root of the value
		System.out.println(Math.cbrt(8));

		printDivider();
	}


	private static void absoluteValueExample() {

		// Absolute value takes the argument and makes it a positive number
		System.out.println(Math.abs(-45.300004));

		printDivider();
	}


	private static void ceilingExample() {
		// Ceiling example
		// Ceiling rounds up to nearest integer
		System.out.println(Math.ceil(33.40000000000001));
		System.out.println(Math.ceil(33.50000000000000));
		System.out.println(Math.ceil(33.50000000000001));
		System.out.println(Math.ceil(33.00000000000001));

		printDivider();
	}


	private static void roundExample() {
		// Round examples
		// Anything less that 1/2 (0.5) will round down to nearest integer
		// Even for very small decimal values to the right of the decimal
		// Anything 1/2 and above will round up to nearest integer
		System.out.println(Math.round(45.4000009));
		System.out.println(Math.round(45.5000000000));
		System.out.println(Math.round(45.50000000001));

		printDivider();
	}


	private static void printDivider()
	{
		System.out.println("\n---------------------------\n");
	}
}
