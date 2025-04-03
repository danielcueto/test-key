package com.mycompany.zooproject;


/**
 * La clase abstracta {@code SpheniscidaeFactory} define una fábrica para crear instancias
 * de {@code Spheniscidae}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method, proporcionando un método abstracto
 * para crear instancias de {@code Spheniscidae}.
 */


public abstract class SpheniscidaeFactory {
    /**
     * Crea y devuelve una instancia de {@code Spheniscidae}.
     * 
     * @return una instancia de {@link Spheniscidae}.
     */
    public abstract Spheniscidae createSpheniscidae();
}
