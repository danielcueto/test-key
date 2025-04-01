/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel.cueto
 */
public class Zoo {
    
    List<Mamal> mamals;
    List<Bird> birds;
    
    
    public Zoo() {
        mamals = new LinkedList<Mamal>();
        birds = new LinkedList<Bird>();
    }
    
    
    public void AddMamal(Mamal mamal) {
        this.mamals.add(mamal);
    }
    
    public void AddBird(Bird bird) {
        this.birds.add(bird);
    }
}
