/**
 *
 */
/**
 * @author javauser
 *
 */
public class HomeWorkMakeUp {
	public static void main(String[] args) {
		/**
		 * @param args
		 **/



		Object[][] aryNumbers1 = new Object[5][5];
		aryNumbers1[0][0] = 10;
		aryNumbers1[0][1] = 12;
		aryNumbers1[0][2] = 43;
		aryNumbers1[0][3] = 11;
		aryNumbers1[0][4] = 22;

		aryNumbers1[1][0] = 20;
		aryNumbers1[1][1] = 45;
		aryNumbers1[1][2] = 56;
		aryNumbers1[1][3] = 1;
		aryNumbers1[1][4] = 33;

		// This puts the value 5 at array position 1, 1
		int j = 1;
		int i = 1;
		aryNumbers1[i][j] = 5;

		int rows = 5;
		int columns = 5;
		for (int x = 0; x < rows; x++) {

			for (int y = 0; y < columns; y++) {
				System.out.print(aryNumbers1[x][y]);
				System.out.print(" ");
			}

			System.out.println(" ");

		}

	}
}