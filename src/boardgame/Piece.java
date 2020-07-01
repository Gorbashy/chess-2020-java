package boardgame;

import boardgame.Board;
import boardgame.Position;

	public class Piece {
	
		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			position = null; // por padrão no java ele entende como null, mas só para entender colocamos assim
		}
	
		protected Board getBoard() {
			return board;
		}

	
}
