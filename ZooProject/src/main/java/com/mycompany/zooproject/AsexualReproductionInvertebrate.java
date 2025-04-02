package com.mycompany.zooproject;

/**
 *
 * 
 */
public class AsexualReproductionInvertebrate implements ReproductionStrategyInvertebrate {
    @Override
    public Invertebrate reproduce(Invertebrate invertebrate) {
        return new ApisMiellifera("AsexualClone of " + invertebrate.getName());
    }
}
