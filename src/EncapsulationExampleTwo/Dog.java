/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EncapsulationExampleTwo;

/**
 *
 * @author grich
 */
public class Dog { 
    //Dog definition
    private String sName; //Name property

    public Dog(String name){ //Constructor
    sName = name;
        System.out.println("Creating " + name);
    }
    public String getName(){
        return sName;
    }
}

