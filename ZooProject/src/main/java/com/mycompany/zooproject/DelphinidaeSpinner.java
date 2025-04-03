package com.mycompany.zooproject;

/**
 * La clase {@code DelphinidaeSpinner} representa un delfín girador, una implementación
 * concreta de la interfaz {@code Delphinidae}.
 * 
 */
public class DelphinidaeSpinner implements Delphinidae {

    @Override
    public void swim() {
        System.out.println("El delfín girador está nadando ágilmente en el océano.");
    }

    @Override
    public String getName() {
        return "Delfín Girador";
    }

    @Override
    public boolean hasHair() {
        return false; 
    }

    @Override
    public void drink() {
        System.out.println("El delfín girador está absorbiendo agua de su comida.");
    }

    @Override
    public void eat() {
        System.out.println("El delfín girador está comiendo peces pequeños y calamares.");
    }

    @Override
    public void speak() {
        System.out.println("El delfín girador emite clics y silbidos para comunicarse.");
    }

    @Override
    public void getAge() {
        System.out.println("El delfín girador tiene 6 años.");
    }

    @Override
    public void echolate() {
        System.out.println("El delfín girador utiliza la ecolocalización para localizar presas.");
    }

    @Override
    public void jumpOutOfWater() {
        System.out.println("El delfín girador realiza giros acrobáticos fuera del agua.");
    }

    @Override
    public boolean isSwimmingInPod() {
        return true; 
    }
}