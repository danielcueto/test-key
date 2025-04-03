package com.mycompany.zooproject;

/**
 * La clase {@code ChiropteraNormalCreator} es una implementación concreta de la fábrica
 * {@code ChiropteraFactory}. Su propósito es crear instancias de {@code ChiropteraNormal}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method, proporcionando un método para
 * instanciar objetos específicos de {@code ChiropteraNormal}.
 */
public class ChiropteraNormalCreator extends ChiropteraFactory {

    /**
     * Crea y devuelve una nueva instancia de {@code ChiropteraNormal}.
     * 
     * @return una instancia de {@link ChiropteraNormal}.
     */
    @Override
    public Chiroptera createChiroptera() {
        return new ChiropteraNormal();
    }
    
}
