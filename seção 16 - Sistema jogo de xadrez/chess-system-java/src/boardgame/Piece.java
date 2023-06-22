package boardgame;

public abstract class Piece {
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

    public abstract boolean[][] possibleMoves();

    // hook method
    public boolean possibleMove(Position position) {
        return possibleMoves()[position.getRow()][position.getColumn()];
    }

    // check if the piece is locked
    public boolean isThereAnyPossibleMove() {
        boolean[][] mat = possibleMoves();
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat.length; j++) {
                if(mat[i][j]) {
                    return true;
                }
            }
        }
        return false; 
    }
}
