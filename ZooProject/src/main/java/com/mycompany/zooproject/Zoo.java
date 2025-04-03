package com.mycompany.zooproject;

import java.util.LinkedList;
import java.util.List;

/**
 * La clase {@code Zoo} representa un zoológico que administra diferentes tipos de animales.
 * Proporciona métodos para agregar y listar mamíferos, peces, invertebrados y aves.
 */
public class Zoo {

    // Listas privadas para almacenar los animales
    private final List<Mammal> mammals = new LinkedList<>();
    private final List<Fish> fishes = new LinkedList<>();
    private final List<Invertebrate> invertebrates = new LinkedList<>();
    private final List<Bird> birds = new LinkedList<>();

    /**
     * Agrega un mamífero al zoológico.
     * 
     * @param mammal el mamífero a agregar.
     * @throws IllegalArgumentException si el mamífero es nulo.
     */
    public void addMammal(Mammal mammal) {
        if (mammal == null) {
            throw new IllegalArgumentException("El mamífero no puede ser nulo.");
        }
        mammals.add(mammal);
    }

    /**
     * Agrega un pez al zoológico.
     * 
     * @param fish el pez a agregar.
     * @throws IllegalArgumentException si el pez es nulo.
     */
    public void addFish(Fish fish) {
        if (fish == null) {
            throw new IllegalArgumentException("El pez no puede ser nulo.");
        }
        fishes.add(fish);
    }

    /**
     * Agrega un ave al zoológico.
     * 
     * @param bird el ave a agregar.
     * @throws IllegalArgumentException si el ave es nula.
     */
    public void addBird(Bird bird) {
        if (bird == null) {
            throw new IllegalArgumentException("El ave no puede ser nula.");
        }
        birds.add(bird);
    }

    /**
     * Agrega un invertebrado al zoológico.
     * 
     * @param invertebrate el invertebrado a agregar.
     * @throws IllegalArgumentException si el invertebrado es nulo.
     */
    public void addInvertebrate(Invertebrate invertebrate) {
        if (invertebrate == null) {
            throw new IllegalArgumentException("El invertebrado no puede ser nulo.");
        }
        invertebrates.add(invertebrate);
    }

    /**
     * Obtiene la lista de mamíferos en el zoológico.
     * 
     * @return una lista de mamíferos.
     */
    public List<Mammal> getMammals() {
        return mammals;
    }

    /**
     * Obtiene la lista de peces en el zoológico.
     * 
     * @return una lista de peces.
     */
    public List<Fish> getFishes() {
        return fishes;
    }

    /**
     * Obtiene la lista de aves en el zoológico.
     * 
     * @return una lista de aves.
     */
    public List<Bird> getBirds() {
        return birds;
    }

    /**
     * Obtiene la lista de invertebrados en el zoológico.
     * 
     * @return una lista de invertebrados.
     */
    public List<Invertebrate> getInvertebrates() {
        return invertebrates;
    }

    /**
     * Lista todos los animales del zoológico.
     */
    public void listAllAnimals() {
        System.out.println("Mamíferos:");
        mammals.forEach(mammal -> System.out.println(mammal.getName()));

       //  System.out.println("Peces:");
       // fishes.forEach(fish -> System.out.println(fish.getName()));

        System.out.println("Aves:");
        birds.forEach(bird -> System.out.println(bird.getName()));

        System.out.println("Invertebrados:");
        invertebrates.forEach(invertebrate -> System.out.println(invertebrate.getName()));
    }
}