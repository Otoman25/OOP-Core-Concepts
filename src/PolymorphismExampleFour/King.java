/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PolymorphismExampleFour;

/**
 *
 * @author grich
 */
public class King extends Piece {
    @Override
    public void move() {
        System.out.println("Moves 1 space in any direction, unless castling.");
    }
}
