package com.mycompany.zooproject;

/**
 *
 * 
 */
public class SpheniscidaeKingCreator extends SpheniscidaeFactory {

    @Override
    public Spheniscidae createSpheniscidae() {
        return new SpheniscidaeKing();
    }
    
}
