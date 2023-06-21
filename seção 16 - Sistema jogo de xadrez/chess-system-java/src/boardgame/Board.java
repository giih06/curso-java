package boardgame;

public class Board {
    // attributes
    private int rows;
    private int columns;
    private Piece[][] pieces;

    // constructors
    public Board(int rows, int columns) {
        if(rows < 1 || columns < 1) {
            throw new BoardExeption("Error creating board: there must be at least 1 row and 1 column");
        }
        this.rows = rows;
        this.columns = columns;
        pieces = new Piece[rows][columns];
    }

    // getters and setters
    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    // methods

    public Piece piece(int row, int column) {
        if(!positionExists(row, column)) {
            throw new BoardExeption("Position not on the board");
        }
        return pieces[row][column];
    }

    public Piece piece(Position position) {
        if(!positionExists(position)) {
            throw new BoardExeption("Position not on the board");
        }
        return pieces[position.getRow()][position.getColumn()];
    }

    // this methos place the piece where the users choose
    public void placePiece(Piece piece, Position position) {
        if(thereIsAPiece(position)) {
            throw new BoardExeption("There is already a piece on position" + position);
        }
        pieces[position.getRow()][position.getColumn()] = piece;
    }

    // this position exists or not
    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    // auxiliary method
    public boolean positionExists(int row, int column) {
        return row >= 0 && row < rows && column >= 0 && column < columns;
    }

    // testing if there is a piece
    public boolean thereIsAPiece(Position position) {
        if(!positionExists(position)) {
            throw new BoardExeption("Position not on the board");
        }
        return piece(position) != null;
    }
    

    
}
