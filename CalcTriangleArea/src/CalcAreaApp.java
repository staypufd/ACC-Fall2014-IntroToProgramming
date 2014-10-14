import java.util.Scanner;



/**
 * Calculate the area of triangle today
 */

/**
 * @author javauser
 * @category MainApp
 * @version 0.8
 *
 * The application will calculate the area of any triangle.
 */
public class CalcAreaApp {

	/**
	 * @param args - Array of command line arguments that are Strings
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Add error handling 
		// FIXME - there is a bug here
		
		// Read the arguments off the command line and print them
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		//Example of making a double from a String
		// System.out.println(Double.valueOf("67.9"));
		
		System.out.println("Please type in a double and hit <return>:> ");
		Scanner s = new Scanner(System.in);
		double inputDouble = s.nextDouble();
		s.close();
		System.out.println("You typed in: " + inputDouble);

		double base;
		double height;
		long   x;
		int    y;
		
		base = Double.valueOf(args[0]);
		height = Double.valueOf(args[1]);
		x = Long.valueOf(args[2]);
		y = Integer.valueOf(args[3]);
		
		// Triangle Area Formula is 1/2 base * height
		double triangleArea = 0.5 * base * height;
		
		// type syso and ctrl-space to get completion 
		System.out.println("Triangles area is: " + triangleArea);
		
		long rectArea = x * y; 
		System.out.println("Rectangle area is: " + rectArea);
		System.out.println("Rectangle area is: " + (x * y));
		
		
	}

}












