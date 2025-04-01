package com.mycompany.zooproject;


public class SexualReproductionInvertebrate implements ReproductionStrategyInvertebrate {
    @Override
    public Invertebrate reproduce(Invertebrate invertebrate) {
        return new ApisMiellifera("SexualOffspring of " + invertebrate.getName());
    }
}
