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
public class Dog extends Animal {
    private String sName;

    public Dog(String name){
    // Runs constructor of Animal with these parameters
        super("Woof", 4);
        sName = name;
    }
}
