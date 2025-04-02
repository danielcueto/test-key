package com.mycompany.zooproject;

/**
 *
 * 
 */
public class AsexualReproductionFish implements ReproductionLogicFish {
    @Override
    public boolean canReproduceWith(Fish fish1, Fish fish2) {
        return fish1.getGender().equalsIgnoreCase("Female");
    }

    @Override
    public Fish reproduce(Fish fish1, Fish fish2) {
        System.out.println("✅ Asexual reproduction of " + fish1.name);
        return new Hippocampus("AsexualClone", fish1.getGender(), fish1.getType(), "Blue", 0);
    }
}