package boardgame;

public class Position {
	
	//Atributos
	private int row;
	private int colunm;

	
	//Metodos Especiais
	
	public Position(int row, int colunm) {
		this.row = row;
		this.colunm = colunm;
	}


	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColunm() {
		return colunm;
	}


	public void setColunm(int colunm) {
		this.colunm = colunm;
	}
	
	//Metodos
	
	@Override
	public String toString() {
		return row + ", " + colunm;
	}
	
	
}
