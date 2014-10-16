import java.util.Scanner;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class OddsEvensAndSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		
// Tests of isEven and isOdd		
//		System.out.println(isEven(6));
//		System.out.println(isOdd(6));
//		
//		System.out.println(isEven(7));
//		System.out.println(isOdd(7));
		
		
		addEvensAddOddsAndSumAll(s);
		
		System.out.println("Program done, exiting");
		
		s.close();

	}
	
	
	private static void addEvensAddOddsAndSumAll(Scanner s) {
		
		int sum = 0;
		
		String input = "";
		boolean quit = false;
		do {
			System.out.println("Input a integer or q to quit");
			input = s.next();

			if (input.equalsIgnoreCase("q")) {
				quit = true;
			} else {
				int num = Integer.valueOf(input);
				sum += num;
				if (isEven(num)) {
					System.out.println(num + " is even!");
				}
				if (isOdd(num)) {
					System.out.println(num + " is odd!");
				}
			}
		} while (quit == false);
		
		System.out.println("sum is: \"" + sum + "\"");
		
		System.out.println("\'Sally\' is so pumped");
		
		System.out.println("  \'   \"   ");
	}

	private static boolean isEven(int num) {
		
		return num % 2 == 0;
	}
	
	private static boolean isOdd(int num) {
		
		return num % 2 != 0;
	}

}
