package com.mycompany.zooproject;

/**
 * La clase abstracta {@code DelphinidaeFactory} define una fábrica para crear instancias
 * de {@code Delphinidae}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method.
 */
public abstract class DelphinidaeFactory {

    /**
     * Crea y devuelve una instancia de {@code Delphinidae}.
     * 
     * @return una instancia de {@link Delphinidae}.
     */
    public abstract Delphinidae createDelphindae();
}