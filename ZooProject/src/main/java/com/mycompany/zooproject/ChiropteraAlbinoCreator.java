package com.mycompany.zooproject;

/**
 * La clase {@code ChiropteraAlbinoCreator} es una implementación concreta de la fábrica
 * {@code ChiropteraFactory}. Su propósito es crear instancias de {@code ChiropteraAlbino}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method, proporcionando un método para
 * instanciar objetos específicos de {@code ChiropteraAlbino}.
 */
public class ChiropteraAlbinoCreator extends ChiropteraFactory {

    /**
     * Crea y devuelve una nueva instancia de {@code ChiropteraAlbino}.
     * 
     * @return una instancia de {@link ChiropteraAlbino}.
     */
    @Override
    public Chiroptera createChiroptera() {
        return new ChiropteraAlbino();
    }
    
}
