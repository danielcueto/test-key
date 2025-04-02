package com.mycompany.zooproject;

/**
 * La interfaz {@code Chiroptera} representa a los murciélagos, un orden de mamíferos
 * conocidos por su capacidad de vuelo, uso de ecolocalización, y hábitos nocturnos.
 * Esta interfaz extiende de las interfaces {@code Mammal}, {@code Fly} y {@code Walk},
 * proporcionando métodos específicos que simulan los comportamientos y características
 * de los murciélagos.
 * 
 * <p>Los murciélagos son mamíferos voladores que presentan una gran diversidad en sus
 * hábitos alimenticios (insectívoros, frugívoros, hematófagos) y tienen la capacidad
 * de ecolocalizarse para orientarse en la oscuridad.</p>
 * 
 * @author [Tu Nombre]
 */
public interface Chiroptera extends Mammal, Fly, Walk {

    /**
     * Método que simula la ecolocalización de un murciélago, un proceso mediante el cual
     * los murciélagos emiten ondas sonoras de ultrasonido para orientarse y localizar
     * presas en la oscuridad.
     * Este proceso es esencial para los murciélagos insectívoros y muchos otros
     * murciélagos que dependen de la ecolocalización para navegar.
     */
    void echolate();

    /**
     * Método que determina si el murciélago es nocturno, lo cual es común en la mayoría
     * de las especies. Los murciélagos son principalmente activos de noche.
     * 
     * @return {@code true} si el murciélago es nocturno, {@code false} si no lo es.
     */
    boolean isNoctural();

    /**
     * Método que simula la acción de un murciélago de colgarse cabeza abajo. Esta es
     * una característica única de los murciélagos, quienes descansan suspendidos
     * de las superficies con las patas traseras.
     */
    void hangUpsideDown();    
}
