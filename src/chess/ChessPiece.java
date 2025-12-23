/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Board;
import boardgame.Piece;

/**
 *
 * @author danie
 */
public class ChessPiece extends Piece {
    
    private ChessColor color;

    public ChessPiece(ChessColor color, Board board) {
        super(board);
        this.color = color;
    }

    public ChessColor getColor() {
        return color;
    }
    
}
