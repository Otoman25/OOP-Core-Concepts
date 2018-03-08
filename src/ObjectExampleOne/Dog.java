/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjectExampleOne;

/**
 *
 * @author grich
 */
public class Dog {
    //Dog definition
    public String sName; //Name property

    public Dog(String name){ //Constructor
        sName = name;
        System.out.println("Creating " + name);

    }
        public void bark(){ //Bark Method
        System.out.println("Woof!");
    }
}
