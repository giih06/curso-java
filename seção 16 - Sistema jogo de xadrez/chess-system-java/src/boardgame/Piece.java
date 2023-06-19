package boardgame;

public class Piece {
    // attributes
    protected Position position;
    private Board board;

    // constructors
    public Piece(Board board) {
        this.board = board;
        position = null;
    }  

    // only classes and subclasses within the same package will be able to access the one piece board
    protected  Board getBoard() {
        return board;
    }
    

    

}
