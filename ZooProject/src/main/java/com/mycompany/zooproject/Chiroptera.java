package com.mycompany.zooproject;

/**
 * La interfaz {@code Chiroptera} representa a los murciélagos, un orden de mamíferos
 * conocidos por su capacidad de vuelo, uso de ecolocalización, y hábitos nocturnos.
 * Esta interfaz extiende de las interfaces {@code Mammal}, {@code Fly} y {@code Walk},
 * proporcionando los comportamientos y características
 * de los murciélagos.
 * 
 */
public interface Chiroptera extends Mammal, Fly, Walk {

    /**
     * Simula la ecolocalización de un murciélago, un proceso mediante el cual
     * los murciélagos emiten ondas sonoras de ultrasonido para orientarse y localizar
     * presas en la oscuridad.
     */
    void echolate();

    /**
     * Determina si el murciélago es nocturno
     * 
     * @return {@code true} si el murciélago es nocturno, {@code false} si no lo es.
     */
    boolean isNoctural();

    /**
     * Simula la acción de un murciélago de colgarse cabeza abajo
     */
    void hangUpsideDown();    
}
