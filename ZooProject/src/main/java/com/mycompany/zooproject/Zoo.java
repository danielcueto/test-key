/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel.cueto
 */
public class Zoo {
    List<Mammal> mammals = new LinkedList<>();
    List<Fish> fishes = new LinkedList<>();
    List<Invertebrate> invertebrates = new LinkedList<>();

    public void addMammal(Mammal mammal) {
        mammals.add(mammal);
    }

    public void addFish(Fish fish) {
        fishes.add(fish);
    }

    public void addInvertebrate(Invertebrate invertebrate) {
        invertebrates.add(invertebrate);
    }

    public static void main(String[] args) {
        Fish male = FishFactory.createHippocampus("Hippocampus-M", "Male", "Blue", 3);
        Fish female = FishFactory.createHippocampus("Hippocampus-F", "Female", "Pink", 2);
        ReproductionLogicFish sexual = new SexualReproductionFish();
        male.setLogic(sexual);
        female.setLogic(sexual);
        Fish sexualBaby = male.reproduceWith(female);
        if (sexualBaby != null) {
            System.out.println("🎉 Sexual Fish baby created: " + ((Hippocampus) sexualBaby).getName());
        }
        Fish solo = FishFactory.createHippocampus("Hippocampus-Solo", "Female", "Silver", 4);
        ReproductionLogicFish asexual = new AsexualReproductionFish();
        solo.setLogic(asexual);
        Fish asexualClone = solo.reproduceWith(null);
        if (asexualClone != null) {
            System.out.println("🎉 Asexual Fish clone created: " + ((Hippocampus) asexualClone).getName());
        }
        Invertebrate bee = new ApisMiellifera("Queen Bee");
        bee.setStrategy(new SexualReproductionInvertebrate());
        bee.reproduce();

        Invertebrate cloneBee = new ApisMiellifera("Worker Bee");
        cloneBee.setStrategy(new AsexualReproductionInvertebrate());
        cloneBee.reproduce();
    }
} 