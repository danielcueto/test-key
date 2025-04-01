package com.mycompany.zooproject;

public class Hippocampus extends Fish {
    private String color;
    private int age;

    public Hippocampus(String name, String gender, String type, String color, int age) {
        super(name, gender, type);
        this.color = color;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }
}
