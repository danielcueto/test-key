package com.mycompany.zooproject;

/**
 *
 * 
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
