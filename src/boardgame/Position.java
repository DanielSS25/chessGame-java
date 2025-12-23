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
    private Integer collunm;

    public Position(Integer row, Integer collunm) {
        this.row = row;
        this.collunm = collunm;
    }

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Integer getCollunm() {
        return collunm;
    }

    public void setCollunm(Integer collunm) {
        this.collunm = collunm;
    }
    
    @Override
    public String toString() {
        return row + ", " + collunm;
    }
    
}
