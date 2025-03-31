/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

/**
 *
 * @author daniel.cueto
 */
public class ChiropteraNormalCreator extends ChiropteraFactory {

    @Override
    public Chiroptera CreateChiroptera() {
        return new ChiropteraNormal();
    }
    
}
