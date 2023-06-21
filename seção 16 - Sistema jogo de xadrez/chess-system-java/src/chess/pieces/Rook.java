package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

    // constructor
    public Rook(Board board, Color color) {
        super(board, color);
    }   
    
    // tostring
    @Override
    public String toString() {
        return "R";
    }
    
}
