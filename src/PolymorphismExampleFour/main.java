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
public class main {
    public static void main(String[] args) {
        Pawn pawnOne = new Pawn();
        King kingOne = new King();

        //Store both pawnOne and kingOne as Piece objects in the same array
        Piece[] gameboard = {pawnOne, kingOne};

        for(Piece piece : gameboard){
        //Iterate through gameboard and call move() function on each in the array
            piece.move();
        }
    }

}
