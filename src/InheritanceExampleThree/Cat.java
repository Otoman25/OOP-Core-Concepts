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
public class Cat extends Animal {
    private String sName;

    public Cat(String name){
    // Runs constructor of Animal with these parameters
        super("Meow", 4); 
        sName = name;
    }
}

