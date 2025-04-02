/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

/**
 *
 * @author daniel.cueto
 */
public class ChiropteraNormal implements Chiroptera {

    @Override
    public void breath(String type) {
        System.out.println("I'm breathing...");
    }

    @Override
    public void feed(String food) {
        System.out.println("I'm feeding..." + food);
    }

    @Override
    public void fly() {
        System.out.println("I'm flying...");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking...");
    }
    
}
