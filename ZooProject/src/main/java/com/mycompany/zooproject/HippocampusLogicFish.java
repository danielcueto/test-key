package com.mycompany.zooproject;

public class HippocampusLogicFish implements ReproductionLogicFish {
    @Override
    public boolean canReproduceWith(Fish f1, Fish f2) {
        return f1.getGender().equalsIgnoreCase("Male") && f2.getGender().equalsIgnoreCase("Female")
                && f1.getType().equalsIgnoreCase(f2.getType());
    }

    @Override
    public Hippocampus reproduce(Fish f1, Fish f2) {
        System.out.println("  Reproduction successful between " + f1.name + " and " + f2.name);
        return new Hippocampus("Baby", "Female", f1.getType(), "Green", 0);
    }
}
