package com.mycompany.zooproject;

/**
 *
 * 
 */
public class SpheniscidaeEmperorCreator extends SpheniscidaeFactory {

    @Override
    public Spheniscidae createSpheniscidae() {
        return new SpheniscidaeEmperor();
    }
    
}
