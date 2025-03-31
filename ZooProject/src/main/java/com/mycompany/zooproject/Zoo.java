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
    List<Invertebrate> invertebrates;
    
    public Zoo() {
        mamals = new LinkedList<Mamal>();
        invertebrates = new LinkedList<Invertebrate>();
    }
    
    
    public void AddMamal(Mamal mamal) {
        this.mamals.add(mamal);
    }

    public void AddInvertebrate(Invertebrate invertebrate) {
        this.invertebrates.add(invertebrate);
    }
}
