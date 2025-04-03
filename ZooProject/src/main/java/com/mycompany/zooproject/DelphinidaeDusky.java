package com.mycompany.zooproject;

/**
 * La clase {@code DelphinidaeDusky} representa un delfín oscuro, una implementación
 * concreta de la interfaz {@code Delphinidae}.
 * 
 */
public class DelphinidaeDusky implements Delphinidae {

    @Override
    public void swim() {
        System.out.println("El delfín oscuro está nadando rápidamente en el océano.");
    }

    @Override
    public String getName() {
        return "Delfín Oscuro";
    }

    @Override
    public boolean hasHair() {
        return false;
    }

    @Override
    public void drink() {
        System.out.println("El delfín oscuro está absorbiendo agua de su comida.");
    }

    @Override
    public void eat() {
        System.out.println("El delfín oscuro está comiendo peces pequeños.");
    }

    @Override
    public void speak() {
        System.out.println("El delfín oscuro emite clics y silbidos para comunicarse.");
    }

    @Override
    public void getAge() {
        System.out.println("El delfín oscuro tiene 8 años.");
    }

    @Override
    public void echolate() {
        System.out.println("El delfín oscuro utiliza la ecolocalización para localizar presas.");
    }

    @Override
    public void jumpOutOfWater() {
        System.out.println("El delfín oscuro salta fuera del agua en un espectáculo impresionante.");
    }

    @Override
    public boolean isSwimmingInPod() {
        return true; // Los delfines oscuros suelen nadar en grupo.
    }
}