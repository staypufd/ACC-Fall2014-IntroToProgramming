import java.util.Scanner;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class BasicTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean bird;
		bird = true;
		System.out.println("Bird's value is: " + bird);
		bird = false;
		System.out.println("Bird's value is: " + bird);
		System.out.println("The boolean values");
		System.out.println(Boolean.FALSE);
		System.out.println(Boolean.TRUE);
		
		System.out.println("----------------");
		
		int count;
		count = 10;
		System.out.println(count);
		System.out.println(count + 6);
		
		// These are basically the same.  The += is a shortcut syntax
		count = count + 9;
		System.out.println(count);
		count += 9;
		System.out.println(count);
		
		System.out.println("Max and Min int values");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		
		System.out.println("----------------");
		
		System.out.println("Max and min long values");
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.SIZE);
		
		System.out.println("----------------");
		
		System.out.println("Max and min float values");
		// ????
		System.out.println(Float.MIN_VALUE);
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.SIZE);
		
		System.out.println("----------------");
	
		System.out.println("Max and min double values");
		// ????
		System.out.println(Double.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.SIZE);
		
		System.out.println("----------------");
		
		System.out.println("char min and max values");
		char minv = Character.MIN_VALUE;
		char maxv = Character.MAX_VALUE;
		System.out.println(Character.SIZE);
		
		System.out.println(minv);
		System.out.println(maxv);
		System.out.println("\u00A9\u00B6\u2606");
		
		System.out.println("string values");
		System.out.println(String.valueOf(45.7));
		char theCharacterA = 'A';
		int addMeToChar = 97;
		char lowerCaseA = 'a';
		char unicodeChar = 'q';
		char theValue = (char)(theCharacterA + addMeToChar);
		System.out.println("The mystery char is: " + theValue);
/*		char theCharAtValue = (char)theValue;
		System.out.println(theCharAtValue);*/
		System.out.println(String.valueOf(theCharacterA));
		
		int lowerCaseAsValue = lowerCaseA;
		System.out.println(lowerCaseAsValue);
		
		String myString = "";
		
		System.out.println("----------------");
		
		// Shorts 
		System.out.println("short min and max");
		short q = 5;
		short z = 5609;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.SIZE);
		
		System.out.println("----------------");
		
		// Bytes
		System.out.println("byte min and max");
		byte m = 5;
		// byte n = 569;
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.SIZE);
		
		int myIntVar = 'a';
		System.out.println(Integer.valueOf(myIntVar));
		
		
		Scanner s = new Scanner(System.in);
		String myInput = s.next();
		
		System.out.println("You typed in: " + Integer.valueOf(myInput));
		
		
		String myFloatInput = s.next();
		System.out.println("Yout typed in: " + Float.valueOf(myFloatInput));
		
		
		// Read a single char
		String myCharInput = s.next();
		char mySingleChar = myCharInput.charAt(0);
		System.out.println(Character.valueOf(mySingleChar));
		
		// Convert a char to an integer
		int charAsInt = mySingleChar;
		
		System.out.println(charAsInt);
		
		// Take a integer and get what character that represents
		int aNum = 110;
		char intAsChar = (char) aNum;
		
		// Doesn't need cast b/c the assignment of a int to a char
		// converts it implicitly
		char anotherIntAsChar = 105;
		
		System.out.println(intAsChar);
		System.out.println(anotherIntAsChar);
		
		// Close our scanner - Cleaning up resources is a must!
		s.close();
	}

}







