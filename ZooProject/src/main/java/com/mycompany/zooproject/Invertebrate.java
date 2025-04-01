package com.mycompany.zooproject;

public abstract class Invertebrate {
    protected String name;
    protected ReproductionStrategyInvertebrate strategy;

    public Invertebrate(String name) {
        this.name = name;
    }

    public void setStrategy(ReproductionStrategyInvertebrate strategy) {
        this.strategy = strategy;
    }

    public void reproduce() {
        Invertebrate offspring = strategy.reproduce(this);
        System.out.println("🪲 Invertebrate offspring created: " + offspring.getName());
    }

    public String getName() {
        return name;
    }
}
