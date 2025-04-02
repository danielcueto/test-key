package com.mycompany.zooproject;

/**
 * Represents an Invertebrate, a type of animal with no vertebral column.
 * This abstract class provides basic properties and behaviors common to all invertebrates,
 * including a name and a reproduction strategy.
 */
public abstract class Invertebrate {
    /**
     * The name of the invertebrate.
     */
    protected String name;

    /**
     * The reproduction strategy used by the invertebrate.
     */
    protected ReproductionStrategyInvertebrate strategy;

    /**
     * Constructs a new Invertebrate with the given name.
     *
     * @param name The name of the invertebrate.
     */
    public Invertebrate(String name) {
        this.name = name;
    }

    /**
     * Sets the reproduction strategy for this invertebrate.
     *
     * @param strategy The reproduction strategy to be used.
     */
    public void setStrategy(ReproductionStrategyInvertebrate strategy) {
        this.strategy = strategy;
    }

    /**
     * Performs the reproduction action using the current reproduction strategy.
     * Prints a message indicating the creation of offspring.
     */
    public void reproduce() {
        Invertebrate offspring = strategy.reproduce(this);
        System.out.println("🪲 Invertebrate offspring created: " + offspring.getName());
    }

    /**
     * Gets the name of the invertebrate.
     *
     * @return The name of the invertebrate.
     */
    public String getName() {
        return name;
    }
}