package com.mycompany.zooproject;

public interface ReproductionLogicFish {
    
    boolean canReproduceWith(Fish f1, Fish f2);
    Hippocampus reproduce(Fish f1, Fish f2);
}
