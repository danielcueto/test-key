package com.mycompany.zooproject;

public interface ReproductionLogicFish {
    boolean canReproduceWith(Fish f1, Fish f2);
    Fish reproduce(Fish f1, Fish f2);
}
