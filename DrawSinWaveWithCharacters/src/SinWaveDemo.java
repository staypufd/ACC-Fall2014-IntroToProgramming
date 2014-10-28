/**
 * 
 */

/**
 * @author javauser
 *
 */
public class SinWaveDemo {

	static double sinValues[] = new double[16];
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createSinWave(sinValues);
		printSinWave(sinValues);
	}

	public static void createSinWave(double[] sinArray)
	{
		int x = 0;
		for (double i = 0; i < 2 * Math.PI; i+=Math.PI / 8) {
			sinArray[x] = Math.sin(i);
			x++;
		}
	}
	
	public static void printSinWave(double[] sinArray)
	{
		for (int j = 0; j < sinValues.length; j++) {
			// System.out.println(sinArray[j]);
			
			createSinAstricks(j, sinArray);
			
		}
	}
	
	private static void createSinAstricks(int index, double[] sinArray)
	{
		String sinString = "";
		for (int i = 0; i < sinValues.length; i++) {
			long numAstricks = Math.round(sinArray[i] * 10);
			// System.out.println(numAstricks);
			printOneLine(numAstricks);
		}
		
	}
	
	
	private static void printOneLine(long numAstricks)
	{
		// Sin less than zero, greater than zero and equal zero
		if(numAstricks < 0) {
			String s = "";
			for (int i = 0; i >= numAstricks; i--) {
				s += "*";
			}
			s+= "|";
			System.out.println(String.format("%12s", s));
		} else if(numAstricks > 0) {
			for (int i = 0; i <= 10; i++) {
				System.out.print(" ");
			}
			System.out.print("|");
			for (int i = 0; i <= numAstricks; i++) {
				System.out.print("*");
			}
			System.out.println();
		} else if(numAstricks == 0) {
			for (int i = 0; i <= 10; i++) {
				System.out.print(" ");
			}
			System.out.println("|");
		}
	}
}
