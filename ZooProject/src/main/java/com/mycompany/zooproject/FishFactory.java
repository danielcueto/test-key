package com.mycompany.zooproject;

public class FishFactory {
    public static Hippocampus createHippocampus(String name, String gender, String color, int age) {
       return new Hippocampus(name, gender, "Hippocampus", color, age);
    }
    
}
