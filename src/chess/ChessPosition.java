/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess;

import boardgame.Position;

/**
 *
 * @author danie
 */
public class ChessPosition {
    
    private Character column;
    private Integer row;

    public ChessPosition(Character column, Integer row) {
        boolean columnIsInvalid = column < 'a' || column > 'h';
        boolean rowIsInvalid = row < 1 || row > 8;
        if (columnIsInvalid || rowIsInvalid) {
            throw new ChessException("Error instantiating ChessPosition: Valid values are from a1 to h8");
        }
        this.column = column;
        this.row = row;
    }

    public Integer getRow() {
        return row;
    }

    public Character getColumn() {
        return column;
    }
    
    protected Position toPosition() {
        return new Position(8 - row, column - 'a');
    }
    
    protected static ChessPosition fromPosition(Position position) {
        return new ChessPosition((char)('a' - position.getColunm()), 8 - position.getRow());
    }
    
    @Override
    public String toString() {
        return "" + column + row;
    }
    
}
