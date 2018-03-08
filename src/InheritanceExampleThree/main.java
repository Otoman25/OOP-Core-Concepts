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
public class main {
    public static void main(String[] args){
        Dog pingu = new Dog("Pingu"); //Create Pingu
        Cat garfield = new Cat("Garfield"); // Create Garfield

        pingu.makeSound(); //Outputs “Woof”
        garfield.makeSound(); //Outptus “Meow”
    }

}
