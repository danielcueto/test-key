package com.mycompany.zooproject;

/**
 * La interfaz {@code Mammal} define las características y comportamientos comunes
 * a todos los mamíferos. Cada implementación de esta interfaz debería proporcionar
 * comportamientos específicos para las acciones asociadas con los mamíferos,
 * como beber, comer, hablar, entre otros.
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
     * Método que simula la acción de beber agua del mamífero.
     */
    void drink();

    /**
     * Método que simula la acción de comer del mamífero.
     */
    void eat();

    /**
     * Método que simula la acción de hablar del mamífero.
     */
    void speak();
    
    /**
     * Obtiene la edad del mamífero.
     * 
     * @return la edad del mamífero en años.
     */
    void getAge();
}