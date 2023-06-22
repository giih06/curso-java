package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

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
    
    protected boolean isThereOpponentPiece(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
