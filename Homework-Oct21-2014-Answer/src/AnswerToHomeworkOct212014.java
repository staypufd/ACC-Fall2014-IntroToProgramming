/**
 * Answer to homework for Oct 21, 2014
 * https://github.com/staypufd/ACC-Fall2014-IntroToProgramming/wiki/Homework-Oct.-21st,-2014
 * 
 */

import java.util.Random;

public class AnswerToHomeworkOct212014 {

	public static void main(String[] args) {

		// Variable declarations
		Random random = new Random();
		double[][] numbers = new double[5][4];
		double[] totals = new double[4];
		double[] averages = new double[4];

		fillLedgerWithRandomNumbers(random, numbers);
		calcTotals(numbers, totals);
		calcAverages(totals, averages);
		printLedgerSheet(numbers, totals, averages);
		
		printTotalAndAverageAll(numbers, totals, averages);

	}

	private static void printTotalAndAverageAll(double[][] numbers,
			double[] totals, double[] averages) {
		
		
		double fullTotal = 0.0;
		for (int i = 0; i < totals.length; i++) {
			fullTotal += totals[i];
		}
		
		double fullAverage = 0.0;
		for (int i = 0; i < averages.length; i++) {
			fullAverage += averages[i];
		}
		
		System.out.println();
		System.out.println("+" + createDashStringOfSize(38)  + "+");
		System.out.format("| %-20s" , "Total All");
		System.out.format("%,16.4f |", fullTotal);
		System.out.println();
		System.out.format("| %-20s" , "Average All Columns");
		System.out.format("%,16.4f |", fullAverage);
		System.out.println();
		System.out.println("+" + createDashStringOfSize(38)  + "+");
		
	}
	
	private static String createDashStringOfSize(int size) {
		String theString = "";
		for (int i = 0; i < size; i++) {
			theString += "-";
		}
		
		return theString;
	}

	/**
	 * @param random
	 * @param numbers
	 */
	private static void fillLedgerWithRandomNumbers(Random random,
			double[][] numbers) {
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 1000 * random.nextDouble();

			}
		}
	}

	/**
	 * @param numbers
	 * @param totals
	 * @param averages
	 */
	private static void printLedgerSheet(double[][] numbers, double[] totals, double[] averages) {
		
		printHeaders();
		printDivider();
		printNumberGrid(numbers);
		printDivider();
		printTotals(totals);
		printAverages(averages);
	}

	private static void printHeaders() {
		String[] headerStrings = {"Col 1", "Col 2", "Col 3", "Col 4" };
		System.out.format("%8s", " ");
		for (int i = 0; i < headerStrings.length; i++) {
			System.out.format("%12s", headerStrings[i]);
		}
		System.out.println();
		
	}

	/**
	 * @param averages
	 */
	private static void printAverages(double[] averages) {
		// Print averages out//
		System.out.format("%-9s", "Col Avg.");
		for (int j = 0; j < 4; j++) {
			System.out.format("%,12.4f",  +averages[j]);
		}
		System.out.println();
	}

	/**
	 * @param totals
	 */
	private static void printTotals(double[] totals) {
		// Print total out//
		System.out.format("%-9s", "Col Total");
		for (int j = 0; j < 4; j++) {
			System.out.format("%,12.4f", totals[j]);
		}
		System.out.println();
	}

	/**
	 * 
	 */
	private static void printDivider() {
		String dividerString = "";
		for (int i = 0; i < 9; i++) {
			dividerString += " ";
		}
		for (int i = 0; i < 52; i++) {
			dividerString += "-";
		}
		System.out.println(dividerString);
	}

	/**
	 * @param numbers
	 */
	private static void printNumberGrid(double[][] numbers) {
		// Print array out//
		for (int i = 0; i < numbers.length; i++) {
			System.out.format("%9s", " ");
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.format("%,12.4f",  numbers[i][j]);
			}
			System.out.println();
		}
	}

	/**
	 * @param totals
	 * @param averages
	 */
	private static void calcAverages(double[] totals, double[] averages) {
		// Calculate averages//

		for (int j = 0; j < 4; j++) {
			averages[j] = totals[j] / 5;

		}
	}

	/**
	 * @param numbers
	 * @param totals
	 */
	private static void calcTotals(double[][] numbers, double[] totals) {
		// calculate total totals//
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				totals[j] += numbers[i][j];
			}
		}
	}

}