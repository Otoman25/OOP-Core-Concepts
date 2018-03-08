/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapsulationExampleTwo;

import EncapsulationExampleTwo.Dog;

/**
 *
 * @author grich
 */
public class main {
    public static void main(String[] args){
        
        Dog pingu = new Dog("Pingu"); //Create Pingu

        //System.out.println(“My name is “ + pingu.name); //If you uncomment this, an error will occur as we cannot directly access the name property

        System.out.println("My name is " + pingu.getName());

    }
}
