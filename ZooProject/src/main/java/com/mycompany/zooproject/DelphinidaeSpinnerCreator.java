package com.mycompany.zooproject;

/**
 *
 * 
 */
public class DelphinidaeSpinnerCreator extends DelphinidaeFactory {

    @Override
    public Delphinidae createDelphindae() {
        return new DelphinidaeSpinner();
    }
    
}
