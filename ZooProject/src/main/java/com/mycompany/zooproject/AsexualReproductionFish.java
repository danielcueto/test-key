package com.mycompany.zooproject;

/**
 *
 * 
 */
public class AsexualReproductionFish implements ReproductionLogicFish {
    @Override
    public boolean canReproduceWith(Fish f1, Fish f2) {
        return f1.getGender().equalsIgnoreCase("Female");
    }

    @Override
    public Fish reproduce(Fish f1, Fish f2) {
        System.out.println("✅ Asexual reproduction of " + f1.name);
        return new Hippocampus("AsexualClone", f1.getGender(), f1.getType(), "Blue", 0);
    }
}