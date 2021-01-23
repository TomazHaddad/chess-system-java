package boardgame;

public class Piece {

	//Atributos
	protected Position position;
	private Board board;
	
	//Metodos Especiais
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	//Metodos
	
	
	
	
}
