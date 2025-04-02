package com.mycompany.zooproject;

/**
 * Represents a sea horse (Hippocampus), a type of marine creature sometimes
 * considered a fish.
 * Thus the class extends the {@link Fish} class and provides
 * specific implementations for sea horses.
 */
public class Hippocampus extends Fish {

    private String color;
    private int age;

    /**
     * Constructs a new Hippocampus (sea horse) with the given name, gender, type, color and age.
     *
     * @param name The name of the sea horse.
     * @param gender The gender of the sea horse.
     * @param type The type of fish the sea horse belongs, in this case "Hippocampus".
     * @param color The color of the sea horse.
     * @param age The age of the sea horse.
     */
    public Hippocampus(String name, String gender, String type, String color, int age) {
        super(name, gender, type);
        this.color = color;
        this.age = age;
    }

    /**
     * Gets the name of the sea horse.
     *
     * @return The name of the sea horse.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the color of the sea horse.
     *
     * @return The color of the sea horse.
     */
    public String getColor() {
        return color;
    }

    /**
     * Gets the age of the sea horse.
     *
     * @return The age of the sea horse.
     */
    public int getAge() {
        return age;
    }
}
