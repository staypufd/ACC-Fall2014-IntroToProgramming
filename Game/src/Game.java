public class Game {
	// https://gist.github.com/orb/
	public static void main(String[] args) {
		char[][] board = new char[20][40];
		initBoard(board);

		int x      = 5;
		int y      = 5;
		int xspeed = 1;
		int yspeed = -1;

		while (board[x][y] == '.') {
			//board[x][y] = '*';

			if (xspeed == yspeed) {
			   board[x][y] = '\\';
			} else {
				board[x][y] = '/';
			}

			if (x<1) {
				xspeed = 1;
			} else if (x>=19) {
				xspeed = -1;
			}

			if (y<1) {
				yspeed = 1;
			} else if (y>=39) {
				yspeed = -1;
			}

			x = x + xspeed;
			y = y + yspeed;
		}

		printBoard(board);
	}

	private static void initBoard(char[][] board) {
		for (int i=0; i<20; i++) {
			for (int j=0; j<40; j++) {
				board[i][j] = '.';
			}
		}
	}

	private static void printBoard(char[][] board) {
		for (int i=0; i<20; i++) {
			for (int j=0; j<40; j++) {
				System.out.print(board[i][j]);
			}
			System.out.println();
		}
	}


}