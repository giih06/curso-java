package chess;

import boardgame.Board;
import boardgame.Piece;

public abstract class ChessPiece extends Piece {
    // attributes
    private Color color;

    // constructors
    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    // get
    public Color getColor() {
        return color;
    }    
}
