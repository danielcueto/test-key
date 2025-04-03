package com.mycompany.zooproject;

/**
 * La interfaz {@code Mammal} define las características y comportamientos comunes
 * a todos los mamíferos.
 * 
 */
public interface Mammal {
     /**
     * Obtiene el nombre del mamífero.
     * 
     * @return el nombre del mamífero como una cadena de texto.
     */
    String getName();

    
    /**
     * Verifica si el mamífero tiene pelo o pelaje.
     * 
     * @return {@code true} si el mamífero tiene pelo, {@code false} si no lo tiene.
     */
    boolean hasHair();

    /**
     * Simula la acción de beber agua del mamífero.
     */
    void drink();

    /**
     * Simula la acción de comer del mamífero.
     */
    void eat();

    /**
     * Simula la acción de hablar del mamífero.
     */
    void speak();
    
    /**
     * Obtiene la edad del mamífero.
     * 
     * @return la edad del mamífero en años.
     */
    void getAge();
}