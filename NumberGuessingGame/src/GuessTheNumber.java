import java.util.Random;
import java.util.Scanner;

/**
 * Guess the number game.  Player enters a number between 1 and 10 and
 * the computer gets three guesses to find the number.
 */

/**
 * @author javauser
 *
 */
public class GuessTheNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		gameLoop(s);

		s.close();
		System.out.println("Goodbye!");

	}

	private static void gameLoop(Scanner s) {
		String theChoice = "";

		do {
			showMenu();
			theChoice = readMenuChoice(s);
			if (theChoice.equalsIgnoreCase("Play")) {
				playGame(s);
			}
		} while (theChoice != "Quit");

	}

	private static void playGame(Scanner s) {
		System.out.println("playing game");
		
		int inputNum = 0;
		do {
			System.out.println("Type in a integer between 1 and 10 and I'll guess it in 2 tries.");
			inputNum = s.nextInt();
		} while ( (inputNum < 1) || (inputNum > 10) );

		int tries = 3;
		int randomGuess = -1;
		int previousGuess = randomGuess;
		
		while (tries > 0) {
			tries -= 1;
			randomGuess = new Random().nextInt(10) + 1;
			while (previousGuess == randomGuess) {
				System.out.println("------");
				randomGuess = new Random().nextInt(10) + 1;
			}
			System.out.println("Computer guesses: " + randomGuess);
			if (randomGuess == inputNum) {
				System.out.println("Computer Wins! Your number was: "
						+ randomGuess);
				return;
			}
			previousGuess = randomGuess;
		}

		System.out.println("You win!");
	}

	private static String readMenuChoice(Scanner s) {

		String choice = "None";

		do {
			String playOrQuitChoice = s.next();
			switch (playOrQuitChoice) {
			case "Y":
			case "y":
				System.out.println("Great, lets play!");
				choice = "Play";
				break;
			case "Q":
			case "q":
				System.out.println("Thanks for playing");
				choice = "Quit";
				break;
			default:
				System.out.println("I don't understand " + playOrQuitChoice);
				System.out.println("Please type 'Y' or 'Q'");
				break;
			}
		} while ((!choice.equalsIgnoreCase("Play"))
				&& (!choice.equalsIgnoreCase("Quit")));

		return choice;

	}

	private static void showMenu() {
		System.out.println("**********************************************");
		System.out.println("************** Guess the Number **************");
		System.out.println("**********************************************");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Enter Y to play a game or Q to quit!");
	}


}
