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
        ChiropteraFactory factory = new ChiropteraNormalCreator();
        sczZoo.AddMamal(factory.CreateChiroptera());
        factory = new ChiropteraAlbinoCreator();
        sczZoo.AddMamal(factory.CreateChiroptera());

        
    }
}
