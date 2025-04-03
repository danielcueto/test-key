package com.mycompany.zooproject;

/**
 * La clase {@code ChiropteraAlbino} representa un murciélago albino, una subclase de Chiroptera.
 * Este murciélago tiene características únicas como su coloración albina y hábitos nocturnos.
 */
public class ChiropteraAlbino implements Chiroptera {

    @Override
    public void fly() {
        System.out.println("El murciélago albino está volando silenciosamente.");
    }

    @Override
    public void walk() {
        System.out.println("El murciélago albino camina torpemente con sus patas.");
    }

    @Override
    public String getName() {
        return "Murciélago Albino";
    }

    @Override
    public boolean hasHair() {
        return true;
    }

    @Override
    public void drink() {
        System.out.println("El murciélago albino está bebiendo agua.");
    }

    @Override
    public void eat() {
        System.out.println("El murciélago albino está comiendo frutas.");
    }

    @Override
    public void speak() {
        System.out.println("El murciélago albino emite sonidos de ultrasonido.");
    }

    @Override
    public void getAge() {
        System.out.println("El murciélago albino tiene 5 años.");
    }

    @Override
    public void echolate() {
        System.out.println("El murciélago albino utiliza la ecolocalización para orientarse.");
    }

    @Override
    public boolean isNoctural() {
        return true;
    }

    @Override
    public void hangUpsideDown() {
        System.out.println("El murciélago albino está colgado cabeza abajo en una cueva.");
    }
}