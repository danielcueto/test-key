package com.mycompany.zooproject;

import java.util.Scanner;

/**
 * Clase principal del proyecto del zoológico.
 * Contiene el método main para ejecutar el programa.
 */
public class ZooProject {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear una instancia del zoológico
        Zoo myZoo = new Zoo();

        try {
            // Ejemplo de la adquisición de chiropteras
            ChiropteraFactory chiropteraFactory = new ChiropteraNormalCreator();
            myZoo.addMammal(chiropteraFactory.createChiroptera());
            chiropteraFactory = new ChiropteraAlbinoCreator();
            myZoo.addMammal(chiropteraFactory.createChiroptera());

            // Ejemplo de la adquisición de delphinidae
            DelphinidaeFactory delphinFactory = new DelphinidaeSpinnerCreator();
            myZoo.addMammal(delphinFactory.createDelphindae());
            delphinFactory = new DelphinidaeDuskyCreator();
            myZoo.addMammal(delphinFactory.createDelphindae());

            // Ejemplo de la adquisición de spheniscidae
            SpheniscidaeFactory spheniscidaeFactory = new SpheniscidaeKingCreator();
            myZoo.addBird(spheniscidaeFactory.createSpheniscidae());
            spheniscidaeFactory = new SpheniscidaeEmperorCreator();
            myZoo.addBird(spheniscidaeFactory.createSpheniscidae());
        } catch (IllegalArgumentException e) {
            System.err.println("Error al agregar un animal al zoológico: " + e.getMessage());
        }

        myZoo.listAllAnimals();
        System.out.println("------------------------");

        // Ejemplo de reproducción
        try {
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
        } catch (IllegalArgumentException e) {
            System.err.println("Error durante la reproducción de peces: " + e.getMessage());
        }

        try {
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
        } catch (IllegalArgumentException e) {
            System.err.println("Error durante la reproducción de invertebrados: " + e.getMessage());
        }

        scanner.close();
    }
}