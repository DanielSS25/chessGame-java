/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boardgame;

/**
 *
 * @author danie
 */
public class Position {
  
    private Integer row;
    private Integer colunm;

    public Position(Integer row, Integer colunm) {
        this.row = row;
        this.colunm = colunm;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getColunm() {
        return colunm;
    }

    public void setColunm(Integer collunm) {
        this.colunm = collunm;
    }
    
    @Override
    public String toString() {
        return row + ", " + colunm;
    }
    
}
