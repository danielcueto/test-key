package com.mycompany.zooproject;

/**
 * La clase {@code SpheniscidaeKingCreator} es una implementación concreta de la fábrica
 * {@code SpheniscidaeFactory}. Su propósito es crear instancias de {@code SpheniscidaeKing}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method, proporcionando un método para
 * instanciar objetos específicos de {@code SpheniscidaeKing}.
 */
public class SpheniscidaeKingCreator extends SpheniscidaeFactory {

    /**
     * Crea y devuelve una nueva instancia de {@code SpheniscidaeKing}.
     * 
     * @return una instancia de {@link SpheniscidaeKing}.
     */
    @Override
    public Spheniscidae createSpheniscidae() {
        return new SpheniscidaeKing();
    }
    
}
