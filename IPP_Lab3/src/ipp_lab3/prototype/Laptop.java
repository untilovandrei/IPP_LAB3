/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipp_lab3.prototype;

/**
 *
 * @author andrei
 */
public class Laptop extends Device{
    
    public Laptop(){
        this.type = "Laptop";
    }

    @Override
    void assamble() {
        System.out.println("I'm a "+type);
    }
}
