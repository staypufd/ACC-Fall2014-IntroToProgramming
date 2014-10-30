/**
 * 
 */


/**
 * @author javauser
 *
 */
public class BarChartDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		int arraySize = 10;
		double value[] = new double[arraySize];
		
		for (int i = 0; i < arraySize; i++) {
			value[i] = Math.random() * 10;
		}
		
		for (int i = 0; i < value.length; i++) {
			printBar(Math.round(value[i]));
		}
		
	}

	private static void printBar(long i) {
		String barString = "";
		for (int j = 0; j < i; j++) {
			barString += "*";
		}
		
		System.out.println(String.format("%-3s|%-20s", i, barString));
		
	}

}
