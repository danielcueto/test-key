package com.mycompany.zooproject;

/**
 * La clase {@code DelphinidaeDuskyCreator} es una implementación concreta de la fábrica
 * {@code DelphinidaeFactory}. Su propósito es crear instancias de {@code DelphinidaeDusky}.
 * 
 */
public class DelphinidaeDuskyCreator extends DelphinidaeFactory {

    /**
     * Crea y devuelve una nueva instancia de {@code DelphinidaeDusky}.
     * 
     * @return una instancia de {@link DelphinidaeDusky}.
     */
    @Override
    public Delphinidae createDelphindae() {
        return new DelphinidaeDusky();
    }
}