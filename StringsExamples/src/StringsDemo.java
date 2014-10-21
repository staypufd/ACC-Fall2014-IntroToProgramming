import java.util.Random;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class StringsDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String myString = "Hello, World!\nThe dog ran fast!";
		
		System.out.println(myString.concat(" - there are no people bigger than the world!"));
		
		
		int i = myString.lastIndexOf("o");
		System.out.println(i);
		
		int j = myString.indexOf("o");
		System.out.println(j);
		
		System.out.println(myString.substring(5, 7));
		
		System.out.println(myString.toLowerCase().endsWith("world!"));
		
		System.out.println(myString.toLowerCase());
		System.out.println(myString.toCharArray()[18]);
		
		System.out.println(myString.charAt(18));
		
		System.out.println(myString.contains("orl"));
		
		System.out.println(myString.indexOf("orl"));
		
		
		
		System.out.println("     ABCD\n qererqa     ");
		System.out.println("     ABCD\n qererqa     ".trim());
		
		if(myString.isEmpty()) {
			System.out.println("Feeling empty!");
		} else {
			System.out.println("So full of it!");
		}
		
		String myArrayPrintString = "12, 56, 78,";
		
		int lastIndexOfAComman = myArrayPrintString.lastIndexOf(",");
		if (myArrayPrintString.length() - 1 == lastIndexOfAComman) {
			System.out.println("The comma is at the end.");
			myArrayPrintString = myArrayPrintString.substring(0, myArrayPrintString.length() - 1);
		} else {
			System.out.println("All is good");
		}
		
		System.out.println(myArrayPrintString);
		
		double i1 = 461012.45778;
		System.out.format("The value of i1 is: %,16.3f%n", i1);
		
		System.out.println();
		
		for (int k = 0; k < 8; k++) {
			double localDouble = new Random().nextDouble() * 1000000000;
			double localDouble2 = new Random().nextDouble() * 1000000000;
			
			System.out.format("|%,16.3f", localDouble);
			System.out.format(" %,16.3f%n", localDouble2);
		}
	}

}
