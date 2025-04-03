package com.mycompany.zooproject;

/**
 * La interfaz {@code Bird} define las características y comportamientos comunes
 * a todas las aves.
 * 
 */
public interface Bird {

    /**
     * Obtiene el nombre del ave.
     * 
     * @return el nombre del ave como una cadena de texto.
     */
    String getName();

    /**
     * Verifica si el ave puede volar.
     * 
     * @return {@code true} si el ave puede volar, {@code false} si no puede.
     */
    boolean canFly();

    /**
     * Simula la acción de construir un nido por parte del ave.
     */
    void buildNest();

    /**
     * Simula la acción de poner huevos.
     */
    void layEggs();

    /**
     * Simula la accion de chillar, cantar, comunicarse.
     */
    void chirp();

    /**
     * Obtiene la edad del ave.
     * 
     * @return la edad del ave en años.
     */
    void getAge();
}