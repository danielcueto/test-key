package com.mycompany.zooproject;

/**
 * La clase {@code DelphinidaeSpinnerCreator} es una implementación concreta de la fábrica
 * {@code DelphinidaeFactory}. Su propósito es crear instancias de {@code DelphinidaeSpinner}.
 * 
 */
public class DelphinidaeSpinnerCreator extends DelphinidaeFactory {

    /**
     * Crea y devuelve una nueva instancia de {@code DelphinidaeSpinner}.
     * 
     * @return una instancia de {@link DelphinidaeSpinner}.
     */
    @Override
    public Delphinidae createDelphindae() {
        return new DelphinidaeSpinner();
    }
    
}