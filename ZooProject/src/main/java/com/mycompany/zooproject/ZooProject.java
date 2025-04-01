/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zooproject;

/**
 *
 * @author daniel.cueto
 */
public class ZooProject {

    public static void main(String[] args) {
        Zoo sczZoo = new Zoo();
        ChiropteraFactory chiropteraFactory = new ChiropteraNormalCreator();
        sczZoo.AddMamal(chiropteraFactory.CreateChiroptera());
        chiropteraFactory = new ChiropteraAlbinoCreator();
        sczZoo.AddMamal(chiropteraFactory.CreateChiroptera());

        DelphinidaeFactory delphinFactory = new DelphinidaeSpinnerCreator();
        sczZoo.AddMamal(delphinFactory.CreateDelphindae());
        delphinFactory = new DelphinidaeDuskyCreator();
        sczZoo.AddMamal(delphinFactory.CreateDelphindae());
        
        SpheniscidaeFactory spheniscidaeFactory = new SpheniscidaeKingCreator();
        sczZoo.AddBird(spheniscidaeFactory.CreateSpheniscidae());
        spheniscidaeFactory = new SpheniscidaeEmperorCreator();
        sczZoo.AddBird(spheniscidaeFactory.CreateSpheniscidae());
        
        System.out.println(sczZoo.mamals.toString());
        
        System.out.println("------------------------");
        
        System.out.println(sczZoo.birds.toString());
        
    }
}
