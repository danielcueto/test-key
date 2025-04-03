package com.mycompany.zooproject;

/**
 * La clase {@code SpheniscidaeEmperor} representa a un pingüino emperador, una implementación
 * concreta de la interfaz {@code Spheniscidae}.
 * 
 */
public class SpheniscidaeEmperor implements Spheniscidae {

    @Override
    public void swim() {
        System.out.println("El pingüino emperador está nadando ágilmente en el agua helada.");
    }

    @Override
    public void walk() {
        System.out.println("El pingüino emperador camina lentamente sobre el hielo.");
    }

    @Override
    public void slideOnBelly() {
        System.out.println("El pingüino emperador se desliza sobre su vientre para moverse rápidamente.");
    }

    @Override
    public void incubateEggs() {
        System.out.println("El pingüino emperador está incubando sus huevos en sus patas para mantenerlos calientes.");
    }

    @Override
    public boolean isInColony() {
        System.out.println("El pingüino emperador está en una colonia con otros pingüinos.");
        return true; // Los pingüinos emperadores suelen vivir en colonias.
    }

    @Override
    public void huntFish() {
        System.out.println("El pingüino emperador está cazando peces bajo el agua.");
    }

    @Override
    public String getName() {
        return "Pingüino Emperador";
    }

    @Override
    public boolean canFly() {
        return false; 
    }

    @Override
    public void buildNest() {
        System.out.println("El pingüino emperador no construye nidos, sino que protege sus huevos en sus patas.");
    }

    @Override
    public void layEggs() {
        System.out.println("El pingüino emperador pone un único huevo.");
    }

    @Override
    public void chirp() {
        System.out.println("El pingüino emperador emite un llamado característico para comunicarse con su pareja.");
    }

    @Override
    public void getAge() {
        System.out.println("El pingüino emperador tiene 10 años.");
    }
}