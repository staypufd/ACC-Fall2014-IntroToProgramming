/**
 * 
 */

import java.lang.Math;

/**
 * @author javauser
 *
 */
public class MathDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		// Sin of 90 degrees
		double sin90 = Math.sin(Math.PI / 2);
		System.out.println("Sin of 90 degrees in radians: " + sin90);
		
		// 2 PI
		System.out.println(2 * Math.PI);
		
		// round down
		System.out.println(Math.round(45.49999999999));
		
		// round up
		System.out.println(Math.ceil(45.49));

		// Num * 2 to power 2nd num  N * 2^Z)
		System.out.println(Math.scalb(3, 3));
		
		// Absolute value
		System.out.println(Math.abs(-45.56));
	
		System.out.println(Math.min(4.056, 4.089));
		System.out.println(Math.max(4.056, 4.089));
		
		// IEEE reaminder division for doubles (read the spec)
		System.out.println(Math.IEEEremainder(556.045, 343.681));
		
		System.out.println(Math.nextUp(67.98));
		System.out.println(Math.nextUp(67.98f));
		
		System.out.println(randomForRange(100));
		System.out.println(randomLongForRange(100));
		
		
		System.out.println(randomForRange(10000));
		System.out.println(randomLongForRange(10000));
		
		System.out.println(randomForRange(10));
		System.out.println(randomLongForRange(10));
		
		// Number^exponent   Example:  2^4 = 16 2^8 = 256  3^8 = 6561
		System.out.println(Math.pow(3, 8));
		
		System.out.println(Math.sqrt(9));
		
		
		// conversions 
		System.out.println(Math.toDegrees(Math.PI));
		System.out.println(Math.toRadians(180));
		
		
		System.out.println("C is: " + pythagorean( 3, 4));
		
	}
	
	
	
	public static double randomForRange(int upperValueNonInclusive) 
	{
		return Math.random() * upperValueNonInclusive;
	}

	public static long randomLongForRange(int upperValueNonInclusive)
	{
		return Math.round(randomForRange(upperValueNonInclusive));
	}
	
	public static double pythagorean(double a, double b)
	{
		// Square Root of a squared plus b squared
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		return c;
	}
	
}


















