package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{

	//Atributos
	private Color color;
	
	
	//Metodos Especiais
	
	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	
	
}
