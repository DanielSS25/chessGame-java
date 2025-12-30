/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chess.pieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

/**
 *
 * @author danie
 */
public class Pawn extends ChessPiece {
    
    private ChessMatch chessMatch;

    public Pawn(Color color, Board board, ChessMatch chessMatch) {
        super(color, board);
        this.chessMatch = chessMatch;
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        
        Position p = new Position(0, 0);
        
        if (getColor() == Color.WHITE) {
            p.setValues(position.getRow() - 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() - 2, position.getColunm());
            Position p2 = new Position(position.getRow() - 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() - 1, position.getColunm() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() - 1, position.getColunm() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            // # special move en passant white
            if (position.getRow() == 3) {
                Position left = new Position(position.getRow(), position.getColunm() - 1);
                if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
                    mat[left.getRow() - 1][left.getColunm()] = true;
                }
                Position right = new Position(position.getRow(), position.getColunm() + 1);
                if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
                    mat[right.getRow() - 1][right.getColunm()] = true;
                }
            }
            
        }
        else {
            p.setValues(position.getRow() + 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() + 2, position.getColunm());
            Position p2 = new Position(position.getRow() + 1, position.getColunm());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() + 1, position.getColunm() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            p.setValues(position.getRow() + 1, position.getColunm() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColunm()] = true;
            }
            
            // # special move en passant black
            if (position.getRow() == 4) {
                Position left = new Position(position.getRow(), position.getColunm() - 1);
                if (getBoard().positionExists(left) && isThereOpponentPiece(left) && getBoard().piece(left) == chessMatch.getEnPassantVulnerable()) {
                    mat[left.getRow() + 1][left.getColunm()] = true;
                }
                Position right = new Position(position.getRow(), position.getColunm() + 1);
                if (getBoard().positionExists(right) && isThereOpponentPiece(right) && getBoard().piece(right) == chessMatch.getEnPassantVulnerable()) {
                    mat[right.getRow() + 1][right.getColunm()] = true;
                }
            }
        }
        
        return mat;
    }
    
    @Override
    public String toString() {
        return "P";
    }
    
}
