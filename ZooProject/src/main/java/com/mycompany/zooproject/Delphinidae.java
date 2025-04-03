package com.mycompany.zooproject;


/**
 * La interfaz {@code Delphinidae} representa a los delfines.
 * Esta interfaz extiende de las interfaces {@code Mammal} y {@code Swim}, proporcionando
 * métodos específicos que simulan los comportamientos y características de los delfines.
 * 
 */
public interface Delphinidae extends Mammal, Swim {

    /**
     * Simula la ecolocalización de un delfín, un proceso mediante el cual
     * los delfines emiten sonidos para orientarse, comunicarse y localizar presas.
     */
    void echolate();

    /**
     * Simula el salto de un delfín fuera del agua.
     */
    void jumpOutOfWater();

    /**
     * Determina si el delfín está nadando en grupo.
     * 
     * @return {@code true} si el delfín está nadando en grupo, {@code false} si está solo.
     */
    boolean isSwimmingInPod();
}