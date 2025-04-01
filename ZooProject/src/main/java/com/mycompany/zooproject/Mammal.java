/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.zooproject;

/**
 *
 * @author daniel.cueto
 */
public abstract class Mammal {
    protected String name;
    protected String gender;
    protected String species;

    public Mammal(String name, String gender, String species) {
        this.name = name;
        this.gender = gender;
        this.species = species;
    }

    public abstract void reproduce(Mammal partner);
}