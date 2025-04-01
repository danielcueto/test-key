package com.mycompany.zooproject;


public class SexualReproductionInvertebrate implements ReproductionStrategyInvertebrate {

    @Override
    public void Inverterbrate reproduce(Invertebrate inverterbrate) {
        return new ApisMielifera("SexualOffspring of " + inverterbrate.getName());
    }
    
}
