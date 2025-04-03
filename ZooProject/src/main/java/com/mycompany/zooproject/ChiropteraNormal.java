package com.mycompany.zooproject;

/**
 * La clase {@code ChiropteraNormal} representa un murciélago común, una implementación
 * concreta de la interfaz {@code Chiroptera}.
 * 
 */
public class ChiropteraNormal implements Chiroptera {

    @Override
    public void fly() {
        System.out.println("El murciélago normal está volando.");
    }

    @Override
    public void walk() {
        System.out.println("El murciélago normal camina con sus patas.");
    }

    @Override
    public void echolate() {
        System.out.println("El murciélago normal utiliza la ecolocalización para orientarse.");
    }

    @Override
    public boolean isNoctural() {
        return true;
    }

    @Override
    public void hangUpsideDown() {
        System.out.println("El murciélago normal está colgado cabeza abajo.");
    }

    @Override
    public String getName() {
        return "Murciélago Normal";
    }

    @Override
    public boolean hasHair() {
        return true;
    }

    @Override
    public void drink() {
        System.out.println("El murciélago normal está bebiendo agua.");
    }

    @Override
    public void eat() {
        System.out.println("El murciélago normal está comiendo insectos.");
    }

    @Override
    public void speak() {
        System.out.println("El murciélago normal emite sonidos de ultrasonido.");
    }

    @Override
    public void getAge() {
        System.out.println("El murciélago normal tiene 3 años.");
    }
}