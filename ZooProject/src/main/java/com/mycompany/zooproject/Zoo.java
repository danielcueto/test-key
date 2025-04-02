package com.mycompany.zooproject;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * 
 */
public class Zoo {
    List<Mammal> mammals = new LinkedList<>();
    List<Fish> fishes = new LinkedList<>();
    List<Invertebrate> invertebrates = new LinkedList<>();
    List<Bird> birds = new LinkedList<>();

    public void addMammal(Mammal mammal) {
        mammals.add(mammal);
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }
    
    public void addBird(Bird bird) {
        birds.add(bird);
    }

    public void addInvertebrate(Invertebrate invertebrate) {
        invertebrates.add(invertebrate);
    }
} 