/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author danie
 */
public class Knight extends ChessPiece {

    public Knight(Color color, Board board) {
        super(color, board);
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        p.setValues(position.getRow() - 1, position.getColunm() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        p.setValues(position.getRow() - 2, position.getColunm() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        p.setValues(position.getRow() - 2, position.getColunm() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        p.setValues(position.getRow() - 1, position.getColunm() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        // nw
        p.setValues(position.getRow() + 1, position.getColunm() + 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        // ne
        p.setValues(position.getRow() + 2, position.getColunm() + 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        // sw
        p.setValues(position.getRow() + 2, position.getColunm() - 1);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        // se
        p.setValues(position.getRow() + 1, position.getColunm() - 2);
        if (getBoard().positionExists(p) && canMove(p)) {
            mat[p.getRow()][p.getColunm()] = true;
        }
        
        return mat;
    }
    
    private boolean canMove(Position position) {
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }
    
    @Override
    public String toString() {
        return "N";
    }
    
}
