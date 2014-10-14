import java.util.Scanner;

/**
 * 
 */

/**
 * @author javauser
 *
 */
public class ControlStructuresDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
//		ifExample1();
//		ifElseExample2();
//		ifExample3(s);
//		ifExample4(s);
//		ifExample5(s);
//		identityExample(s);
//		switchExample(s);
//		switchExampleTwo(s);
//		ifCopyOfSwitchStatement(s);	
//		switchExampleWithStrings(s);
		switchExampleWithStringsTwo(s);
		
		
		s.close();
	}
	
	
	private static void ifExample1() {
		if ( returnABooleanValue() ) {
			System.out.println("Seven is greater than six!");
		}
	}
	
	private static boolean returnABooleanValue() {
		return 7 > 6;
	}
	
	// if test is true (true block) else if test is false (false block)
	private static void ifElseExample2() {
		// If test
		if ( returnABooleanValue() ) 
		{  // True block
			System.out.println("The test was true");
		} else {
			// False block
			System.out.println("The test was false");
		}
	}
	
	private static void ifExample3(Scanner s) {
		

		System.out.println("Enter a name: ");
		String theName = s.next();
		
		if ( theName.length() >= 5 ) {
			System.out.println(theName + " your name is " + theName.length() + " characters long");
		} else {
			System.out.println(theName + " is a very short name!");
		}
		
	}
	
	private static void ifExample4(Scanner s) {
		System.out.println("Enter your first name: ");
		String firstName = s.next();
		
		if (firstName.length() >= 5 ) {
			if (firstName.length() <= 10) {
				System.out.println("Your first name is medium length");
			} else {
				System.out.println("Your first name is long!");
			}
		} else {
			System.out.println("Your first name is short!");
		}
	}
	
	private static void ifExample5(Scanner s) {
		System.out.println("Enter your first name: ");
		String firstName = s.next();
		
		if (firstName.length() >= 5 ) {
			if (firstName.length() <= 10) {
				// firstName is >= 5 and <= 10
				System.out.println("Medium size first name");
			}
		}
		
		
		// Shorter version using some of our operators
		int stringLength = firstName.length();
		if ( (stringLength >= 5) && (stringLength <= 10) ) {
			System.out.println("Medium size first name");
		}
		
	}

	private static void identityExample(Scanner s) {
		String s1 = new String();
		s1 += "Sam";
		String s2 = "Sam";
		if (s1.equals(s2)) {
			System.out.println("Strings are the same.");
		} else {
			System.out.println("Strings are not the same");
		}
		
		String s3 = "Sam";
		String s4 = "Sam";
		if (s3 == s4) {
			System.out.println("Strings are the same.");
		} else {
			System.out.println("Strings are not the same");
		}
	}
	
	
	private static void switchExample(Scanner s) {
		
		System.out.println("What is the number of the day of the week (0-6)?:");
		int dayNum = s.nextInt();
		
		switch (dayNum) {
		case 0:
			System.out.println("It's Sunday");
			break;
		case 1:
			System.out.println("It's Monday");
			break;
		case 2:
			System.out.println("It's Tuesday");
			break;
		case 3:
			System.out.println("It's Wednesday");
			break;
		case 4:
			System.out.println("It's Thursday");
			break;
		case 5:
			System.out.println("It's Friday");
			break;
		case 6:
			System.out.println("It's Saturday");
			break;
		default:
			System.out.println("No day with that number");
			break;
		}
	}
	
	private static void switchExampleTwo(Scanner s) {
		
		System.out.println("What is the number of the day of the week (0-6)?:");
		int dayNum = s.nextInt();
		
		switch (dayNum) {
		case 0:
		case 1:
		case 2:
			System.out.println("Beginning of the Week");
			break;
		case 3:
			System.out.println("It's Hump Day");
			break;
		case 4:
		case 5:
			System.out.println("Weekend starts soon");
			break;
		case 6:
			System.out.println("It's the weekend");
			break;
		default:
			System.out.println("No day with that number");
			break;
		}
		
		System.out.println("La La");
	}
	
	private static void ifCopyOfSwitchStatement(Scanner s) {
		System.out.println("What is the number of the day of the week (0-6)?:");
		int dayNum = s.nextInt();
		
		if ( (dayNum >= 0) && (dayNum < 3)) {
			System.out.println("Beginning of the week");
		} else if ( (dayNum == 3) ) {
			System.out.println("It's Hump Day!");
		} else if ( (dayNum >= 4) && (dayNum <= 5) ) {
			System.out.println("Weekend's almost here");
		} else if ( dayNum == 6) {
			System.out.println("Its the weekend");
		} else {
			System.out.println("That's not a valid day number");
		}
		
		System.out.println("La La");
	}
	
	private static void switchExampleWithStrings(Scanner s) {
		System.out.println("Enter one of these names, Sam, Billy, Jean or Dwaine");
		String theName = s.next();
		
		switch (theName) {
		case "Sam":
			System.out.println("Howdy, Teach!");
			break;
		case "Billy":
			System.out.println("Howdy, Bill!");
			break;
		case "Jean":
			System.out.println("Howdy, little missy!");
			break;
		case "Dwaine":
			System.out.println("Howdy, Boss!");
			break;
		default:
			System.out.println("Don't remember you! Hmm?");
			break;
		}
	}
	
	
	private static void switchExampleWithStringsTwo(Scanner s) {
		
		int score = 0;
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter one of these names, Sam, Billy, Jean or Dwaine");
			String theName = s.next();
			switch (theName) {
			case "Sam":
			case "Billy":
				score += 50;
				break;
			case "Jean":
			case "Dwaine":
				score += 100;
				break;
			default:
				score += 0;
				break;
			}
		
		}
		
		System.out.println("The score is: " + score);
	}
}












