package com.mycompany.zooproject;

/**
 *
 * 
 */
public class ChiropteraNormalCreator extends ChiropteraFactory {

    @Override
    public Chiroptera createChiroptera() {
        return new ChiropteraNormal();
    }
    
}
