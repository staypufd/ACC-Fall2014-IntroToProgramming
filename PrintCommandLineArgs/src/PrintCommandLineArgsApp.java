import java.util.Scanner;


public class PrintCommandLineArgsApp {

	public static void main(String[] args) {
		
		printCommandLineArgs(args);

	}

	private static void printCommandLineArgs(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.print("Arg " + i + " is: " + args[i] + "\n");
		}
		
	}

}
