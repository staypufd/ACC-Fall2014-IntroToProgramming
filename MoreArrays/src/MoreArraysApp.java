
public class MoreArraysApp {

	public static void main(String[] args) {
		String[][] a = new String[10][10];
			
		a[3][2] = "Sam";
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j]);
					System.out.print(", ");
				}
			System.out.println();
			}
			
		}

}
