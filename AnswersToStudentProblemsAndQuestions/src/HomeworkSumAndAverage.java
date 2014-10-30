import java.util.Random;

public class HomeworkSumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		double[][] numbers = new double[5][4];

		double[] totals = new double[4];
		double[] averages = new double[4];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				numbers[i][j] = 1000 * random.nextDouble();

			}
		}
		// calculate total totals//
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				totals[j] += numbers[i][j];
			}
		}

		// Calculate averages//

		for (int j = 0; j < 4; j++) {
			averages[j] = totals[j] / 5;

		}

		// Print array out//
		for (int i = 0; i < numbers.length; i++) {
			System.out.format("%15s", " ");
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.format("%12.4f",  numbers[i][j]);
			}
			System.out.println();
		}

		String dividerString = "";
		for (int i = 0; i < 70; i++) {
			dividerString += "-";
		}
		System.out.format("%60s", dividerString);
		System.out.println();
		System.out.format("%15s", "Totals:");
		// Print total out//
		for (int j = 0; j < 4; j++) {
			System.out.format("%12.4f", totals[j]);
		}
		System.out.println();


		// Print averages out//
		System.out.format("%15s", "Averages: ");
		for (int j = 0; j < 4; j++) {
			System.out.format("%12.4f",  +averages[j]);
		}

	}

}