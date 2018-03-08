/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceExampleThree;

/**
 *
 * @author grich
 */
public class Animal {
    private int iNumberOfLegs = 0;
    private String sSound;

    //Constructor sets Animal.sSound property
    public Animal(String sound, int noOfLegs) { 
        sSound = sound;
        iNumberOfLegs = noOfLegs;
    }

    public void makeSound() {
        System.out.println(sSound);
    }
}

