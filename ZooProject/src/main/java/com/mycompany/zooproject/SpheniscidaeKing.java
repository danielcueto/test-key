package com.mycompany.zooproject;

/**
 * La clase {@code SpheniscidaeKing} representa a un pingüino rey, una implementación
 * concreta de la interfaz {@code Spheniscidae}.
 *
 */
public class SpheniscidaeKing implements Spheniscidae {

    @Override
    public void swim() {
        System.out.println("El pingüino rey está nadando elegantemente en el agua helada.");
    }

    @Override
    public void walk() {
        System.out.println("El pingüino rey camina con pasos lentos y firmes sobre el hielo.");
    }

    @Override
    public void slideOnBelly() {
        System.out.println("El pingüino rey se desliza sobre su vientre para moverse rápidamente.");
    }

    @Override
    public void incubateEggs() {
        System.out.println("El pingüino rey está incubando sus huevos en sus patas para mantenerlos calientes.");
    }

    @Override
    public boolean isInColony() {
        System.out.println("El pingüino rey está en una colonia con otros pingüinos.");
        return true;
    }

    @Override
    public void huntFish() {
        System.out.println("El pingüino rey está cazando peces bajo el agua.");
    }

    @Override
    public String getName() {
        return "Pingüino Rey";
    }

    @Override
    public boolean canFly() {
        return false;
    }

    @Override
    public void buildNest() {
        System.out.println("El pingüino rey no construye nidos, sino que protege sus huevos en sus patas.");
    }

    @Override
    public void layEggs() {
        System.out.println("El pingüino rey pone un único huevo.");
    }

    @Override
    public void chirp() {
        System.out.println("El pingüino rey emite un llamado característico para comunicarse con su pareja.");
    }

    @Override
    public void getAge() {
        System.out.println("El pingüino rey tiene 7 años.");
    }
}