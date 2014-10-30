import java.util.Random;


public class GridOfSumsAndAveragesHomeworkAnswer {

	public static void initArray(double[][] numbers) {
		Random random = new Random();

		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				numbers[row][col] = random.nextDouble() * 1000;
			}
		}
	}

	public static void printRow(double[] nums) {
		for (int col = 0; col < 4; col++) {
			System.out.format("  %12.4f", nums[col]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		double[][] numbers = new double[5][4];

		double[] totals = new double[4];
		double[] averages = new double[4];

		// initialization
		initArray(numbers);

		// calculate totals
		for (int row = 0; row < numbers.length; row++) {
			for (int col = 0; col < numbers[row].length; col++) {
				totals[col] += numbers[row][col];
			}
		}

		// calculate averages!!!
		for (int col = 0; col < 4; col++) {
			averages[col] = totals[col] / 5;
		}

		// print them out
		for (int row = 0; row < numbers.length; row++) {
			printRow(numbers[row]);
		}

		// print out column totals
		System.out.println();
		printRow(totals);
		printRow(averages);
	}

}