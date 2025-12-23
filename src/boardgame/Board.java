/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author danie
 */
public class Board {
    
    private Integer rows;
    private Integer collumns;
    private Piece[][] pieces;

    public Board(Integer rows, Integer collumns) {
        this.rows = rows;
        this.collumns = collumns;
        pieces = new Piece[rows][collumns];
    }

    public Integer getRows() {
        return rows;
    }

    public void setRows(Integer rows) {
        this.rows = rows;
    }

    public Integer getCollumns() {
        return collumns;
    }

    public void setCollumns(Integer collumns) {
        this.collumns = collumns;
    }
    
}
