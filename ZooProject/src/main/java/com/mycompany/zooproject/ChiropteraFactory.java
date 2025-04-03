package com.mycompany.zooproject;

/**
 * Clase abstracta que define una fábrica para crear instancias de Chiroptera
 * Siguiendo el patrón de diseño Factory Method.
 */
public abstract class ChiropteraFactory {
    /**
     * Crea una instancia de Chiroptera.
     * createChiroptera es el factory method que permite crear Chiroptera
     *
     * @return una instancia de {@link Chiroptera}.
     */
    public abstract Chiroptera createChiroptera();
}
