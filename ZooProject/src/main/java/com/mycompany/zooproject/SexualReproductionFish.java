package com.mycompany.zooproject;

public class SexualReproductionFish implements ReproductionLogicFish {
    @Override
    public boolean canReproduceWith(Fish f1, Fish f2) {
        return f1.getGender().equalsIgnoreCase("Male") && f2.getGender().equalsIgnoreCase("Female")
                && f1.getType().equalsIgnoreCase(f2.getType());
    }

    @Override
    public Fish reproduce(Fish f1, Fish f2) {
        System.out.println("✅ Sexual reproduction between " + f1.name + " and " + f2.name);
        return new Hippocampus("SexualBaby", "Female", f1.getType(), "Green", 0);
    }
}