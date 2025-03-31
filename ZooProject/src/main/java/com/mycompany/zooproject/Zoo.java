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
    
    public Zoo() {
        mamals = new LinkedList<Mamal>();
    }
    
    
    public void AddMamal(Mamal mamal) {
        this.mamals.add(mamal);
    }
}
