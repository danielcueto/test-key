package com.mycompany.zooproject;

/**
 *
 * 
 */
public class ChiropteraAlbinoCreator extends ChiropteraFactory {

    @Override
    public Chiroptera createChiroptera() {
        return new ChiropteraAlbino();
    }
    
}
