package com.mycompany.zooproject;

/**
 *
 * 
 */
public class SpheniscidaeKing implements Spheniscidae {

    @Override
    public void breath(String type) {
        System.out.println("I'm breathing...");
    }

    @Override
    public void feed(String food) {
        System.out.println("I'm feeding..." + food);
    }

    @Override
    public void swim() {
        System.out.println("I'm swimming...");
    }

    @Override
    public void walk() {
        System.out.println("I'm walking...");
    }
    
}
