package com.mycompany.zooproject;

/**
 * La clase {@code SpheniscidaeEmperorCreator} es una implementación concreta de la fábrica
 * {@code SpheniscidaeFactory}. Su propósito es crear instancias de {@code SpheniscidaeEmperor}.
 * 
 * Esta clase sigue el patrón de diseño Factory Method, proporcionando un método para
 * instanciar objetos específicos de {@code SpheniscidaeEmperor}.
 */
public class SpheniscidaeEmperorCreator extends SpheniscidaeFactory {
    
    /**
     * Crea y devuelve una nueva instancia de {@code SpheniscidaeEmperor}.
     * 
     * @return una instancia de {@link SpheniscidaeEmperor}.
     */
    @Override
    public Spheniscidae createSpheniscidae() {
        return new SpheniscidaeEmperor();
    }
    
}
