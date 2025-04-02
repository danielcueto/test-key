package com.mycompany.zooproject;

/**
 *
 * 
 */
public class DelphinidaeDusky implements Delphinidae {

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
    
}
