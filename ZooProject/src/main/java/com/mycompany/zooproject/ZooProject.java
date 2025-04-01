/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zooproject;

import java.util.Scanner;

/**
 *
 * @author daniel.cueto
 */

//Este es el metodo main
public class ZooProject {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        //Ejemplo de la adquisicion de chiropteras
        Zoo sczZoo = new Zoo();
        ChiropteraFactory chiropteraFactory = new ChiropteraNormalCreator();
        sczZoo.addMammal(chiropteraFactory.CreateChiroptera());
        chiropteraFactory = new ChiropteraAlbinoCreator();
        sczZoo.addMammal(chiropteraFactory.CreateChiroptera());

        DelphinidaeFactory delphinFactory = new DelphinidaeSpinnerCreator();
        sczZoo.addMammal(delphinFactory.CreateDelphindae());
        delphinFactory = new DelphinidaeDuskyCreator();
        sczZoo.addMammal(delphinFactory.CreateDelphindae());
        
        SpheniscidaeFactory spheniscidaeFactory = new SpheniscidaeKingCreator();
        sczZoo.addBird(spheniscidaeFactory.CreateSpheniscidae());
        spheniscidaeFactory = new SpheniscidaeEmperorCreator();
        sczZoo.addBird(spheniscidaeFactory.CreateSpheniscidae());
        
        System.out.println(sczZoo.mammals.toString());
        
        System.out.println("------------------------");
        
        System.out.println(sczZoo.birds.toString());
        
        
        
        //Ejemplo de las reproduccion
        
        
        // FISH input
        System.out.println("=== Fish Reproduction ===");
        System.out.print("Enter Male fish [name gender color age]: ");
        String name1 = scanner.next();
        String gender1 = scanner.next();
        String color1 = scanner.next();
        int age1 = scanner.nextInt();
        System.out.print("Enter Female fish [name gender color age]: ");
        String name2 = scanner.next();
        String gender2 = scanner.next();
        String color2 = scanner.next();
        int age2 = scanner.nextInt();
        Fish fish1 = FishFactory.createHippocampus(name1, gender1, color1, age1);
        Fish fish2 = FishFactory.createHippocampus(name2, gender2, color2, age2);
        ReproductionLogicFish sexual = new SexualReproductionFish();
        fish1.setLogic(sexual);
        fish2.setLogic(sexual);
        Fish sexualBaby = fish1.reproduceWith(fish2);
        if (sexualBaby != null) {
            System.out.println(":tada: Sexual Fish baby created: " + ((Hippocampus) sexualBaby).getName());
        }
        System.out.print("Enter a Female fish name for Asexual reproduction: ");
        String soloName = scanner.next();
        Fish solo = FishFactory.createHippocampus(soloName, "Female", "Silver", 4);
        ReproductionLogicFish asexual = new AsexualReproductionFish();
        solo.setLogic(asexual);
        Fish asexualClone = solo.reproduceWith(null);
        if (asexualClone != null) {
            System.out.println(":tada: Asexual Fish clone created: " + ((Hippocampus) asexualClone).getName());
        }
        
        
        // INVERTEBRATE input
        System.out.println("\n=== Invertebrate Reproduction ===");
        System.out.print("Enter Invertebrate name: ");
        String invName = scanner.next();
        System.out.print("Enter reproduction type (sexual/asexual): ");
        String reproType = scanner.next();
        Invertebrate inv = new ApisMiellifera(invName);
        if (reproType.equalsIgnoreCase("sexual")) {
            inv.setStrategy(new SexualReproductionInvertebrate());
        } else {
            inv.setStrategy(new AsexualReproductionInvertebrate());
        }
        inv.reproduce();
    }
}
