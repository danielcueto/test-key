package com.mycompany.zooproject;

/**
 * La interfaz {@code Spheniscidae} representa a los pingüinos. Comportamientos y características únicas de los pingüinos.
 */
public interface Spheniscidae extends Bird, Swim, Walk {

    /**
     * Simula el deslizamiento del pingüino sobre su vientre en el hielo.
     */
    void slideOnBelly();

    /**
     * Simula la acción de un pingüino incubando sus huevos.
     */
    void incubateEggs();

    /**
     * Método que verifica si el pingüino está en una colonia.
     * 
     * @return {@code true} si el pingüino está en una colonia, {@code false} si está solo.
     */
    boolean isInColony();

    /**
     * Simula la acción de un pingüino cazando peces bajo el agua.
     */
    void huntFish();
}