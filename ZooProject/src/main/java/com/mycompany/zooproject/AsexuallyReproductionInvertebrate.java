package com.mycompany.zooproject;

public class AsexuallyReproductionInvertebrate implements ReproductionStrategyInvertebrate{

    @Override
    public Invertebrate reproduce(Invertebrate inverterbrate) {
        return new ApisMielifera("Asexual clone of " + invertebrate.getName())
 
    }
    
}
