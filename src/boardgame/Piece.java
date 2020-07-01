package boardgame;

import boardgame.Board;
import boardgame.Position;

	public class Piece {
	
		protected Position position;
		private Board board;
		
		public Piece(Board board) {
			this.board = board;
			position = null; // por padr�o no java ele entende como null, mas s� para entender colocamos assim
		}
	
		protected Board getBoard() {
			return board;
		}

	
}
